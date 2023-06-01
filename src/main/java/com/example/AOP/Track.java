package com.example.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Track {

    //we call it advise
    @Before("pointCuts()") // point cuts
    public void track(){
        System.out.println("its a track");
    }

    @After("pointCuts()")
    public void notTrack(){
        System.out.println("Now its not a track");
    }

    @Pointcut("execution(public void com.example.AOP.Car.car())")
    public void pointCuts(){

    }
}
