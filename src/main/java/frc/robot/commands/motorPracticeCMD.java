// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.motorPractice;

public class motorPracticeCMD extends Command {
  /** Creates a new motorPracticeCMD. */
  motorPractice motor;
  public motorPracticeCMD(motorPractice motor) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.motor = motor;
    addRequirements(this.motor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    motor.setPower(.5);
  }
  
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    motor.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
