package com.xd.mapper;

import com.xd.entity.BeOrder;

public interface BeOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_order
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String orderno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_order
     *
     * @mbggenerated
     */
    int insert(BeOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_order
     *
     * @mbggenerated
     */
    int insertSelective(BeOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_order
     *
     * @mbggenerated
     */
    BeOrder selectByPrimaryKey(String orderno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BeOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BeOrder record);
}