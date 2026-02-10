// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.states;

/** Add your docs here. */


public enum HoodState {

    IDLE(0.0),    
    LOW(10.0),
    MID(30.0),
    HIGH(45.0);

    private final double angleDeg;

    HoodState(double angleDeg) {
        this.angleDeg = angleDeg;
    }

    public double getAngleDeg() {
        return angleDeg;
    }
}