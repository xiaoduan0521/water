package com.xd.controller;

import com.xd.entity.SyDept;
import com.xd.service.SyDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/syDept")
public class SyDeptController {
    @Autowired
    @Qualifier("SyDept")
    private SyDeptService sds;

    /**
     * 添加部门
     * @param dept
     * @param map
     * @return
     */
    @RequestMapping("/insert")
    public String insert(SyDept dept , Map<String,Object> map){
        String text = "添加失败！";
        try {
            dept.setDisabled(false);
            int result = sds.insert(dept);
            if(result>0){
                text = "添加成功!";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        map.put("text",text);
        map.put("location","/syDept/selectAll");
        return "/zt";
    }

    /**
     * 修改部门状态为删除
     * @param dept
     * @return
     */
    @RequestMapping("/updateDel")
    public ModelAndView updateDel( SyDept dept){
        try {
            dept.setDisabled(true);
            sds.updateByPrimaryKeySelective(dept);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView("redirect:selectAll");
    }

    /**
     * 根据id查询部门信息
     * @param id
     * @param map
     * @return
     */
    @RequestMapping("/selectById")
    public String selectById(Integer id ,Map<String,Object> map){
        try {
            map.put("syDept",sds.selectByPrimaryKey(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/page/sys_dept_add";
    }

    /**
     * 修改部门信息
     * @param dept
     * @param map
     * @return
     */
    @RequestMapping("/update")
    public String update(SyDept dept,Map<String,Object> map){
        String text = "修改失败!";
        try {
            int result = sds.updateByPrimaryKeySelective(dept);
            if (result>0){
                text = "修改成功!";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("text",text);
        map.put("location","/syDept/selectAll");
        return "/zt";
    }

    /**
     * 查询全部部门
     * @param map
     * @return
     */
    @RequestMapping("/selectAll")
    public String selectAll(Map<String,Object> map){
        try {
            map.put("list",sds.selectAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/page/sys_dept";
    }

}
