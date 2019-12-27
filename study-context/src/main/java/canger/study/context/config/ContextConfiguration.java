package canger.study.context.config;

import canger.study.context.animinal.Cat;
import canger.study.context.animinal.Dog;
import canger.study.context.extend.ExConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


@Configuration
@Import(ExConfig.class)
@PropertySource("classpath:test.properties")
public class ContextConfiguration {

    @Value("${test.value}")
    private String testValue;

    @Bean
    public Dog dog(){
        return new Dog();
    }
    @Bean
    public Cat cat(){
        dog();
        return new Cat();
    }
}
