package com.xd.mapper;

import com.xd.entity.BeFlow;

public interface BeFlowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_flow
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_flow
     *
     * @mbggenerated
     */
    int insert(BeFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_flow
     *
     * @mbggenerated
     */
    int insertSelective(BeFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_flow
     *
     * @mbggenerated
     */
    BeFlow selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_flow
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BeFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_flow
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BeFlow record);
}