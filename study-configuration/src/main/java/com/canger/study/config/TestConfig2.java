package com.canger.study.config;

import com.canger.study.model.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig2 {

    @Bean
    public Cat cat(){
        return new Cat();
    }
}
