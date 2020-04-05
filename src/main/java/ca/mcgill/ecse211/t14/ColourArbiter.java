package ca.mcgill.ecse211.t14;

import static ca.mcgill.ecse211.t14.Resources.*;
import java.text.DecimalFormat;

/**
 * This class arbitrates between different colours - given Red, Green, and Blue input data, determines what colour the detected colour is.
 * The output is not based on confidence of probability density functions, but on how
 * many standard deviations away the input colours are from each known colour.
 * Communication of resulting colour is resolved in the Colour enumeration.
 * 
 * @author Edwin Pan
 * @author Sean Tan
 *
 */
public class ColourArbiter implements Runnable {

	// Debugging Tools for whatColourIsThis()
	public static boolean DEBUG_SWITCH = false;
	private static final DecimalFormat numberFormat = new DecimalFormat("######000.000000");
	// General debugging tool if the runnable thread is to be run a finite amount of
	// times
	public static long run_method_iteration_number = 0;
	public static boolean keep_running = true;

	/**
	 * This method converts enumerated colour instances into their associated integers to allow for array access.
	 * The means and variances of the input colour data are stored in a two dimensional array where the
	 * rows represent colours and the columns represent the rgb channels.
	 * 
	 * @param colour
	 * @return int associated integer of colour (0=BLUE, 1=GREEN, 2=ORANGE, 3=YELLOW)
	 */
	static int colourToInt(Colour colour) {
		if (colour == Colour.BLUE) {
			return 0;
		} else if (colour == Colour.GREEN) {
			return 1;
		} else if (colour == Colour.ORANGE) {
			return 2;
		} else if (colour == Colour.YELLOW) {
			return 3;
		}
		return -1;
	}

	/**
	 * This method returns the colour which most closesly resembles the provided colour based on
	 * how many standard deviations in varies from known colours' means in red,
	 * green and blue channels. You feed in RGB Values in the form of a ColourRGB
	 * instance; this method returns you what Colour it believes those values belong
	 * to. If it doesn't find the colour is like any of the colours it knows of - ie
	 * they are out of tolerances - then the method returns null as an "I don't
	 * know" response.
	 * 
	 * @param rgbValues
	 * @return Colour BLUE, GREEN, ORANGE, YELLOW	
	 */
	private static Colour whatColourIsThis(float[] rgbValues) {
		String debugString = ""; // Debugging
		// Iterating over all knowns colours, find the most likely match.
		Colour closestColour = Colour.BLUE;
		double lowestDeviationsToColour = Double.MAX_VALUE;
		for (Colour nextColour : Colour.values()) {
			double deviationsToNextColour = 0;
			for (int c = 0; c < rgbValues.length; c++) {
				double stdDeviationsInThisChannel = Math
						.abs(rgbValues[c] - RGB_AVERAGES_OF_COLOURS[colourToInt(nextColour)][c]);
				stdDeviationsInThisChannel /= RGB_VARIANCES_OF_COLOURS[colourToInt(nextColour)][c];
				stdDeviationsInThisChannel = Math.pow(stdDeviationsInThisChannel, 2);
				deviationsToNextColour += stdDeviationsInThisChannel;
			}
			deviationsToNextColour = Math.sqrt(deviationsToNextColour);
			debugString = debugString + nextColour.toString() + ":" + numberFormat.format(deviationsToNextColour)
					+ "\t";
			if (deviationsToNextColour < lowestDeviationsToColour) {
				closestColour = nextColour;
				lowestDeviationsToColour = deviationsToNextColour;
			}
		}
		// Debugging Printer
		if (DEBUG_SWITCH) {
			System.out.println(debugString);
		}
		// If the probability of it being a match is sufficiently high, return the
		// colour; otherwise null.
		if (lowestDeviationsToColour < COLOUR_MAX_DEVIATIONS_FOR_CLASSIFICATION) {
			return closestColour;
		}
		return null;

	}

	/**
	 * This synchronized method makes a measurement of whatever the main Colour
	 * Sensor is facing and returns what colour in the Colour enumeration it
	 * recognizes. Returns null if the readings are not too dissimilar from any of
	 * the known colours.
	 * 
	 * @return Colour The classification of the colour observed by the Colour sensor.
	 */
	public static Colour observeColour() {
		// Take RGB Measurements
		float[] rgb = new float[3];
		// mainColourSensor.getRGBMode().fetchSample(rgb, 0);
		// Figure out what the colour is
		FRONT_COLOUR_SENSOR.fetchSample(rgb, 0);
		Colour colour = whatColourIsThis(rgb);
		// return the colour
		return colour;
	}

	/**
	 * Debugging method which takes a measurement from the Colour Sensor and prints
	 * out the readings into the EV3 Console.
	 * 
	 * @return Colour Data from colour sensor readings
	 */
	private static Colour observeAndPrintColour() {
		float[] rgb = new float[3];
		FRONT_COLOUR_SENSOR.fetchSample(rgb, 0);
		Colour clr = whatColourIsThis(rgb);
		if (!DEBUG_SWITCH) {
			String outputString = rgb[0] + "\t" + rgb[1] + "\t" + rgb[2] + "\t"
					+ ((clr == null) ? "null" : clr.toString());
			System.out.println(outputString);
		}
		return clr;
	}

	/**
	 * Ordinarily, this arbiter is never ran as a thread. However, for diagnostics
	 * purposes it is necessary to be able to test out this system on its own; as
	 * such, the run interface is used to allow this system to output diagnostics
	 * strings separate from the main thread.
	 */
	@Override
	public void run() {
		while (keep_running) {
			observeAndPrintColour();
			run_method_iteration_number++;
		}
	}

}
