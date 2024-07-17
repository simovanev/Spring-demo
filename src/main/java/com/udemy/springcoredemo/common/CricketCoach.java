package com.udemy.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "Workout 25 minutes a day.";
    }
}
