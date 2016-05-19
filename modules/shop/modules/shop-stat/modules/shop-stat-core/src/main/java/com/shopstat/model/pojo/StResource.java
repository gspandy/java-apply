package com.shopstat.model.pojo;

public class StResource {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column st_resource.id
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column st_resource.name
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column st_resource.path
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column st_resource.parent_id
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column st_resource.is_show
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    private Integer isShow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column st_resource.is_menu
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    private Integer isMenu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column st_resource.tag
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    private String tag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column st_resource.id
     *
     * @return the value of st_resource.id
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column st_resource.id
     *
     * @param id the value for st_resource.id
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column st_resource.name
     *
     * @return the value of st_resource.name
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column st_resource.name
     *
     * @param name the value for st_resource.name
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column st_resource.path
     *
     * @return the value of st_resource.path
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column st_resource.path
     *
     * @param path the value for st_resource.path
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column st_resource.parent_id
     *
     * @return the value of st_resource.parent_id
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column st_resource.parent_id
     *
     * @param parentId the value for st_resource.parent_id
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column st_resource.is_show
     *
     * @return the value of st_resource.is_show
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column st_resource.is_show
     *
     * @param isShow the value for st_resource.is_show
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column st_resource.is_menu
     *
     * @return the value of st_resource.is_menu
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public Integer getIsMenu() {
        return isMenu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column st_resource.is_menu
     *
     * @param isMenu the value for st_resource.is_menu
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public void setIsMenu(Integer isMenu) {
        this.isMenu = isMenu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column st_resource.tag
     *
     * @return the value of st_resource.tag
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column st_resource.tag
     *
     * @param tag the value for st_resource.tag
     *
     * @mbggenerated Sun May 15 22:07:15 CST 2016
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }
}