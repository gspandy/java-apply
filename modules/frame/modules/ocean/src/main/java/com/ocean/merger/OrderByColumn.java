package com.ocean.merger;

import com.alibaba.druid.sql.ast.SQLOrderingSpecification;
import com.google.common.base.Optional;

/**
 * 排序列对象
 */
public class OrderByColumn {

    private Optional<String> name;

    private Optional<Integer> index;

    private OrderByType orderByType;

    public OrderByColumn(String name, OrderByType orderByType) {
        this(Optional.of(name), Optional.<Integer>absent(), orderByType);
    }

    public OrderByColumn(int index, OrderByType orderByType) {
        this(Optional.<String>absent(), Optional.of(index), orderByType);
    }

    public OrderByColumn(Optional<String> name, Optional<Integer> index,OrderByType orderByType)
    {
        this.name=name;
        this.index=index;
        this.orderByType=orderByType;
    }

    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public Optional<Integer> getIndex() {
        return index;
    }

    public void setIndex(Optional<Integer> index) {
        this.index = index;
    }

    public OrderByType getOrderByType() {
        return orderByType;
    }

    public void setOrderByType(OrderByType orderByType) {
        this.orderByType = orderByType;
    }

    /**
     * 排序类型
     */
    public enum OrderByType {
        ASC,
        DESC;

        /**
         * 适配Druid的枚举类型
         * @param sqlOrderingSpecification Druid的枚举类型
         */
        public static OrderByType valueOf(final SQLOrderingSpecification sqlOrderingSpecification) {
            return OrderByType.valueOf(sqlOrderingSpecification.name());
        }
    }
}
