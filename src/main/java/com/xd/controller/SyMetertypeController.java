package com.xd.controller;

import com.xd.entity.SyMetertype;
import com.xd.service.SyMetertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/syMetertype")
public class SyMetertypeController {
    @Autowired
    @Qualifier("SyMetertype")
    private SyMetertypeService sms;

    /**
     * 查询全部水表型号
     * @param map
     * @return
     */
    @RequestMapping("/selectAll")
    public String selectAll(Map<String,Object> map){
        try {
            map.put("list",sms.selectAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/page/sys_meterType";
    }

    /**
     * 添加水管型号
     * @param metertype
     * @param map
     * @return
     */
    @RequestMapping("/insert")
    public String insert(SyMetertype metertype,Map<String,Object> map){
        String text = "添加失败！";
        try {
            metertype.setDisabled(false);
            int result = sms.insertSelective(metertype);
            if (result>0){
                text ="添加成功！";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("text",text);
        map.put("location","/syMetertype/selectAll");
        return "/zt";
    }

    /**
     * 修改状态为删除
     * @param metertype
     * @return
     */
    @RequestMapping("/updateDel")
    public ModelAndView updateDel(SyMetertype metertype){
        try {
            metertype.setDisabled(true);
            sms.updateByPrimaryKeySelective(metertype);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView("redirect:selectAll");
    }

    /**
     * 根据id查询水管型号
     * @param id
     * @param map
     * @return
     */
    @RequestMapping("/selectById")
    public String selectById(Integer id,Map<String,Object> map){
        try {
            map.put("syMetertype",sms.selectByPrimaryKey(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/page/sys_meterType_add";
    }

    /**
     * 修改水表型号
     * @param metertype
     * @param map
     * @return
     */
    @RequestMapping("/update")
    public String update(SyMetertype metertype,Map<String,Object> map){
        String text = "修改失败!";
        try {
            int result = sms.updateByPrimaryKeySelective(metertype);
            if(result>0){
                text = "修改成功"+"！";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("text",text);
        map.put("location","/syMetertype/selectAll");
        return "/zt";
    }

    @RequestMapping("/selectOnSelect")
    public String selectOnSelect(String url,Map<String,Object> map){
        map.put("mts",sms.selectByDisabledYes());
        return url;
    }
}
