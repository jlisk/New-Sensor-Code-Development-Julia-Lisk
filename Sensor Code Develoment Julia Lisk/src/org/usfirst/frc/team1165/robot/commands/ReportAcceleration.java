package org.usfirst.frc.team1165.robot.commands;

import org.usfirst.frc.team1165.robot.Robot;
import org.usfirst.frc.team1165.robot.subsystems.Accelerometer;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ReportAcceleration extends Command {

	BuiltInAccelerometer bob = new BuiltInAccelerometer();
	private static double x;
	private static double y;
	private static double z;
    public ReportAcceleration() {
        // Use requires() here to declare subsystem dependencies
         requires( Robot.accelerometer);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	x=bob.getX();
    	y=bob.getY();
    	z=bob.getZ();
    //The Z axis should be pointed straight down?
    	SmartDashboard.putDouble("accelX", x);
    	SmartDashboard.putDouble("accelY", y);
    	SmartDashboard.putDouble("accelZ", z);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
