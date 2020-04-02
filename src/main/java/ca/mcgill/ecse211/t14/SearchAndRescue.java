package ca.mcgill.ecse211.t14;

/**
 * This class provides methods to search and rescue the stranded vehicle and provides methods to avoid obstacles.
 * @author ANDREW TA
 * @author SEAN TAN
 * 
 */
public class SearchAndRescue {
	/**
	 * This method locates the stranded vehicle within the search zone.
	 * Upon entering the search zone, the robot will use the provided search zone coordinates and <code>UltrasonicWatcher</code> to orient itself perpendicular to the left wall of the search zone.
	 * Using <code>LineWatcher</code>, the robot will orient itself along a grid line. The robot will then perform a sweep from that grid line toward the right direction, simultaneously polling distances.
	 * A variable <code>OBJECT_DETECTION_THRESHOLD</code> is set to a distance of 10 cm. In the case that a polled distance falls below this 10 cm threshold, a boolean variable <code>objectDetected</code> indicates that an object has been detected.
	 * The robot then navigates such that it is a distance of 10 cm from the detected object. A variable <code>CART_DETECTION_ANGLE</code> set to 60º is used to distinguish the stranded cart from other detected objects.
	 * Using <code>UltrasonicWatcher</code> the robot performs a sweep of the detected object. A variable <code>OBJECT_ANGLE</code>is calculated based on the rising/falling edges of when the ultrasonic sensor detects an object and when it does not.
	 * If the computed <code>OBJECT_ANGLE</code> is within 3º of the set <code>CART_DETECTION_ANGLE</code>, then the method confirms that the detected object is the stranded vehicle. 
	 * 
	 * @author SEAN TAN
	 * @return <code>true</code> if the stranded vehicle is located successfully; <code>false</code> otherwise.
	 * 
	 */
	public static boolean searchForTheCart() {
		
		return true;
	}

	/**
	 * This method locates the point of attachment that will be used by the robot to secure the stranded vehicle for towing. 
	 * Using the light sensor and <code>ColourArbiter</code>, the robot scans the detected vehicle until it identifies the <code>Colour</code> associated with the attachment point.
	 * Assume that the attachment point has a colour associated with it in the form of coloured electrical tape.
	 * 
	 * @author SEAN TAN
	 * @return <code>true</code> if the attachment point is located successfully; <code>false</code> otherwise.
	 */
	public static boolean locateAttachmentPoint() {
		return true;
	}
	
	/**
	 * This method positions the robot over the stranded cart such that it is able to continue navigating with the cart captured inside.
	 * Upon completion of <code>locateAttachmentPoint()</code>, the robot positions itself such that the front opening is aligned with the cart.
	 * The robot opens the door to the containment area, then using the ultrasonic sensor to determine the distance from the cart, the robot drives forward a certain distance until the cart is completely enclosed under the robot.
	 * The robot then closes the door to the containment area thus securing the cart inside. Using the coordinates provided, the robot then navigates back to the starting point with the cart secured.
	 * 
	 * @author SEAN TAN
	 */
	public static void rescueTheCart() {

	}

	/**
	 * This method navigates the robot around any detected object, not including the stranded cart, in order to avoid collision.
	 * Utilizing a bang-bang controller method, the error <code>distError</code> is computed by finding the difference between ideal <code>MIN_DIST</code> and the actual distance.
	 * By comparing the <code>distError</code> with threshold values, four cases are implemented: (1) the robot is on the correct heading, (2) the robot is extremely close to collision, (3) the robot is too far from the object and (4) the robot is too close to the object.
	 * Based on which case the robot is currently in with respect to the object, the necessary maneuvers are executed such that the robot remains at a comfortable distance away from the object.
	 * Once <code>detectObstacle()</code> returns false and <code>readUSDistance()</code> is at a maximum, the robot has successfully clear of the object and can proceed on its course. (Similar to the implementation logic for Lab 1 - Wall Follower).
	 * 
	 * @author SEAN TAN
	 */
	public static void avoidObstacle() {
		
	}

	/**
	   * This method returns the filtered distance between the obstacle and the ultrasonic sensor in cm.
	   * 
	   * @author SEAN TAN (based on Lab 1)
	   * @return the filtered distance between the obstacle and the ultrasonic sensor in cm
	   */
	public int readUSDistance(){
		//call filter
		return 0;
	}
	
	
	/**
	 * This method throws away invalid distance samples read by the ultrasonic sensor that correspond to a null signal.
	 * 
	 * @author SEAN TAN (based on Lab 1 code)
	 * @param distance raw distance measured by the ultrasonic sensor in cm
	 * @return the filtered distance in cm
	 */
	int filter(int distance) {
		return distance;
	}
	
}
