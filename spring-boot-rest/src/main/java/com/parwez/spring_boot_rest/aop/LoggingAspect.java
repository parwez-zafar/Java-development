package com.parwez.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);


    // return type, class-name.method-name(args)
    // ex --> * *.*(..))

//    @Before("execution(* com.parwez.spring_boot_rest.service.JobService.*(..))")
//    public void logMethodCall(){
//        LOGGER.info("Method called");
//    }


    @Before("execution(* com.parwez.spring_boot_rest.service.JobService.*(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info(jp.getSignature().getName() + " + Method called");
    }

    @After("execution(* com.parwez.spring_boot_rest.service.JobService.getAllJobs(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info(jp.getSignature().getName() + " + Method Executed");
    }

    @AfterThrowing("execution(* com.parwez.spring_boot_rest.service.JobService.*(..))")
    public void logMethodCrashed(JoinPoint jp){
        LOGGER.info(jp.getSignature().getName() + " + Method Has Some Issue");
    }

    @AfterReturning("execution(* com.parwez.spring_boot_rest.service.JobService.*(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){
        LOGGER.info(jp.getSignature().getName() + " + Method Executed Successfully");
    }
}