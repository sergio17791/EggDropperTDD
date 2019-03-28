package com.eggdropper;

/**
 * 
 * @author Sergio Muñoz
 * This class defines the skyscraper for the egg drop tests
 */
public class Skyscraper {

	private int criticalFloor;
	private int floorsNumber;
	
	public Skyscraper() {
		this.floorsNumber = 100;
		this.generateCriticalFloor();		
	}
	
	public Skyscraper(int floorsNumber) {
		this.floorsNumber = floorsNumber;
		this.generateCriticalFloor();		
	}

	/**
	 * @return the floorsNumber
	 */
	public int getFloorsNumber() {
		return floorsNumber;
	}

	/**
	 * @param floorsNumber the floorsNumber to set
	 */
	public void setFloorsNumber(int floorsNumber) {
		this.floorsNumber = floorsNumber;
	}

	/**
	 * @return the criticalFloor
	 */
	public int getCriticalFloor() {
		return criticalFloor;
	}

	/**
	 * Generate a random critical floor
	 */
	public void generateCriticalFloor() {
		this.criticalFloor = (int) (Math.random() * floorsNumber) + 1;
	}
}
