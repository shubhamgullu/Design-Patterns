package com.design.pattern.Design.Pattern.StrategyDesignPattern.WithStrategyDesignPattern;

import com.design.pattern.Design.Pattern.StrategyDesignPattern.WithStrategyDesignPattern.Stretegy.DriveStrategy;

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
