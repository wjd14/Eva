// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;
import frc.robot.commands.MoveArm;
import frc.robot.commands.TeleOpMoveArm;


public class ArmMover extends CommandBase {
  /** Creates a new ArmDown. */
  private final Arm m_Arm;
  private final double m_Speed;

  public ArmMover(Arm subsystem, double speed) {
    m_Arm = subsystem;
    addRequirements(m_Arm);
    m_Speed = speed;


    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Arm.setArmSpeed(m_Speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_Arm.setArmSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
