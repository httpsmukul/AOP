package com.example.AOP;

import org.springframework.stereotype.Component;

@Component
public class Car {
//    @Autowired
//    private Track track;

    public void car(){
//        track.track();
        System.out.println("yes its a car");
    }
}
