/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse211.t14;

import java.lang.Runnable;

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

	public enum MissionStatus {
		AwaitingMapParametres, LocalizingInitially, FindingAndCrossingBridge, LocatingVehicle, AttachingToVehicle,
		FindingAndCrossingBridgeAgain, NavigatingToFinalPosition
	}

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Navigator Attributes
	private MissionStatus missionStatus;

	// Navigator Associations
	private Map redMap;
	private Map greenMap;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Navigator(MissionStatus aMissionStatus, Map aRedMap, Map aGreenMap) {
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
	 * @author ANDREW TA
	 * drives the robot the a specific point
	 * @param x x coordinate of the destination
	 * @param y y coordinate of the destination
	 */
	public void travelTo(double x, double y) {
		
	}
	
	/**
	 * @author ANDREW TA
	 * drives the robots so that it points to a specific point
	 * @param x x coordinate of the destination
	 * @param y y coordinate of the destination
	 */
	public void turnTo(double x, double y) {
		
	}

	/**
	 * @author ANDREW TA
	 * stop all motors
	 */
	public static void stopMotors() {
		
	}

	/**
	 * @author ANDREW TA
	 * set the speed of the motors
	 * @param speed provided speed
	 */
	public static void setSpeed(int speed) {
		setSpeeds(speed, speed);
	}

	/**
	 * @author ANDREW TA
	 * helper function to set speed of the motors
	 * @param leftSpeed provided left speed
	 * @param rightSpeed provided right speed
	 */
	public static void setSpeeds(int leftSpeed, int rightSpeed) {
		
	}

	/**
	 * @author ANDREW TA
	 * set acceleration of the motor
	 * @param acceleration provided acceleration
	 */
	public static void setAcceleration(int acceleration) {
		
	}

	/**
	 * @author ANDREW TA
	 * rotate the robot
	 * @param flag which side the robot should rotate (1 for clockwise, 0 for anti-clockwise)
	 */
	public static void rotate(boolean flag) {
		
	}

	/**
	 * @author ANDREW TA
	 * rotates the robot about an angle given
	 * @param angle provided angle
	 */
	public static void turnAngle(double angle) {
		
	}

	/**
	 * @author ANDREW TA
	 * makes the robot move forward or backward
	 * @param flag which way to go (1 if forward, 0 if backward)
	 */
	public static void moveForward(boolean flag) {
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}