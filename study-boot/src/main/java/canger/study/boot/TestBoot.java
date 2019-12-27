package canger.study.boot;

import canger.study.boot.model.Flight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestBoot {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestBoot.class, args);
        Object flight = context.getBean(Flight.class);
        System.out.println(flight);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name :
                beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
