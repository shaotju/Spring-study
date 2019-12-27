package canger.study.aop;


import canger.study.aop.config.TestAopConfig;
import canger.study.aop.model.BaseModel;
import canger.study.aop.plugin.QueryCounterPlugin;
import canger.study.aop.service.BeanPostService;
import canger.study.aop.service.TestAopService;
import canger.study.aop.service.impl.TestAopServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.Serializable;

import static java.util.Arrays.asList;

public class TestAopApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TestAopConfig.class);
        String[] beanNamesForType = context.getBeanNamesForType(QueryCounterPlugin.class);
        System.out.println(asList(beanNamesForType));
        BeanPostService beanPostService =(BeanPostService)context.getBean(BeanPostService.class);
        beanPostService.print();
        context.close();
    }
    private static class Foo extends BaseModel implements Serializable{
        @Override
        public String toString() {
            return super.toString();
        }
    }
}
