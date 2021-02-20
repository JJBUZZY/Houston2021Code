// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class ShooterUpCom extends CommandBase {
  /** Creates a new shooterUpC. */
  public ShooterUpCom() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.shooterUpS);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = RobotContainer.controller.getRawAxis(2);
    if(speed == 0) {
      speed = -RobotContainer.controller.getRawAxis(3);
    }
    RobotContainer.shooterUpS.shoot(speed);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
