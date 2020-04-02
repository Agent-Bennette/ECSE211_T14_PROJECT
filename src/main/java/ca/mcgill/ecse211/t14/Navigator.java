/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse211.t14;

import java.lang.Runnable;

import ca.mcgill.ecse211.t14.playingfield.Region;

/**
 * Main brain of the system. Contains a state machine and executes specific
 * robot movements based on said states, which is basically the entire robot's
 * visible behaviour since moving is pretty much all it can do.
 * 
 * @author Edwin Pan
 *
 */
public class Navigator implements Runnable {

	// ------------------------
	// ENUMERATIONS
	// ------------------------

	public static enum MissionStatus {
		AwaitingMapParametres, LocalizingInitially, FindingAndCrossingBridge, LocatingVehicle, AttachingToVehicle,
		FindingAndCrossingBridgeAgain, NavigatingToFinalPosition
	}

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Navigator Attributes
	private MissionStatus missionStatus;

	// Navigator Associations
	private Region redMap;
	private Region greenMap;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Navigator(MissionStatus aMissionStatus, Region aRedMap, Region aGreenMap) {
		super();
		missionStatus = aMissionStatus;
		redMap = aRedMap;
		greenMap = aGreenMap;
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public boolean setMissionStatus(MissionStatus aMissionStatus) {
		boolean wasSet = false;
		missionStatus = aMissionStatus;
		wasSet = true;
		return wasSet;
	}

	public MissionStatus getMissionStatus() {
		return missionStatus;
	}
	
	/**
	 * drives the robot the a specific point
	 * @author ANDREW TA
	 * @param x x coordinate of the destination
	 * @param y y coordinate of the destination
	 */
	public void travelTo(double x, double y) {
		//compute the distance to travel
		//call motor.rotate() to travel to the destination
	}
	
	/**
	 * drives the robots so that it points to a specific point
	 * @author ANDREW TA
	 * @param x x coordinate of the destination
	 * @param y y coordinate of the destination
	 */
	public void turnTo(double x, double y) {
		//compute the angle 
		//call motor.rotate()
	}

	/**
	 * stop all motors
	 * @author ANDREW TA
	 */
	public static void stopMotors() {
		
	}

	/**
	 * set the speed of the motors 
	 * @author ANDREW TA
	 * @param speed provided speed
	 */
	public static void setSpeed(int speed) {
		setSpeeds(speed, speed);
	}

	/**
	 * helper function to set speed of the motors
	 * @author ANDREW TA
	 * @param leftSpeed provided left speed
	 * @param rightSpeed provided right speed
	 */
	private static void setSpeeds(int leftSpeed, int rightSpeed) {
		
	}

	/**
	 * set acceleration of the motor
	 * @author ANDREW TA
	 * @param acceleration provided acceleration
	 */
	public static void setAcceleration(int acceleration) {
		
	}

	/**
	 * rotates the robot
	 * @author ANDREW TA
	 * @param flag which side the robot should rotate (1 for clockwise, 0 for anti-clockwise)
	 */
	public static void rotate(boolean flag) {
		
	}

	/**
	 * rotates the robot about an angle given
	 * @author ANDREW TA
	 * @param angle provided angle
	 */
	public static void turnAngle(double angle) {
		
	}

	/**
	 * makes the robot move forward or backward
	 * @author ANDREW TA
	 * @param flag which way to go (1 if forward, 0 if backward)
	 */
	public static void moveForward(boolean flag) {
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}