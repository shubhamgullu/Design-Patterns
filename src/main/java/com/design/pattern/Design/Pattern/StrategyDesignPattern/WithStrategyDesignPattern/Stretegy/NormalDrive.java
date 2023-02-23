package com.design.pattern.Design.Pattern.StrategyDesignPattern.WithStrategyDesignPattern.Stretegy;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Functionality");
    }
}
