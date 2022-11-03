package com.chen.doamin;

import java.util.Date;

public class Account {

    private Integer id;
    private String name;
    private Double money;

    private Date createTime;

    public Account() {
    }

    public Account(Integer id, String name, Double money, Date createTime) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String toString() {
        return "Account{id = " + id + ", name = " + name + ", money = " + money + ", createTime = " + createTime + "}";
    }
}
