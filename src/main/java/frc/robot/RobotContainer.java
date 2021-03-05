/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.FastMode;
import frc.robot.commands.ShootingCom;
import frc.robot.commands.SlowMode;
import frc.robot.commands.AdjustDownCom;
import frc.robot.commands.AdjustHold;
import frc.robot.commands.AdjustUpCom;
import frc.robot.commands.DriveBase;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Chassis;
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
  public static final FastMode fasteMode = new FastMode();
  public static final SlowMode slowMode = new SlowMode();
  public static final AdjustS adjustS = new AdjustS();
  public static final ShootingS shootingS = new ShootingS();
  // Define Commands
  private final DriveBase driveBase = new DriveBase();
  public static final AdjustUpCom adjustUpCom = new AdjustUpCom();
  public static final AdjustDownCom adjustDownCom = new AdjustDownCom();
  public static final AdjustHold adjustHold = new AdjustHold();
  public static final ShootingCom shootingCom = new ShootingCom();

  // Making new Controller and Buttons
  public static final XboxController controller = new XboxController(0);
  public static final JoystickButton fastButton = new JoystickButton(controller, 8);
  public static final JoystickButton slowButton = new JoystickButton(controller, 10);
  public static final JoystickButton buttonR = new JoystickButton(controller, 6);
  public static final JoystickButton buttonL = new JoystickButton(controller, 5);

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings

    configureButtonBindings();
    chassis.setDefaultCommand(driveBase);
    shootingS.setDefaultCommand(shootingCom);
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
//Other Variables
public static boolean fastMode = false;
}
  

