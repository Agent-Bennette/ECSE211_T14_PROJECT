/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse211.t14;

/**
 * Contains methods which execute algorithms that localize the robot and correct
 * odometer values accordingly.
 * 
 * @author of interface Edwin Pan
 *
 */
public class Localizer {

	// ------------------------
	// INTERFACE
	// ------------------------

	/**
	 * @author ANDREW TA
	 * executes initial localization
	 * this methods will call two extra function to perform ulstrasonic localization and light localization
	 */
	public static void initializePosition() {
		doUSLocalization(); //perform ultrasonic sensor localization to get the robot to 0 angle
		doLightLocalization(); // perform light localization to get the robot to (1,1) point
	}
	
	/**
	 * @author ANDREW TA
	 * 
	 * turn the robot around to find alpha beta angle
	 * then turn it to the right angle
	 */
	private static void doUSLocalization() {
		
	}
	
	/**
	 * @author ANDREW TA
	 * 
	 * move the robot to (1,1) point 
	 * then perform light localization so that 
	 * the center of the robot is at (1,1) after localization
	 */
	private static void doLightLocalization() {
		
	}

	/**
	 * @author ANDREW TA
	 * Perform light localization at a way point. Assumption: The robot does
	 * not veer off the course so much that the robot's assumption that it is near
	 * an intersection is true. Assumption: The robot's orientation is at an error
	 * of less than 15 degrees plus or minus.
	 */
	public static void localizeAtWayPoint() {
		
	}
	
	/**
	 * helper function for light localization
	 * @return a boolean that specifies if the robot detects a line or not
	 */
	private static boolean lightLocalizationHelper() {
		return true;
	}

}