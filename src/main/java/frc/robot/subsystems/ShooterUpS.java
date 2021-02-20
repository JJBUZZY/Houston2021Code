// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ShooterUpS extends SubsystemBase {
  /** Creates a new ShooterUpS. */
  CANSparkMax shoot = new CANSparkMax(RobotContainer.shooter, MotorType.kBrushless);

  public void shoot (double speed) {
    if (speed > .30){
      speed = .30;
    }

    shoot.set(speed);
  }

  public ShooterUpS() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
