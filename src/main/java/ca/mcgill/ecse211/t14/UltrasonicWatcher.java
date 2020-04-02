package ca.mcgill.ecse211.t14;

import java.lang.Runnable;

/**
 * 
 * Thread in charge of operating the ultrasonic sensor. Features definitely
 * include periodic pinging of the ultrasonic sensor and the ability to obtain
 * said pinging data (ie distance measured). Features may or may not include,
 * depending on hardward decision, the ability to oscillate the angle at which
 * the ultrasonic sensor faces front more to the left and the right. The ability
 * to operate in these two different will apply a setModeForwardStraight() and a
 * setModeForwardSweeping() methods interface. getData() always returns distance
 * values obtained in a two-column and multiple-row array so as to pair the
 * angle a measurement was made and the measurement together.
 * 
 * @author of interface: Edwin Pan
 * {@link java.lang.Thread}
 */
public class UltrasonicWatcher implements Runnable {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public UltrasonicWatcher() {
		super();
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public void delete() {
	}

	/**
	 * Changes the mode of the ultrasonic sensor to always point straight forward.
	 */
	public void setModeForwardStraight() {
		// TODO: Method which faces the ultrasonic sensor forward as it samples, as
		// opposed to sweeping left and right.
		throw new UnsupportedOperationException(); // remove this when done.
	}

	/**
	 * Changes the mode of the ultrasonic sensor to use the motor attached to the
	 * ultrasonic sensor to osccilate left and right for a total osccilation range
	 * of 90 degrees (from 45 to the left to 45 to the right).
	 */
	public void setModeForwardSweeping() {
		// TODO: Method which osccilates the ultrasonic sensor left and right, as
		// opposed to straight forward.
		throw new UnsupportedOperationException(); // remove this when done.
	}

	/**
	 * Gets an double array of the most recently obtained measurements and the angle
	 * at which they were measured. First index is for datapoint and second index is
	 * for choosing between [1] measurement and [0] angle.
	 * 
	 * @return Nx2 array of measurements and the angles they were measured from.
	 */
	public double[][] getData() {
		throw new UnsupportedOperationException(); // remove this when done.
	}

	/**
	 * Periodically uses the ultrasonic sensor and, depending on hardware, moves the
	 * ultrasonic sensor motor.
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(); // remove this when done.
	}

}