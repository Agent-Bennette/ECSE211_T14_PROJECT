package ca.mcgill.ecse211.t14;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorMode;

import ca.mcgill.ecse211.t14.playingfield.Point;
import ca.mcgill.ecse211.t14.playingfield.Region;
import ca.mcgill.ecse211.wificlient.WifiConnection;
import java.math.BigDecimal;
import java.util.Map;


/**
 * This class is used to define static resources in one place for easy access
 * and to avoid cluttering the rest of the codebase. All resources can be
 * imported at once like this:
 * 
 * <p>
 * {@code import static ca.mcgill.ecse211.lab3.Resources.*;}
 */
public class Resources {

	/*
	 * =============================================================================
	 * ==========
	 * 
	 * HARDWARE CHARACTERISTICS Constants to do with the physical dimensions or
	 * other useful parametres of the robot are here.
	 * 
	 * =============================================================================
	 * ==========
	 */

	/**
	 * The wheel radius in centimeters.
	 */
	public static final double WHEEL_RAD = 2.15; // 2.13 with 18.9

	/**
	 * The robot width in centimeters.
	 */
	public static final double BASE_WIDTH = 17.15;

	/**
	 * size of a tile
	 */
	public static final double TILE_SIZE = 30.48;

	/*
	 * =============================================================================
	 * ==========
	 * 
	 * SOFTWARE RESOURCES - Mathematical Constants - Sensor Behaviour Constants -
	 * Data Analysis Constants - Motion Control Constants - Localization Constants
	 * 
	 * =============================================================================
	 * ==========
	 */

	/*
	 * Mathematical constants
	 */

	// Mathematical PI constant
	public static final float PI = 3.1415926535898535f;

	/*
	 * Sensor Behaviour Constants
	 */

	/**
	 * distance from light sensor to the head
	 */
	public static final int SENSOR_DIST = 3;

	/**
	 * object distance
	 */
	public static final int MIN_DIST = 2;
	
	/**
	 * object detection distance
	 */
	public static final int OBJECT_DETECTION_THRESHOLD = 10;
	
	/**
	 * object detection distance
	 */
	public static final int CART_DETECTION_ANGLE= 60;

	/**
	 * max distance
	 */
	public static final double MAX_DIST = 30.0;

	/**
	 * edge and noise for us localization
	 */
	public static final double EDGE = 17.2;
	
	/**
	 * noise zone 
	 */
	public static final double NOISE = 0.3;

	/**
	 * light sensor threshold
	 */
	public static final int THRESHOLD = -30;

	/**
	 * Sleep time
	 */
	public static final int SLEEP_TIME = 1000;

	public static final int SLEEP = 5000;

	/*
	 * Data Analysis Constants
	 */

	// Sample Array Overhead; for the arrays exclusively used for taking in the
	// values from sensors, how large they are.
	public static final int SAMPLE_OVERHEAD = 5;

	// Colour Probability Tolerance to be considered of a particular colour.
	public static final double COLOUR_MAX_DEVIATIONS_FOR_CLASSIFICATION = 4.5;

	// Colour Callibration Configurations
	public static final float[][] RGB_AVERAGES_OF_COLOURS = { { 0.018f, 0.078f, 0.085f }, // Blue's RGB mean, obtained
			// on a blue whiteout
			// dispenser
			{ 0.038f, 0.077f, 0.017f }, // Green's RGB mean, obtained on a piece of green painter's tape
			{ 0.076f, 0.022f, 0.008f }, // Orange's RGB mean, obtained on an orange microfibre cloth
			{ 0.100f, 0.071f, 0.021f } // Yellow's RGB mean, obtained on a yellow whiteout dispenser
	};
	public static final float[][] RGB_VARIANCES_OF_COLOURS = { { 0.004f, 0.018f, 0.013f }, // Blue's RGB variance,
			// obtained on a blue
			// whiteout dispenser
			{ 0.006f, 0.012f, 0.002f }, // Green's RGB variance, obtained on a piece of green painter's tape
			{ 0.007f, 0.010f, 0.001f }, // Orange's RGB variance, obtained on an orange microfibre cloth
			{ 0.010f, 0.008f, 0.001f } // Yellow's RGB variance, obtained on a yellow whiteout dispenser
	};

	/*
	 * Motion Control System Constants
	 */

	/**
	 * The speed at which the robot moves forward in degrees per second.
	 */
	public static final int FORWARD_SPEED = 200;

	/**
	 * The speed at which the robot does light localization
	 */
	public static final int LOCAL_SPEED = 55;

	/**
	 * The speed at which the robot rotates in degrees per second.
	 */
	public static final int ROTATE_SPEED = 150;

	/**
	 * The motor acceleration in degrees per second squared.
	 */
	public static final int ACCELERATION = 1500;

	/*
	 * Localization Constants
	 */

	/*
	 * =============================================================================
	 * ==========
	 * 
	 * HARDWARE RESOURCES References to specific pieces of hardware and their usage
	 * frequency here.
	 * 
	 * =============================================================================
	 * ==========
	 */

	/**
	 * The left motor.
	 */
	public static final EV3LargeRegulatedMotor LEFT_MOTOR = new EV3LargeRegulatedMotor(MotorPort.D);

	/**
	 * The right motor.
	 */
	public static final EV3LargeRegulatedMotor RIGHT_MOTOR = new EV3LargeRegulatedMotor(MotorPort.A);

