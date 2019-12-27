package canger.analyze.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class AssistantBean {
    public void before(){
        System.out.println("AssistantBean before");
    }
    public void after(){
        System.out.println("AssistantBean after");
    }

    public void afterReturn(){
        System.out.println("AssistantBean after return");
    }

    public int around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AssistantBean around before");
        Object proceed = joinPoint.proceed();
        System.out.println("AssistantBean around after");
        return (int)proceed;
    }
}
