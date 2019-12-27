package canger.study.lookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLookupMethod {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LookupConfiguration.class);
        CommandManager commandManager = context.getBean(CommandManager.class);
        commandManager.process(1);
        commandManager.process(1);
        commandManager.process(1);
    }
}
