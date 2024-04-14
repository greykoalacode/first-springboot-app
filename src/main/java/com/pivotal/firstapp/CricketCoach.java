package com.pivotal.firstapp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("constructor called - " + this.getClass().getName());
    }

    @PostConstruct
    public void initCricketCoach() {
        System.out.println("Cricket Coach init !!!");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice hitting sixes";
    }

    @PreDestroy
    public void destroyCricketCoach() {
        System.out.println("Destroy Cricket Coach !!");
    }
}
