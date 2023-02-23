package com.design.pattern.Design.Pattern.Strategy.Design.Pattern.WithStrategyDesignPattern;

import com.design.pattern.Design.Pattern.Strategy.Design.Pattern.WithStrategyDesignPattern.Stretegy.SportyDrive;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SportyDrive());
    }
}
