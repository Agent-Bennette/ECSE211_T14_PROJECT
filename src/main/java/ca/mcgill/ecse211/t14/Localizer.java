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
	 * Executes initial localization
	 */
	public void initializePosition() {
		// TODO: Implement first localization algorithm
		throw new UnsupportedOperationException(); // remove this when done.

	}

	/**
	 * Executes to-intersection-of-lines localization. Assumption: The robot does
	 * not veer off the course so much that the robot's assumption that it is near
	 * an intersection is true. Assumption: The robot's orientation is at an error
	 * of less than 15 degrees plus or minus.
	 * 
	 * @param x the x-coordinate of the intersection targeted
	 * @param y the y-coordinate of the intersection targeted.
	 */
	public void localizeToCross(float x, float y) {
		// TODO: Implement the relocalization system used in Lab 5
		throw new UnsupportedOperationException(); // remove this when done.
	}

}