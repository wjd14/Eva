// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: RobotContainer.

package frc.robot;

import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.ArmMover;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  private static RobotContainer m_robotContainer = new RobotContainer();

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
// The robot's subsystems
    public final DriveTrain m_driveTrain = new DriveTrain();
    public final Arm m_arm = new Arm();
    public final Intake m_intake = new Intake();

// Joysticks
private final Joystick scoreController = new Joystick(0);
private final Joystick driverController = new Joystick(1);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  
  // A chooser for autonomous commands
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  /**
  * The container for the robot.  Contains subsystems, OI devices, and commands.
  */
  private RobotContainer() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Smartdashboard Subsystems
    SmartDashboard.putData(m_arm);
    SmartDashboard.putData(m_intake);


    // SmartDashboard Buttons
    SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
    SmartDashboard.putData("RunIntake", new RunIntake( m_intake ));
    SmartDashboard.putData("MoveArm", new MoveArm( m_arm ));
    SmartDashboard.putData("DriveRobot", new DriveRobot( m_driveTrain ));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SMARTDASHBOARD
    // Configure the button bindings
    configureButtonBindings();

    // Configure default commands
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND
    m_driveTrain.setDefaultCommand(new DriveRobot( m_driveTrain ) );


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SUBSYSTEM_DEFAULT_COMMAND
    m_intake.setDefaultCommand(new RunIntake(m_intake));
    m_arm.setDefaultCommand(new TeleOpMoveArm(m_arm));
    // Configure autonomous sendable chooser
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

    m_chooser.setDefaultOption("Do Nothing", new AutoDriveRobotForward(m_driveTrain, 0).withTimeout(15));


    m_chooser.addOption("ExitTarmac", new AutoDriveRobotForward(m_driveTrain, .5).withTimeout(3));
    m_chooser.addOption("FullSpeedExitTarmac", new AutoDriveRobotForward(m_driveTrain, 1).withTimeout(1));
    m_chooser.addOption("ExitTarmacBackwards", new AutoDriveRobotBackward(m_driveTrain, .5).withTimeout(3));
    m_chooser.addOption("FullSpeedExitTarmacBackwards", new AutoDriveRobotBackward(m_driveTrain, 1).withTimeout(1));

    SmartDashboard.putData("Auto Mode", m_chooser);
  }

  public static RobotContainer getInstance() {
    return m_robotContainer;
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
// Create some buttons
JoystickButton goDownButton = new JoystickButton(getScoreController(),3); //We think Button 3 is the Y Button!
JoystickButton goUpButton = new JoystickButton(getScoreController(),0); // We think Button 0 is the A Button!
goDownButton.whenPressed(new ArmMover(m_arm, -0.5).withTimeout(1));
goUpButton.whenPressed(new ArmMover(m_arm, 0.5).withTimeout(1));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=BUTTONS
  }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public Joystick getDriverController() {
        return driverController;
    }

public Joystick getScoreController() {
        return scoreController;
    }
    

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
  */
  public Command getAutonomousCommand() {
    // The selected command will be run in autonomous
    return m_chooser.getSelected();
  }
  

}

