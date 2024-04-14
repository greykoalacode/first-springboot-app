package com.pivotal.firstapp;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("constructor called - "+this.getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice hitting shots for homerun";
    }
}
