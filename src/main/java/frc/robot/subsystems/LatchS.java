// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class LatchS extends SubsystemBase {
  /** Creates a new Latch. */
  public LatchS() {
  }
  CANSparkMax latch = new CANSparkMax(RobotContainer.latchB, MotorType.kBrushed);


  public void latch(double speed) {
    latch.set(speed);
    System.out.println(speed);
    System.out.println(latch);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
