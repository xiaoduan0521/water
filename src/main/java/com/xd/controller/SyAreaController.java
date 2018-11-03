package com.xd.controller;

import com.xd.entity.SyArea;
import com.xd.service.SyAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/syArea")
public class SyAreaController {

    @Autowired
    @Qualifier("SyArea")
    private SyAreaService sas;

    /**
     * 添加
     * @param area
     * @param map
     * @return
     */
    @RequestMapping("/insert")
    public String insert(SyArea area,Map<String,Object> map){
        String text = "添加失败！";
        System.out.println(area);
        try {
            area.setDisabled(false);
            int result = sas.insert(area);
            if (result>0){
                text ="添加成功！";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("text",text);
        map.put("location","/syArea/selectAll");
        return "zt";
    }

    /**
     * 根据id修改其状态
     * @param area
     * @return
     */
    @RequestMapping("/updateDel")
    public ModelAndView updateDel(SyArea area){
        try {
            area.setDisabled(true);
            sas.updateByPrimaryKeySelective(area);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView("redirect:selectAll");
    }

    /**
     * 查询全部抄表辖区
     * @param map
     * @return
     */
    @RequestMapping("/selectAll")
    public String selectAll(Map<String,Object> map){
        try {
            map.put("list",sas.selectAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/sys_area";
    }


    /**
     * 根据id查询抄表辖区
     * @param id
     * @param map
     * @return
     */
    @RequestMapping("/selectById")
    public String selectById(Integer id,Map<String,Object> map){
        try {
            map.put("syArea",sas.selectByPrimaryKey(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/sys_area_add";
    }

    /**
     * 修改抄表辖区信息
     * @param area
     * @param map
     * @return
     */
    @RequestMapping("/update")
    public String updateByPrimaryKeySelective(SyArea area,Map<String,Object> map){
        String text = "修改失败！";
        try {
            int result = sas.updateByPrimaryKeySelective(area);
            if (result>0){
                text = "修改成功！";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("text",text);
        map.put("location","/syArea/selectAll");
        return "zt";
    }

}
