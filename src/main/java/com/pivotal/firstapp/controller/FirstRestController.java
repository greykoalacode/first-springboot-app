package com.pivotal.firstapp.controller;

import com.pivotal.firstapp.Coach;
import com.pivotal.firstapp.SportConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${player.name}")
    private String playerName;

    private SportConfig sportConfig;

    private Coach myCoach;

    @Autowired
    public void setCoach(@Qualifier("swimCoach") Coach theCoach, SportConfig theSportConfig){
        myCoach = theCoach;
        sportConfig = theSportConfig;
    }

    public FirstRestController() {
        System.out.println("constructor called - "+this.getClass().getName());
    }

    // expose the endpoint: "/"
    @GetMapping("/")
    public String sayHello() {
        return "Hello "+coachName+" "+playerName+" !";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
