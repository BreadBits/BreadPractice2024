// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class motorPractice extends SubsystemBase {
  /** Creates a new motorPractice. */
  private CANSparkMax breadMotor;
//  private RelativeEncoder breadMotorEncoder; 
  public motorPractice() {
    breadMotor = new CANSparkMax(10,MotorType.kBrushless); 
    this.breadMotor.restoreFactoryDefaults();
 //   breadMotorEncoder =  breadMotor.getEncoder();
 //   breadMotorEncoder.setPositionConversionFactor(0.2);
    this.breadMotor.setSmartCurrentLimit(30);
    this.breadMotor.burnFlash();
  }
/*
  public double getmPosition(){
   return breadMotorEncoder.getPosition(); 
  }
*/

  @Override
  public void periodic() {
    
    // This method will be called once per scheduler run
  }
/*
  public void resetEncoder(){
      System.out.println("This encoder just got reset");
      breadMotorEncoder.setPosition(0);
      System.out.println(breadMotorEncoder.getPosition());
  }
*/
  public void setPower(double power){
    breadMotor.set(power);
  }

  public void stop(){
    this.breadMotor.set(0);
  }

}
