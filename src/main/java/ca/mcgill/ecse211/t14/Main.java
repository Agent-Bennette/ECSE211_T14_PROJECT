package ca.mcgill.ecse211.t14;

//static import to avoid duplicating variables and make the code easier to read
import static ca.mcgill.ecse211.t14.Resources.*;
import lejos.hardware.Button;

/**
 * The main driver class for the lab.
 */
public class Main {

	/**
	 * The main entry point.
	 * The main function first starts the odometer, linewatcher, and ultrasonicwatcher threads. 
	 * The odometer thread keeps track of the robot's positions and orientation.
	 * The ultrasonicwatcher thread is responsible for driving the ussensor.
	 * the linewatcher thread is responsible for driving the light sensors.
	 * After that, main runs Navigator threads to complete the robot's mission.
	 * @param args not used
	 */
	public static void main(String[] args) {
		//test wifi
		System.out.println(szg.ll.x);

		//Escape method
		while (Button.waitForAnyPress() != Button.ID_ESCAPE) {
			// Empty
		}
		System.exit(0);

	}

	/**
	 * Sleeps the thread which calls it, I assume.
	 * 
	 * @param duration length of sleep in milliseconds
	 */
	public static void sleepFor(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// Empty
		}
	}
	
}
