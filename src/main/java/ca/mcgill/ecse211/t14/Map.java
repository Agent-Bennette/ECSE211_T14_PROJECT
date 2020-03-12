package ca.mcgill.ecse211.t14;

/**
 * Encapsulation of a map data. Use one per team.
 * 
 * @author Edwin Pan
 *
 */
public class Map {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Map Attributes
	private float startingArea_UR_x;
	private float startingArea_UR_y;
	private float startingArea_LL_x;
	private float startingArea_LL_y;
	private float bridgeArea_UR_x;
	private float bridgeArea_UR_y;
	private float bridgeArea_LL_x;
	private float bridgeArea_LL_y;
	private float searchArea_UR_x;
	private float searchArea_UR_y;
	private float searchArea_LL_x;
	private float searchArea_LL_y;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Map(float aStartingArea_UR_x, float aStartingArea_UR_y, float aStartingArea_LL_x, float aStartingArea_LL_y,
			float aBridgeArea_UR_x, float aBridgeArea_UR_y, float aBridgeArea_LL_x, float aBridgeArea_LL_y,
			float aSearchArea_UR_x, float aSearchArea_UR_y, float aSearchArea_LL_x, float aSearchArea_LL_y) {
		startingArea_UR_x = aStartingArea_UR_x;
		startingArea_UR_y = aStartingArea_UR_y;
		startingArea_LL_x = aStartingArea_LL_x;
		startingArea_LL_y = aStartingArea_LL_y;
		bridgeArea_UR_x = aBridgeArea_UR_x;
		bridgeArea_UR_y = aBridgeArea_UR_y;
		bridgeArea_LL_x = aBridgeArea_LL_x;
		bridgeArea_LL_y = aBridgeArea_LL_y;
		searchArea_UR_x = aSearchArea_UR_x;
		searchArea_UR_y = aSearchArea_UR_y;
		searchArea_LL_x = aSearchArea_LL_x;
		searchArea_LL_y = aSearchArea_LL_y;
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public boolean setStartingArea_UR_x(float aStartingArea_UR_x) {
		boolean wasSet = false;
		startingArea_UR_x = aStartingArea_UR_x;
		wasSet = true;
		return wasSet;
	}

	public boolean setStartingArea_UR_y(float aStartingArea_UR_y) {
		boolean wasSet = false;
		startingArea_UR_y = aStartingArea_UR_y;
		wasSet = true;
		return wasSet;
	}

	public boolean setStartingArea_LL_x(float aStartingArea_LL_x) {
		boolean wasSet = false;
		startingArea_LL_x = aStartingArea_LL_x;
		wasSet = true;
		return wasSet;
	}

	public boolean setStartingArea_LL_y(float aStartingArea_LL_y) {
		boolean wasSet = false;
		startingArea_LL_y = aStartingArea_LL_y;
		wasSet = true;
		return wasSet;
	}

	public boolean setBridgeArea_UR_x(float aBridgeArea_UR_x) {
		boolean wasSet = false;
		bridgeArea_UR_x = aBridgeArea_UR_x;
		wasSet = true;
		return wasSet;
	}

	public boolean setBridgeArea_UR_y(float aBridgeArea_UR_y) {
		boolean wasSet = false;
		bridgeArea_UR_y = aBridgeArea_UR_y;
		wasSet = true;
		return wasSet;
	}

	public boolean setBridgeArea_LL_x(float aBridgeArea_LL_x) {
		boolean wasSet = false;
		bridgeArea_LL_x = aBridgeArea_LL_x;
		wasSet = true;
		return wasSet;
	}

	public boolean setBridgeArea_LL_y(float aBridgeArea_LL_y) {
		boolean wasSet = false;
		bridgeArea_LL_y = aBridgeArea_LL_y;
		wasSet = true;
		return wasSet;
	}

	public boolean setSearchArea_UR_x(float aSearchArea_UR_x) {
		boolean wasSet = false;
		searchArea_UR_x = aSearchArea_UR_x;
		wasSet = true;
		return wasSet;
	}

	public boolean setSearchArea_UR_y(float aSearchArea_UR_y) {
		boolean wasSet = false;
		searchArea_UR_y = aSearchArea_UR_y;
		wasSet = true;
		return wasSet;
	}

	public boolean setSearchArea_LL_x(float aSearchArea_LL_x) {
		boolean wasSet = false;
		searchArea_LL_x = aSearchArea_LL_x;
		wasSet = true;
		return wasSet;
	}

	public boolean setSearchArea_LL_y(float aSearchArea_LL_y) {
		boolean wasSet = false;
		searchArea_LL_y = aSearchArea_LL_y;
		wasSet = true;
		return wasSet;
	}

	public float getStartingArea_UR_x() {
		return startingArea_UR_x;
	}

	public float getStartingArea_UR_y() {
		return startingArea_UR_y;
	}

	public float getStartingArea_LL_x() {
		return startingArea_LL_x;
	}

	public float getStartingArea_LL_y() {
		return startingArea_LL_y;
	}

	public float getBridgeArea_UR_x() {
		return bridgeArea_UR_x;
	}

	public float getBridgeArea_UR_y() {
		return bridgeArea_UR_y;
	}

	public float getBridgeArea_LL_x() {
		return bridgeArea_LL_x;
	}

	public float getBridgeArea_LL_y() {
		return bridgeArea_LL_y;
	}

	public float getSearchArea_UR_x() {
		return searchArea_UR_x;
	}

	public float getSearchArea_UR_y() {
		return searchArea_UR_y;
	}

	public float getSearchArea_LL_x() {
		return searchArea_LL_x;
	}

	public float getSearchArea_LL_y() {
		return searchArea_LL_y;
	}

	public void delete() {
	}

	public String toString() {
		return super.toString() + "[" + "startingArea_UR_x" + ":" + getStartingArea_UR_x() + "," + "startingArea_UR_y"
				+ ":" + getStartingArea_UR_y() + "," + "startingArea_LL_x" + ":" + getStartingArea_LL_x() + ","
				+ "startingArea_LL_y" + ":" + getStartingArea_LL_y() + "," + "bridgeArea_UR_x" + ":"
				+ getBridgeArea_UR_x() + "," + "bridgeArea_UR_y" + ":" + getBridgeArea_UR_y() + "," + "bridgeArea_LL_x"
				+ ":" + getBridgeArea_LL_x() + "," + "bridgeArea_LL_y" + ":" + getBridgeArea_LL_y() + ","
				+ "searchArea_UR_x" + ":" + getSearchArea_UR_x() + "," + "searchArea_UR_y" + ":" + getSearchArea_UR_y()
				+ "," + "searchArea_LL_x" + ":" + getSearchArea_LL_x() + "," + "searchArea_LL_y" + ":"
				+ getSearchArea_LL_y() + "]";
	}
}