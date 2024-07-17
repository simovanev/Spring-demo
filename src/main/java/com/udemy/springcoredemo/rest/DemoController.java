package com.udemy.springcoredemo.rest;

import com.udemy.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private  Coach myCoach;
    private  Coach yourCoach;

    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach myCoach,
                          @Qualifier("baseballCoach") Coach yourCoach) {
        this.myCoach = myCoach;
        this.yourCoach = yourCoach;
    }

    @GetMapping("/workout")
    public String workout() {
        return myCoach.dailyWorkout();
    }
    @GetMapping("/check")
    public String check() {
        return "Is my coach the same as your coach?"+ (myCoach==yourCoach);
    }
}
