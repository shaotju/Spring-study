package com.canger.study.config;

import com.canger.study.model.Cat;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig1 {

    @Bean(name = "another")
    @ConditionalOnMissingBean(Cat.class)
    public Cat another(){
        return new Cat();
    }
}
