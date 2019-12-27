package canger.study.context;

import canger.study.context.config.ContextConfiguration;
import canger.study.context.extend.ExConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationContext {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        ExConfig bean = context.getBean(ExConfig.class);
        System.out.println(bean);
    }

}
