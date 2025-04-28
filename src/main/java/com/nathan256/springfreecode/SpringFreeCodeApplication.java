package com.nathan256.springfreecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFreeCodeApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(SpringFreeCodeApplication.class, args);

        MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellAStory());
    }

}
