package com.ocean.core.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 表实体
 */
public class Table implements Serializable {

    //数据库
    private String db;

    //表名
    private String name;

    //逻辑名
    private String logicName;

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogicName() {
        return logicName;
    }

    public void setLogicName(String logicName) {
        this.logicName = logicName;
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
