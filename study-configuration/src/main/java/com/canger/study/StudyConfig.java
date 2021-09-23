package com.canger.study;

import com.canger.study.config.TestConfig1;
import com.canger.study.config.TestConfig2;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudyConfig {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) context).register(TestConfig1.class,TestConfig2.class);
        context.refresh();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(beanDefinitionNames);
    }
}
