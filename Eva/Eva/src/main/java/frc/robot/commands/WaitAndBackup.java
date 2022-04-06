// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class WaitAndBackup extends SequentialCommandGroup {
  private final DriveTrain m_driveTrain;
  /** Creates a new WaitAndBackup. */
  public WaitAndBackup( DriveTrain drive_subsystem) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());

    m_driveTrain = drive_subsystem;

    addCommands(
      new AutoDriveRobotForward(m_driveTrain, 0).withTimeout(10),
      new AutoDriveRobotBackward(m_driveTrain, .5).withTimeout(3)

    );
  }
}