	/**
	 * light sensor
	 */
	public static final SensorMode LEFT_LIGHT_SAMPLER = (new EV3ColorSensor(SensorPort.S2)).getRedMode();
	public static final SensorMode RIGHT_LIGHT_SAMPLER = (new EV3ColorSensor(SensorPort.S1)).getRedMode();
	public static final SensorMode FRONT_COLOUR_SENSOR = new EV3ColorSensor(SensorPort.S3).getRGBMode();

	/**
	 * us sensor
	 */
	public static final EV3UltrasonicSensor ULTRASONIC_SENSOR = new EV3UltrasonicSensor(SensorPort.S4);

	/**
	 * The LCD.
	 */
	public static final TextLCD LCD = LocalEV3.get().getTextLCD();

	/*
	 * =============================================================================
	 * ==========
	 * 
	 * SOFTWARE COMPONENT REFERENCES There should only ever been one referenced
	 * passed for each sensor, each thread, and each data encapsulation instance.
	 * References between threads should be accomplished only through the use of
	 * references provided here in this section in the Resources file. Further note
	 * that as these threads have sleep periods, their constants are also put in
	 * this section of resources.
	 * 
	 * =============================================================================
	 * ==========
	 */

	/**
	 * odometer
	 */
	public static final Odometer odo = Odometer.getOdometer();
	public static final int ODOMETER_PERIOD = 100;
	
	/**
	 * ==============================================================================
	 * =========
	 * WIFI INTEGRATION 
	 * These are the necessary codes provided to integrate the robot with wifi functionality
	 * 
	 * ==============================================================================
	 * =========
	 */
	
	// Set these as appropriate for your team and current situation
	  /**
	   * The default server IP used by the profs and TA's.
	   */
	  public static final String DEFAULT_SERVER_IP = "192.168.2.3";
	  
	  /**
	   * The IP address of the server that transmits data to the robot. For the beta demo and
	   * competition, replace this line with
	   * 
	   * <p>{@code public static final String SERVER_IP = DEFAULT_SERVER_IP;}
	   */
	  public static final String SERVER_IP = "192.168.2.3"; // = DEFAULT_SERVER_IP;
	  
	  /**
	   * Your team number.
	   */
	  public static final int TEAM_NUMBER = 13;
	  
	  /** 
	   * Enables printing of debug info from the WiFi class. 
	   */
	  public static final boolean ENABLE_DEBUG_WIFI_PRINT = true;
	  
	  /**
	   * Enable this to attempt to receive Wi-Fi parameters at the start of the program.
	   */
	  public static final boolean RECEIVE_WIFI_PARAMS = true;
	  
	  /**
	   * Container for the Wi-Fi parameters.
	   */
	  public static Map<String, Object> wifiParameters;
	  
	  // This static initializer MUST be declared before any Wi-Fi parameters.
	  static {
	    receiveWifiParameters();
	  }
	  
	  /** Red team number. */
	  public static int redTeam = getWP("RedTeam");

	  /** Red team's starting corner. */
	  public static int redCorner = getWP("RedCorner");

	  /** Green team number. */
	  public static int greenTeam = getWP("GreenTeam");

	  /** Green team's starting corner. */
	  public static int greenCorner = getWP("GreenCorner");

	  /** The Red Zone. */
	  public static Region red = makeRegion("Red");

	  /** The Green Zone. */
	  public static Region green = makeRegion("Green");

	  /** The Island. */
	  public static Region island = makeRegion("Island");

	  /** The red tunnel footprint. */
	  public static Region tnr = makeRegion("TNR");

	  /** The green tunnel footprint. */
	  public static Region tng = makeRegion("TNG");

	  /** The red search zone. */
	  public static Region szr = makeRegion("SZR");

	  /** The green search zone. */
	  public static Region szg = makeRegion("SZG");
	  
	  /**
	   * Receives Wi-Fi parameters from the server program.
	   */
	  public static void receiveWifiParameters() {
	    // Only initialize the parameters if needed
	    if (!RECEIVE_WIFI_PARAMS || wifiParameters != null) {
	      return;
	    }
	    System.out.println("Waiting to receive Wi-Fi parameters.");

	    // Connect to server and get the data, catching any errors that might occur
	    try (WifiConnection conn =
	        new WifiConnection(SERVER_IP, TEAM_NUMBER, ENABLE_DEBUG_WIFI_PRINT)) {
	      /*
	       * getData() will connect to the server and wait until the user/TA presses the "Start" button
	       * in the GUI on their laptop with the data filled in. Once it's waiting, you can kill it by
	       * pressing the back/escape button on the EV3. getData() will throw exceptions if something
	       * goes wrong.
	       */
	      wifiParameters = conn.getData();
	    } catch (Exception e) {
	      System.err.println("Error: " + e.getMessage());
	    }
	  }
	  
	  /**
	   * Returns the Wi-Fi parameter int value associated with the given key.
	   * 
	   * @param key the Wi-Fi parameter key
	   * @return the Wi-Fi parameter int value associated with the given key
	   */
	  public static int getWP(String key) {
	    if (wifiParameters != null) {
	      return ((BigDecimal) wifiParameters.get(key)).intValue();
	    } else {
	      return 0;
	    }
	  }
	  
	  /** 
	   * Makes a point given a Wi-Fi parameter prefix.
	   */
	  public static Point makePoint(String paramPrefix) {
	    return new Point(getWP(paramPrefix + "_x"), getWP(paramPrefix + "_y"));
	  }
	  
	  /**
	   * Makes a region given a Wi-Fi parameter prefix.
	   */
	  public static Region makeRegion(String paramPrefix) {
	    return new Region(makePoint(paramPrefix + "_LL"), makePoint(paramPrefix + "_UR"));
	  }

}
