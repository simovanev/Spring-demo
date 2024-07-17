package com.udemy.springcoredemo.rest;

import com.udemy.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach myCoach;

    public DemoController(@Qualifier("baseballCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/workout")
    public String workout() {
        return myCoach.dailyWorkout();
    }
}
