package com.priyank.springwebservicedemo;

import com.priyank.springwebservicedemo.runner.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringWebServiceDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringWebServiceDemoApplication.class, args);
//        context.getBean(GameRunner.class).run();
    }
}
