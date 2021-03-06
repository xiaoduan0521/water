package com.xd.mapper;

import com.xd.entity.SyDept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SyDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_dept
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_dept
     *
     * @mbggenerated
     */
    int insert(SyDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_dept
     *
     * @mbggenerated
     */
    int insertSelective(SyDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_dept
     *
     * @mbggenerated
     */
    SyDept selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_dept
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SyDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_dept
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SyDept record);

    List<SyDept> selectAll();

    List<SyDept> selectByDisabledToSelect();
}