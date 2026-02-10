// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.PositionDutyCycle;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.subsystems.states.HoodState;




public class Hood extends SubsystemBase {
  /** Creates a new Hood. */

  
  private TalonFX hood = Constants.hoodID;
  private HoodState state = HoodState.IDLE;
  public Hood(){
  
  }

  public void setState(HoodState state) {
        this.state = state;
      
      }
 public HoodState getState() {
        return state;}

public Command setStateCommand(HoodState state) {
        return runOnce(() -> setState(state));}

 private void handleState() {

        hood.setControl(
            new PositionDutyCycle(state.getAngleDeg()
        ));
    }

    @Override
    public void periodic() {
        handleState();
    }
}

