package com.manageplat.model.pojo;

public class TyEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ty_entity.id
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ty_entity.name
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ty_entity.table_name
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    private String tableName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ty_entity.query_sql
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    private String querySql;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ty_entity.page_size
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    private Integer pageSize;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ty_entity.id
     *
     * @return the value of ty_entity.id
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ty_entity.id
     *
     * @param id the value for ty_entity.id
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ty_entity.name
     *
     * @return the value of ty_entity.name
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ty_entity.name
     *
     * @param name the value for ty_entity.name
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ty_entity.table_name
     *
     * @return the value of ty_entity.table_name
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ty_entity.table_name
     *
     * @param tableName the value for ty_entity.table_name
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ty_entity.query_sql
     *
     * @return the value of ty_entity.query_sql
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    public String getQuerySql() {
        return querySql;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ty_entity.query_sql
     *
     * @param querySql the value for ty_entity.query_sql
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    public void setQuerySql(String querySql) {
        this.querySql = querySql == null ? null : querySql.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ty_entity.page_size
     *
     * @return the value of ty_entity.page_size
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ty_entity.page_size
     *
     * @param pageSize the value for ty_entity.page_size
     *
     * @mbggenerated Fri Sep 18 15:50:53 CST 2015
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}