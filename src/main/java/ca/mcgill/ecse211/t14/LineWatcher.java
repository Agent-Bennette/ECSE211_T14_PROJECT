/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse211.t14;

import java.lang.Runnable;
import lejos.hardware.sensor.SensorMode;

import static ca.mcgill.ecse211.t14.Resources.LEFT_LIGHT_SAMPLER;
import static ca.mcgill.ecse211.t14.Resources.RIGHT_LIGHT_SAMPLER;

/**
 * 
 * Thread class in charge of a single light sensor. Constructor is private as
 * there are to be only two unique instances of the system ever in use: one for
 * the left line sensor and one for the right line sensor. Upon receiving these
 * instances, they can then be started as threads. The main interface for
 * interacting with these threads is then to use the foundLine() method which
 * returns a long value representing the system time in in milliseconds in which
 * the most recent line was detected. Note that foundLine() returns -1 if there
 * previously found line had previously been disclosed (ie the previous time
 * foundLine() gave the same value as the current foundLine() would, were it not
 * for this condition) or if a line was never detected.
 * 
 * @author of interface Edwin Pan
 * {@link java.lang.Thread}
 */
public class LineWatcher implements Runnable {

	// -----------------------
	// STATICS
	// -----------------------

	private static LineWatcher leftLineWatcher = null;
	private static LineWatcher rightLineWatcher = null;

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	private SensorMode light_sensor;
	private long line_time;
	private double prev_light_value;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public LineWatcher() {}
	
	private LineWatcher(SensorMode lineSensor) {
		super();
		light_sensor = lineSensor;
		line_time = -1;
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	/**
	 * Singleton constructor for the left line watcher.
	 * 
	 * @return the left line watcher
	 */
	public LineWatcher getLeftLineWatcher() {
		if (leftLineWatcher == null) {
			leftLineWatcher = new LineWatcher(LEFT_LIGHT_SAMPLER);
		}
		return leftLineWatcher;
	}

	/**
	 * Singleton constructor for the right line watcher.
	 * 
	 * @return the right line watcher.
	 */
	public LineWatcher getRightLineWatcher() {
		if (rightLineWatcher == null) {
			rightLineWatcher = new LineWatcher(RIGHT_LIGHT_SAMPLER);
		}
		return rightLineWatcher;
	}

	/**
	 * Returns the long value representing the time at which the previous line was
	 * detected (useful for checking how unaligned the other sensor is to this
	 * sensor). If no line has been detected since the previous or no line was ever
	 * detected, returns -1.
	 * 
	 * @return system time in milliseconds when most recent new line was detected.
	 */
	public long foundLine() {
		long recent_line_time = this.line_time;
		if (this.line_time > 0) {
			this.line_time = -1;
		}
		return recent_line_time;
	}

	/**
	 * Thread algorithm which periodically checks light values from the light sensor
	 * and determines if a line has been found. A line being found is reflected in
	 * the value that would then be obtained in foundLine.
	 */
	@Override
	public void run() {
		// TODO Make the system periodically check for lines and check to see if the new
		// light value and prev_light_value differ in a way such that a line is found.
		// if a line is found, this should be indicated in line_time.

	}

}