package com.xd.mapper;

import com.xd.entity.BeOrderuser;

public interface BeOrderuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderuser
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderuser
     *
     * @mbggenerated
     */
    int insert(BeOrderuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderuser
     *
     * @mbggenerated
     */
    int insertSelective(BeOrderuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderuser
     *
     * @mbggenerated
     */
    BeOrderuser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderuser
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BeOrderuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderuser
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BeOrderuser record);
}