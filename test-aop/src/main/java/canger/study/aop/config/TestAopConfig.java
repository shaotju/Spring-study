package canger.study.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("canger.study.aop")
@EnableAspectJAutoProxy
public class TestAopConfig {

}
