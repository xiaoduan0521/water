package com.xd.mapper;

import com.xd.entity.BeOrderlite;

public interface BeOrderliteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderlite
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderlite
     *
     * @mbggenerated
     */
    int insert(BeOrderlite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderlite
     *
     * @mbggenerated
     */
    int insertSelective(BeOrderlite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderlite
     *
     * @mbggenerated
     */
    BeOrderlite selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderlite
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BeOrderlite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_orderlite
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BeOrderlite record);
}