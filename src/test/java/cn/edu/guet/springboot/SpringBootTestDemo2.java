package cn.edu.guet.springboot;

import cn.edu.guet.springboot.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestDemo2 {
    //先注入service
    @Autowired
    private HelloService helloService;
    @Test
    public void sayHelloTest(){
        System.out.println(helloService.sayHello("zhangsan"));
    }

}
