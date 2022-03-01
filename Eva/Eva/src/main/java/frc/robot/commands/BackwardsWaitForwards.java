// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.RobotContainer;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class BackwardsWaitForwards extends SequentialCommandGroup {
  /** Creates a new BackwardsWaitForwards. */
  public BackwardsWaitForwards() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(

      new AutoDriveRobotBackward(RobotContainer.getInstance().m_driveTrain, .5).withTimeout(3),

      new AutoDriveRobotForward(RobotContainer.getInstance().m_driveTrain, 0).withTimeout(3),

      new AutoDriveRobotForward(RobotContainer.getInstance().m_driveTrain, .5).withTimeout(3)
    );
  }
}
