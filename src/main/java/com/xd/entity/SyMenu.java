package com.xd.entity;

public class SyMenu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_menu.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_menu.MenuName
     *
     * @mbggenerated
     */
    private String menuname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_menu.Parent
     *
     * @mbggenerated
     */
    private Integer parent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_menu.Url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_menu.OnClick
     *
     * @mbggenerated
     */
    private String onclick;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_menu.Icon
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_menu.OrderIndex
     *
     * @mbggenerated
     */
    private Integer orderindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_menu.FlowID
     *
     * @mbggenerated
     */
    private Integer flowid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sy_menu.Disabled
     *
     * @mbggenerated
     */
    private Boolean disabled;

    @Override
    public String toString() {
        return "SyMenu{" +
                "id=" + id +
                ", menuname='" + menuname + '\'' +
                ", parent=" + parent +
                ", url='" + url + '\'' +
                ", onclick='" + onclick + '\'' +
                ", icon='" + icon + '\'' +
                ", orderindex=" + orderindex +
                ", flowid=" + flowid +
                ", disabled=" + disabled +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_menu.ID
     *
     * @return the value of sy_menu.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_menu.ID
     *
     * @param id the value for sy_menu.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_menu.MenuName
     *
     * @return the value of sy_menu.MenuName
     *
     * @mbggenerated
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_menu.MenuName
     *
     * @param menuname the value for sy_menu.MenuName
     *
     * @mbggenerated
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_menu.Parent
     *
     * @return the value of sy_menu.Parent
     *
     * @mbggenerated
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_menu.Parent
     *
     * @param parent the value for sy_menu.Parent
     *
     * @mbggenerated
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_menu.Url
     *
     * @return the value of sy_menu.Url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_menu.Url
     *
     * @param url the value for sy_menu.Url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_menu.OnClick
     *
     * @return the value of sy_menu.OnClick
     *
     * @mbggenerated
     */
    public String getOnclick() {
        return onclick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_menu.OnClick
     *
     * @param onclick the value for sy_menu.OnClick
     *
     * @mbggenerated
     */
    public void setOnclick(String onclick) {
        this.onclick = onclick == null ? null : onclick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_menu.Icon
     *
     * @return the value of sy_menu.Icon
     *
     * @mbggenerated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_menu.Icon
     *
     * @param icon the value for sy_menu.Icon
     *
     * @mbggenerated
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_menu.OrderIndex
     *
     * @return the value of sy_menu.OrderIndex
     *
     * @mbggenerated
     */
    public Integer getOrderindex() {
        return orderindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_menu.OrderIndex
     *
     * @param orderindex the value for sy_menu.OrderIndex
     *
     * @mbggenerated
     */
    public void setOrderindex(Integer orderindex) {
        this.orderindex = orderindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_menu.FlowID
     *
     * @return the value of sy_menu.FlowID
     *
     * @mbggenerated
     */
    public Integer getFlowid() {
        return flowid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_menu.FlowID
     *
     * @param flowid the value for sy_menu.FlowID
     *
     * @mbggenerated
     */
    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sy_menu.Disabled
     *
     * @return the value of sy_menu.Disabled
     *
     * @mbggenerated
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sy_menu.Disabled
     *
     * @param disabled the value for sy_menu.Disabled
     *
     * @mbggenerated
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }
}