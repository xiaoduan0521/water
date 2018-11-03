package com.xd.controller;

import com.xd.entity.SyEmp;
import com.xd.service.SyDeptService;
import com.xd.service.SyEmpService;
import com.xd.service.SyMenuService;
import com.xd.util.Md5Util;
import com.xd.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/syEmp")
public class SyEmpController {
    private static final String SUPER_NAME = "root";
    private static String SUPER_PASSWORD = "63a9f0ea7bb98050796b649e85481845";

    @Autowired
    @Qualifier("SyEmp")
    private SyEmpService ses;

    @Autowired
    @Qualifier("SyMenu")
    private SyMenuService sms;

    @Autowired
    @Qualifier("SyDept")
    private SyDeptService sds;

    private Md5Util md5 = new Md5Util();
    /**
     * 登录
     * @param emp
     * @return
     */
    @RequestMapping("/login")
    public String login(SyEmp emp,Map<String,Object> map,HttpServletRequest request){
        SyEmp syEmp = emp;
        System.out.println(syEmp+"正在尝试登录本系统");
        //判断Session中是否存登录过的员工对象
        if(request.getSession().getAttribute("syEmp")!=null){
            return "workspace";
        }
        //非空验证
        if(syEmp.getEmpno() != null && syEmp.getPwd() !=null ){
            try {
                //md5加密
                emp.setPwd(md5.encodeByMd5(emp.getPwd()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            //判断是不是超级管理员
            if(emp.getEmpno().equals(SUPER_NAME) && emp.getPwd().equals(SUPER_PASSWORD)){
                syEmp.setEmpname("超级管理员");
                syEmp.setId(0);
                syEmp.setSyMenuList(sms.selectAll());
                request.getSession().setAttribute("syEmp",syEmp);
                return "workspace";
            }
            //数据库查询登录
            Map<String,String> loginMap = new HashMap<String, String>();
            loginMap.put("empno",emp.getEmpno());
            loginMap.put("pwd",emp.getPwd());
            syEmp = ses.login(loginMap);
            if (syEmp!=null){
                request.getSession().setAttribute("syEmp",syEmp);
                return "workspace";
            } else {
                map.put("text","员工工号或密码错误！");
                map.put("location","/syEmp/login");
                return "zt";
            }
        }
        return "login";
    }

    /**
     * 退出登录
     * @param request
     * @return
     */
    @RequestMapping("/loginOut")
    public ModelAndView loginOut(HttpServletRequest request){
        System.out.println(((SyEmp)request.getSession().getAttribute("syEmp"))+"正在退出当前系统！");
        request.getSession().removeAttribute("syEmp");
        return new ModelAndView("redirect:login");
    }

    /**
     * 修改密码
     * @param request
     * @param emp
     * @return
     */
    @RequestMapping("/updatePwd")
    public String updatePwd(HttpServletRequest request,SyEmp emp,Map<String,Object> map,String oldPwd) throws Exception {
        SyEmp syEmp =(SyEmp)request.getSession().getAttribute("syEmp");
        System.out.println(syEmp+"正在修改密码！");
        String text = "密码修改失败！";
        String location = "/templates?tp=page/sys_pwd";
        oldPwd = md5.encodeByMd5(oldPwd);
        //判断旧密码是否相同
        if (!oldPwd.equals(syEmp.getPwd())){
            text = "旧密码错误！";
        } else {
            try {
                syEmp.setPwd(md5.encodeByMd5(emp.getPwd()));
                if (syEmp.getId()==0){
                    SUPER_PASSWORD = syEmp.getPwd();
                } else {
                    ses.updateByPrimaryKeySelective(syEmp);
                }
                text = "密码修改成功！";
                location = "/syEmp/login";
                request.getSession().setAttribute("syEmp",syEmp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        map.put("text",text);
        map.put("location",location);
        return "zt";
    }

    /**
     *  高级分页查询用户
     * @param emp
     * @param page
     * @param pageSize
     * @param map
     * @return
     */
    @RequestMapping("/selectByPageAll")
    public String selectByPageAll(SyEmp emp,Integer page,Integer pageSize,Map<String,Object> map){
        int pageNum = 1;
        if(page!=null){
            pageNum =page;
        }
        int pageSizeNum = 10;
        if(pageSize!=null){
            pageSizeNum = pageSize;
        }
        Map<String,Object> pageMap = new HashMap<String, Object>();
        pageMap.put("emp",emp);
        int count = ses.getPageCount(pageMap);
        PageUtil pu = new PageUtil(pageNum,pageSizeNum,count);
        pageMap.put("start",pu.getMySqlStart());
        pageMap.put("pageSize",pageSizeNum);
        List<SyEmp> list = ses.selectByPageAll(pageMap);
        map.put("list",list);
        map.put("syDeptList",sds.selectByDisabledToSelect());
        return "page/sys_emp";
    }
}