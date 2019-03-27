package com.eggdropper;

/**
 * 
 * @author Sergio Muñoz
 * This class defines the skyscraper for the egg drop tests
 */
public class Skyscraper {

	private int criticalFloor;
	
	public Skyscraper() {
		this.generateCriticalFloor();
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
		this.criticalFloor = (int) (Math.random() * 100) + 1;
	}
}
