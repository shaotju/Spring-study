package canger.study.context;

import canger.study.context.animinal.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
        Cat cat = context.getBean(Cat.class);

        System.out.println(cat.getClass().getName());
        System.out.println(cat);
        context.close();
    }
}
