package canger.analyze.aop;

import canger.analyze.aop.service.AnalyzeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnalyzeAopApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AnalyzeService analyzeService = context.getBean(AnalyzeService.class);
        int div = analyzeService.div(4, 2);
        //int sum = analyzeService.sum(4, 2);
        context.close();
    }
}
