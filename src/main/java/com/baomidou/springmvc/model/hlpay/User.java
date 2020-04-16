package com.baomidou.springmvc.model.hlpay;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 *  互联用户表
 */
@TableName("hlpay_user")
public class User implements Serializable {

    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 认证状态: 0 未认证 1 部分认证 3 全部认证
     */
    private Integer state;

    public User(Long id, String name, Integer state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", state=" + state +
                '}';
    }
}
