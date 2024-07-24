package com.udemy.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "Workout 25 minutes a day.";
    }
    @PostConstruct
    public void toDo(){
        System.out.println("Cricket Coach started " +getClass().getSimpleName());
    }
    @PreDestroy
    public void toDoWhenEnded() {
        System.out.println("Cricket Coach ended "+getClass().getSimpleName());
    }
}
