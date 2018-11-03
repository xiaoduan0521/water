package com.xd.entity;

public class SyDept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_dept.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_dept.DeptName
     *
     * @mbggenerated
     */
    private String deptname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_dept.Remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_dept.Disabled
     *
     * @mbggenerated
     */
    private Boolean disabled;

    @Override
    public String toString() {
        return "SyDept{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                ", remark='" + remark + '\'' +
                ", disabled=" + disabled +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_dept.ID
     *
     * @return the value of sy_dept.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_dept.ID
     *
     * @param id the value for sy_dept.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_dept.DeptName
     *
     * @return the value of sy_dept.DeptName
     *
     * @mbggenerated
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_dept.DeptName
     *
     * @param deptname the value for sy_dept.DeptName
     *
     * @mbggenerated
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_dept.Remark
     *
     * @return the value of sy_dept.Remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_dept.Remark
     *
     * @param remark the value for sy_dept.Remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_dept.Disabled
     *
     * @return the value of sy_dept.Disabled
     *
     * @mbggenerated
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_dept.Disabled
     *
     * @param disabled the value for sy_dept.Disabled
     *
     * @mbggenerated
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }
}