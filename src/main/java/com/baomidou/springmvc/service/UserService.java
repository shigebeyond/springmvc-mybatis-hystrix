package com.baomidou.springmvc.service;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.springmvc.model.hlpay.User;

import java.util.List;
import java.util.concurrent.Future;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface UserService extends IService<User> {

    public Future<User> find(Long id);

    public List<User> findAll(List<Long> ids);
}