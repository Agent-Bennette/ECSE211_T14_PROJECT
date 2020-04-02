package ca.mcgill.ecse211.t14;

//static import to avoid duplicating variables and make the code easier to read
import static ca.mcgill.ecse211.t14.Resources.*;

import ca.mcgill.ecse211.t14.Navigator.MissionStatus;
import lejos.hardware.Button;

/**
 * The main driver class for this project.
 */
public class Main {

	/**
	 * The main entry point. The main function first starts the <code>Odometer</code>, <code>LineWatcher</code>, and <code>UltrasonicWatcher</code> threads.
	 * The <code>Odometer</code> thread keeps track of the robot's positions and orientation.
	 * The <code>UltrasonicWatcher</code> thread is responsible for driving the usSensor.
	 * the <code>LineWatcher</code> thread is responsible for driving the light sensors.
	 * After that, main runs Navigator threads to complete the robot's mission.
	 * @param args not used
	 */
	public static void main(String[] args) {
		//test wifi
		//System.out.println(szg.ll.x);

		//wait for start button to be pressed
		Button.waitForAnyPress();
		
		//the robot then wait for all parameters to be downloaded from server
		
		//start the odometer, linewatcher and ulstrasonicwatcher threads
		new Thread(odo).start();
		LineWatcher line = new LineWatcher();
		LineWatcher leftSensor = line.getLeftLineWatcher();
		LineWatcher rightSensor = line.getRightLineWatcher();
		new Thread(line).start();
		UltrasonicWatcher usSensor = new UltrasonicWatcher();
		new Thread(usSensor).start();
		
		//start the navigator thread 
		Navigator nav = new Navigator(MissionStatus.LocalizingInitially, red, green);
		new Thread(nav).start();
		
		//wait until user wants to end the program
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
