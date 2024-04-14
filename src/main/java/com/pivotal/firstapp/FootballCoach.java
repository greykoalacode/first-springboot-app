package com.pivotal.firstapp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootballCoach implements Coach {
    public FootballCoach() {
        System.out.println("constructor called - " + this.getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice juggling the ball and saving goals";
    }
}
