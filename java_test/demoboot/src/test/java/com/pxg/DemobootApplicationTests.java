package com.pxg;

import com.pxg.domain.user.User;
import com.pxg.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemobootApplicationTests {

    @Autowired
    TestService testService;

    @Test
    public void contextLoads() throws Exception {
        System.out.println("开始");
        testService.test(new User("123", "12345"));
        Thread.sleep(1000);
        System.out.println("结束");
    }

}

