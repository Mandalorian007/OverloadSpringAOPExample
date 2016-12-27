package com.example.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogger {

    @Pointcut(value = "execution(* com.example.test.CoolClass.execute(Long))")
    public void shortcutMethodToLong() {}

    //@Before("execution(* com.example.test.CoolClass.execute(Long))")
    @Before("shortcutMethodToLong()")
    public void logInterceptLong(JoinPoint joinPoint) {
        System.out.println("Aspect Log of execute(Long): " + joinPoint.getArgs()[0]);
    }

    @Before("execution(* com.example.test.CoolClass.execute(String))")
    public void logInterceptString(JoinPoint joinPoint) {
        System.out.println("Aspect Log of execute(String): " + joinPoint.getArgs()[0]);
    }
}
