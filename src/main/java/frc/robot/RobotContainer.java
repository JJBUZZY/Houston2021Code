/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.LatchOpenCom;
import frc.robot.commands.ShootingCom;
import frc.robot.commands.AdjustDownCom;
import frc.robot.commands.AdjustLock;
import frc.robot.commands.AdjustUpCom;
import frc.robot.commands.DriveBase;
import frc.robot.commands.LatchCloseCom;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Chassis;
import frc.robot.subsystems.LatchS;
import frc.robot.subsystems.ShootingS;
import frc.robot.subsystems.AdjustS;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public static final Chassis chassis = new Chassis();
  public static final AdjustS adjustS = new AdjustS();
  public static final ShootingS shootingS = new ShootingS();
  public static final LatchS LatchS = new LatchS();

  // Define Commands
  private final DriveBase driveBase = new DriveBase();
  public static final AdjustUpCom adjustUpCom = new AdjustUpCom();
  public static final AdjustDownCom adjustDownCom = new AdjustDownCom();
  public static final ShootingCom shootingCom = new ShootingCom();
  public static final LatchOpenCom latchCom = new LatchOpenCom();
  public static final AdjustLock adjustLock = new AdjustLock();

  // Making new Controller and Buttons
  public static final XboxController controller = new XboxController(0);

  public static final JoystickButton fastButton = new JoystickButton(controller, 8);
  public static final JoystickButton slowButton = new JoystickButton(controller, 10);
  public static final JoystickButton buttonR = new JoystickButton(controller, 5);
  public static final JoystickButton buttonL = new JoystickButton(controller, 6);
  public static final JoystickButton openLatchB = new JoystickButton(controller, 3);
  public static final JoystickButton closeLatchB = new JoystickButton(controller, 2);



  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings

    configureButtonBindings();
    chassis.setDefaultCommand(driveBase);
    shootingS.setDefaultCommand(shootingCom);
    adjustS.setDefaultCommand(adjustLock);
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */

   
  private void configureButtonBindings() {
    buttonR.whileHeld(new AdjustDownCom());
    buttonL.whileHeld(new AdjustUpCom());
    openLatchB.whileHeld(new LatchOpenCom());
    closeLatchB.whileHeld(new LatchCloseCom());

  }

public Command getAutonomousCommand() {
	return null;
}

//Declaring Port Variables
final public static int leftFront = 4;
final public static int rightFront = 1;
final public static int leftBack = 3;
final public static int rightBack = 2;
final public static int adjuster = 5;
final public static int shooter = 6;
final public static int latchB = 7;

//Other Variables
public static double AdjustPos = 0;
}
  

