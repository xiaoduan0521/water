package com.xd.mapper;

import com.xd.entity.BeComment;

public interface BeCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_comment
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_comment
     *
     * @mbggenerated
     */
    int insert(BeComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_comment
     *
     * @mbggenerated
     */
    int insertSelective(BeComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_comment
     *
     * @mbggenerated
     */
    BeComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_comment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BeComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table be_comment
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BeComment record);
}