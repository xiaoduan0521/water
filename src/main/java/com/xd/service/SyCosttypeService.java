package com.xd.service;

import com.xd.entity.SyCosttype;

public interface SyCosttypeService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_costtype
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_costtype
     *
     * @mbggenerated
     */
    int insert(SyCosttype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_costtype
     *
     * @mbggenerated
     */
    int insertSelective(SyCosttype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_costtype
     *
     * @mbggenerated
     */
    SyCosttype selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_costtype
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SyCosttype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sy_costtype
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SyCosttype record);
}
