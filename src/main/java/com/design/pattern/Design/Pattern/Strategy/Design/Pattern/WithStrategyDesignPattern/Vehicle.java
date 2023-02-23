package com.design.pattern.Design.Pattern.Strategy.Design.Pattern.WithStrategyDesignPattern;

import com.design.pattern.Design.Pattern.Strategy.Design.Pattern.WithStrategyDesignPattern.Stretegy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    //constructor injection
    Vehicle(DriveStrategy driveStrategyObj) {
        this.driveStrategy = driveStrategyObj;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
