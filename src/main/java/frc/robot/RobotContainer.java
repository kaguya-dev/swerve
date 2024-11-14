// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

  public Joystick driverController = new Joystick(Constants.Controle1);

  public RobotContainer() {
    configureBindings();
    
  }

  private void configureBindings() {

    new JoystickButton(driverController, Constants.button1);
  }

}
