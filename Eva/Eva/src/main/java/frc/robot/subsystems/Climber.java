// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Climber extends SubsystemBase {
  private WPI_TalonSRX ClimberController1;
  private WPI_TalonSRX ClimberController2;
  /** Creates a new Climber. */
  public Climber() {

    ClimberController1 = new WPI_TalonSRX(35);
    ClimberController2 = new WPI_TalonSRX(22);
  }

  @Override
  public void periodic() {}
    // This method will be called once per scheduler run

  public void MoveController1(double move){
    ClimberController1.set(move);

    public void MoveController2(double move){
    ClimberController1.set(move);
  
}
