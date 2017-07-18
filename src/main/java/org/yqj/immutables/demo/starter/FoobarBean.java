package org.yqj.immutables.demo.starter;

import org.immutables.value.Value;

import java.util.Date;

/**
 * Created by yaoqijun on 2017/7/19.
 */
@Value.Immutable
public class FoobarBean {

    private Integer id;

    private String name;

    private Date lastUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
