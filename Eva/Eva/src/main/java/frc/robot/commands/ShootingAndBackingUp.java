// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ShootingAndBackingUp extends SequentialCommandGroup {
  private final DriveTrain m_driveTrain;
  private final Intake m_intake;
  //private final Arm m_arm; 

  /** Creates a new ShootingAndBackingUp. */
  public ShootingAndBackingUp(DriveTrain drive_subsystem, Intake intake_subsystem) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    m_driveTrain = drive_subsystem;
    m_intake = intake_subsystem;
    //m_arm = arm_subsystem;


    addCommands(

      //new MoveArmWithSpeed(m_arm, 1).withTimeout(1),
      new RunIntakeWithSpeed(m_intake, -1).withTimeout(1),
      new AutoDriveRobotBackward(m_driveTrain, .5).withTimeout(4)
    );
  } 
}
