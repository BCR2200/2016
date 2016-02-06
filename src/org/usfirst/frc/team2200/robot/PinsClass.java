package org.usfirst.frc.team2200.robot;

public class PinsClass {
	public int frontLeftMotorPin;
	public int middleLeftMotorPin;
	public int rearLeftMotorPin;
	public int frontRightMotorPin;
	public int middleRightMotorPin;
	public int rearRightMotorPin;
	public int topRollerPin;
	public int botRollerPin;
	public int intakeArmSolenoidA;
	public int intakeArmSolenoidB;
	public int teleArmSolenoidA;
	public int teleArmSolenoidB;
	public int teleArmMotor;
	public int driveSolenoidA;
	public int driveSolenoidB;
	public int leftLineSensor;
	public int rightLineSensor;
	public int leftEncPinA;
	public int leftEncPinB;
	public int rightEncPinA;
	public int rightEncPinB;
	
	
	public PinsClass(){
		//PWM Pins
		 topRollerPin = 0;
		 botRollerPin = 1;
		 teleArmMotor = 2;
		 
		 //DIO
		 leftLineSensor = 0;
		 rightLineSensor = 1;
		 
		 leftEncPinA = 2;
		 leftEncPinB = 3;
		 
		 rightEncPinA = 4;
		 rightEncPinB = 5;
		 
		 
		 //CANTalon Addresses
		 frontLeftMotorPin = 11;
		 middleLeftMotorPin = 12;
		 rearLeftMotorPin = 13;
		 
		 frontRightMotorPin = 14;
		 middleRightMotorPin = 15;
		 rearRightMotorPin = 16;
		 
		 //Solenoid Labels
		 intakeArmSolenoidA = 0;
		 intakeArmSolenoidB = 1;
		 teleArmSolenoidA = 4;
		 teleArmSolenoidB = 5;
		 driveSolenoidA = 2;
		 driveSolenoidB = 3;
		 

		
	}

}
