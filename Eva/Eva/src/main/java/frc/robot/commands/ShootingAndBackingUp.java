// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ShootingAndBackingUp extends SequentialCommandGroup {


  /** Creates a new ShootingAndBackingUp. */
  public ShootingAndBackingUp() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(

      new RunIntakeInAntonymous(RobotContainer.getInstance().m_intake, 1).withTimeout(3),
      new AutoDriveRobotBackward(RobotContainer.getInstance().m_driveTrain, .5).withTimeout(3)
    );
  }
}
