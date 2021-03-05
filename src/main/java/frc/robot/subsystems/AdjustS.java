// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class AdjustS extends SubsystemBase {
  /** Creates a new ShooterUpS. */
  CANSparkMax adjust = new CANSparkMax(RobotContainer.adjuster, MotorType.kBrushless);

  public void adjust (double speed) {
    adjust.set(speed);
  }

  public AdjustS() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}