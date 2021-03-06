package com.xd.mapper;

import com.xd.entity.SyMetertype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SyMetertypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_metertype
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_metertype
     *
     * @mbggenerated
     */
    int insert(SyMetertype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_metertype
     *
     * @mbggenerated
     */
    int insertSelective(SyMetertype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_metertype
     *
     * @mbggenerated
     */
    SyMetertype selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_metertype
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SyMetertype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_metertype
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SyMetertype record);

    List<SyMetertype> selectAll();

    List<SyMetertype> selectByDisabledYes();
}