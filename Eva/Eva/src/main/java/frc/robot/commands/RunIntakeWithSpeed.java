// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.*;
public class RunIntakeWithSpeed extends CommandBase {

private final Intake m_Intake;
private double m_rotation=0;

    public RunIntakeWithSpeed(Intake subsystem, double rotation) {
      m_Intake = subsystem;
      addRequirements(m_Intake);
      m_rotation = rotation;
    }

  /** Creates a new RunIntake
   * 
   * InAntonymous. */


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Intake.SpinIntake(m_rotation);


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
