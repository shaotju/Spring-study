package canger.study.aop.aspect;

import canger.study.aop.plugin.QueryCounterPlugin;
import canger.study.aop.plugin.impl.QueryCounterPluginImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class TestAspect {

    @DeclareParents(value = "canger.study.aop..*",defaultImpl = QueryCounterPluginImpl.class)
    private QueryCounterPlugin queryCounterPlugin;

    @Before("execution(public * canger.study.aop.service..*.query*(..)) && this(queryCounterPlugin)")
    public void countBefore(QueryCounterPlugin queryCounterPlugin){
        queryCounterPlugin.queryCount();
    }

    @Before("execution( * canger.study.aop.service..*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("execution before");
    }

    @Before("args(name,id,..)")
    public void argsBefore(int id,String name){
        System.out.println("args before");
    }

//    @Before("bean(*ServiceImpl)")
//    public void beanBefore(){
//        System.out.println("bean before");
//    }
//
//    @After("bean(*ServiceImpl)")
//    public void afterFinally(){
//        System.out.println("after finally");
//    }
//
//    @AfterReturning(pointcut = "bean(*ServiceImpl)",returning = "retStr")
//    public void afterReturning(JoinPoint joinPoint,String retStr){
//        System.out.println("after returning: " + retStr);
//    }
//
//    @AfterThrowing(pointcut = "bean(*ServiceImpl)",throwing = "e")
//    public void afterThrowing(Throwable e){
//        System.out.println(e);
//        System.out.println("after throwing: " + e.toString());
//    }

}
