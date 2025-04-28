package com.nathan256.springfreecode;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfig {

    @Bean
    @Profile("dev") // only for dev profile
    @Qualifier("bean1")
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("First Bean");
    }

    @Bean
    @Profile("test")
//    @Qualifier("bean2")
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("Second Bean");
    }

    @Bean
//    @Qualifier("bean3")
    @Primary
    public MyFirstClass myThirdBean() {
        return new MyFirstClass("Third Bean");
    }
}
