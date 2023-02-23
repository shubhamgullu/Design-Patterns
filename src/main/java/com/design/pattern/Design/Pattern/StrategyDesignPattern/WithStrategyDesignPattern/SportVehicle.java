package com.design.pattern.Design.Pattern.StrategyDesignPattern.WithStrategyDesignPattern;

import com.design.pattern.Design.Pattern.StrategyDesignPattern.WithStrategyDesignPattern.Stretegy.SportyDrive;

public class SportVehicle extends Vehicle {
    SportVehicle() {
        super(new SportyDrive());
    }
}
