// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class AdjustUpCom extends CommandBase {
  /** Creates a new shooterUpC. */
  public AdjustUpCom() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.adjustS);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.adjustS.adjust(.1);
  }
  @Override
  public void end(boolean interrupted) {  
    RobotContainer.adjustS.adjust(.05);
  }
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
