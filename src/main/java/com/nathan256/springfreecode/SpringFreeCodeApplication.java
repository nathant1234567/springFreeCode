package com.nathan256.springfreecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class SpringFreeCodeApplication {

    public static void main(String[] args) {
        var app = new SpringApplication(SpringFreeCodeApplication.class);
        app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "dev")); // settings profile
        var ctx = app.run(args);

        MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellAStory());
        System.out.println(myFirstService.getCustomPropertyFromAnotherFile());
        System.out.println(myFirstService.getCustomPropertyFromAnotherFile2());
        System.out.println(myFirstService.getCustomProperty());
        System.out.println(myFirstService.getCustomPropertyInt());
    }

}
