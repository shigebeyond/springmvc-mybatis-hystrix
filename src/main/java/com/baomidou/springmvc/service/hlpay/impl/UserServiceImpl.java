package com.baomidou.springmvc.service.hlpay.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.springmvc.mapper.hlpay.UserMapper;
import com.baomidou.springmvc.model.hlpay.User;
import com.baomidou.springmvc.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Future;

/**
 * User 表数据服务层接口实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /*public User find(Long id) {
        return selectById(id);
    }*/

    @HystrixCollapser(batchMethod = "findAll", scope = com.netflix.hystrix.HystrixCollapser.Scope.GLOBAL,
            collapserProperties = {@HystrixProperty(name = "timerDelayInMilliseconds", value = "100")})
    public Future<User> find(Long id) {
        throw new RuntimeException("This method body should not be executed");
    }

    @HystrixCommand
    public List<User> findAll(List<Long> ids) {
        System.out.println("calll batch method: findAll(" + ids + ")");
        EntityWrapper<User> ew = new EntityWrapper<User>();
        ew.in("id", ids);
        List<User> users = selectList(ew);
        return users;
    }

}