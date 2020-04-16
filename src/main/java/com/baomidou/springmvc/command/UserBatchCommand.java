package com.baomidou.springmvc.command;

import com.baomidou.springmvc.model.hlpay.User;
import com.baomidou.springmvc.service.UserService;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by lisen on 2017/12/27.
 */
public class UserBatchCommand extends HystrixCommand<List<User>> {

    UserService userService;

    List<Long> userIds;

    public UserBatchCommand(UserService userService, List<Long> userIds) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExampleGroup")).
                andCommandKey(HystrixCommandKey.Factory.asKey("GetValueForKey")));
        this.userService = userService;
        this.userIds = userIds;
    }

    @Override
    protected List<User> run() throws Exception {
        return userService.findAll(userIds);
    }

    @Override
    protected List<User> getFallback() {
        List<User> users = new ArrayList<User>();
        users.add(new User(0L, "unkow", 0));
        return new ArrayList<User>(users);
    }
}
