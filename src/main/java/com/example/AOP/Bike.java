package com.example.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Bike {

    @Before("execution(public void com.example.AOP.Car.car())")
    public void car(){
        System.out.println("its a Bike");
    }

    @After("execution(public void com.example.AOP.Car.car())")
    public void notCar(){
        System.out.println("Now its not a Bike");
    }
}
