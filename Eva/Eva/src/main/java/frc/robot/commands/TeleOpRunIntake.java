// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.commands.RunIntake;
import frc.robot.subsystems.Intake;
import frc.robot.RobotContainer;

public class TeleOpRunIntake extends CommandBase {
  /** Creates a new TeleOpRunIntake. */

private final Intake m_Intake;

  public TeleOpRunIntake(Intake subsystem) {
    m_Intake = subsystem;
    addRequirements(m_Intake);


    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double rotation = RobotContainer.getInstance().getScoreController().getRawAxis(1)* 0.5;

    m_Intake.SpinIntake(rotation);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_Intake.SpinIntake(0); 
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
