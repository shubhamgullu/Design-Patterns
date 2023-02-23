package com.design.pattern.Design.Pattern.StrategyDesignPattern.WithStrategyDesignPattern;

import com.design.pattern.Design.Pattern.StrategyDesignPattern.WithStrategyDesignPattern.Stretegy.SportyDrive;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SportyDrive());
    }
}
