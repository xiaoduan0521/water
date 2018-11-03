package com.xd.mapper;

import com.xd.entity.SyEmp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SyEmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated
     */
    int insert(SyEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated
     */
    int insertSelective(SyEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated
     */
    SyEmp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SyEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_emp
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SyEmp record);

    SyEmp login(Map<String,String> map);

    List<SyEmp> selectByPageAll(Map<String,Object> map);

    int getPageCount(Map<String,Object> map);
}