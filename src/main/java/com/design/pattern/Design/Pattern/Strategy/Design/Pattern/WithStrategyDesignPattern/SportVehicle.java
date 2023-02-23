package com.design.pattern.Design.Pattern.Strategy.Design.Pattern.WithStrategyDesignPattern;

import com.design.pattern.Design.Pattern.Strategy.Design.Pattern.WithStrategyDesignPattern.Stretegy.SportyDrive;

public class SportVehicle extends Vehicle {
    SportVehicle() {
        super(new SportyDrive());
    }
}
