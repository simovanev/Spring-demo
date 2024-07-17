package com.udemy.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "Run, Forest, run";
    }
}
