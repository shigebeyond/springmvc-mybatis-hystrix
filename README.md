# springmvc+mybatis+hystrix demo

spring mvc 结合 mybatisplus 与 HystrixCollapser 的示例代码

参考2个项目:
1. [mybatisplus demo](https://gitee.com/baomidou/mybatisplus-spring-mvc)
2. [hystrix demo](https://gitee.com/huayicompany/Hystrix-learn.git)

运行方法：

1. 建立数据库，导入SQL（在resources的doc中）。
2. 引入本Maven项目，修改数据库配置文件。
3. 添加Web服务器运行, 也可以直接运行单元测试代码 `test.ServiceTest.testFind()`


# mybatis 资料

1. [文档](http://mp.baomidou.com/)

2. [Mybatis-Plus 实践及架构原理](http://git.oschina.net/baomidou/mybatis-plus/attach_files)

3. 依赖


```xml
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus</artifactId>
    <version>版本</version>
</dependency>
```

# hystrix 资料


1. [官网](https://github.com/Netflix/Hystrix)

2. [wiki](https://github.com/Netflix/Hystrix/wiki)

3. [中文介绍](https://www.jianshu.com/p/b9af028efebb)

4. 依赖

```
<!-- Hystrix -->
<dependency>
    <groupId>com.netflix.hystrix</groupId>
    <artifactId>hystrix-metrics-event-stream</artifactId>
    <version>版本</version>
</dependency>
<dependency>
    <groupId>com.netflix.hystrix</groupId>
    <artifactId>hystrix-javanica</artifactId>
    <version>版本</version>
</dependency>
```