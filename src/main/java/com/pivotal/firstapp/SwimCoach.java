package com.pivotal.firstapp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("constructor called - "+this.getClass().getName());
    }

    @PostConstruct
    public void initSwimCoach() {
        System.out.println("Swim Coach init !!!");
    }

    @Override
    public String getDailyWorkout() {
        return "Swim far";
    }

    @PreDestroy
    public void destroySwimCoach(){
        System.out.println("Destroy Swim Coach !!");
    }
}
