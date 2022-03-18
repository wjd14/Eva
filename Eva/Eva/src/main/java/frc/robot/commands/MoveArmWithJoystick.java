// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.*;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.commands.MoveArmWithJoystick;
import frc.robot.RobotContainer;

public class MoveArmWithJoystick extends CommandBase {

 private final Arm m_Arm;

  public MoveArmWithJoystick(Arm subsystem) {
    m_Arm = subsystem;
    addRequirements(m_Arm);


    // Use addRequirements() here to declare subsystem dependencies.
  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double armSpeed = RobotContainer.getInstance().getScoreController().getRawAxis(1) * -0.15;

    m_Arm.setArmSpeed(armSpeed);

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
