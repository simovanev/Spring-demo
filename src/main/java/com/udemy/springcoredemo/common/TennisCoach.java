package com.udemy.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
public class TennisCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "Take it easy";
    }
}
