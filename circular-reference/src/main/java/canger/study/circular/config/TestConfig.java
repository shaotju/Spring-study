package canger.study.circular.config;

import canger.study.circular.bean.ClassA;
import canger.study.circular.bean.ClassB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class TestConfig {

    @Bean
    public ClassA classA(ClassB b){
        ClassA classA = new ClassA();
        classA.setB(b);
        return classA;
    }
    @Bean
    public ClassB classB(ClassA a){
        ClassB classb = new ClassB();
        classb.setA(a);
        return classb;
    }
}
