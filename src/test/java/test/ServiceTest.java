package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baomidou.springmvc.model.hlpay.User;
import com.baomidou.springmvc.service.UserService;
import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect; //导入依赖的package包/类

/**
 * <p>
 * </p>
 *
 * @author yuxiaobin
 * @date 2018/5/3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class ServiceTest {

    @Bean
    public HystrixCommandAspect hystrixAspect(){
        return new HystrixCommandAspect();
    }

    @Autowired
    UserService userService;

    @Test
    public void testFind() throws ExecutionException, InterruptedException {
        Future<User> user1 = userService.find(1L);
        Future<User> user2 = userService.find(2L);
        System.out.println(user1.get());
        System.out.println(user2.get());
    }

    @Test
    public void testFindAll() throws ExecutionException, InterruptedException {
        List<Long> ids = new ArrayList();
        ids.add(1L);
        List<User> users = userService.findAll(ids);
        for(User user: users)
            System.out.println(user);
    }
}
