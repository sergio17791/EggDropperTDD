package com.eggdropper;

/**
 * 
 * @author Sergio Muñoz
 * This class defines egg drop tests from the skyscraper
 */
public class EggDropper {
	
	private int numberEggDrop;
	private int numberEggBroken;
	private Skyscraper skyscraper;
	
	public EggDropper(Skyscraper skyscraper) {
		this.numberEggDrop = 0;
		this.numberEggBroken = 0;
		this.setSkyscraper(skyscraper);
	}
	
	/**
	 * @return the numberEggDrop
	 */
	public int getNumberEggDrop() {
		return numberEggDrop;
	}

	/**
	 * @param numberEggDrop the numberEggDrop to set
	 */
	public void setNumberEggDrop(int numberEggDrop) {
		this.numberEggDrop = numberEggDrop;
	}

	/**
	 * @return the numberEggBroken
	 */
	public int getNumberEggBroken() {
		return numberEggBroken;
	}

	/**
	 * @param numberEggBroken the numberEggBroken to set
	 */
	public void setNumberEggBroken(int numberEggBroken) {
		this.numberEggBroken = numberEggBroken;
	}

	/**
	 * @return the skyscraper
	 */
	public Skyscraper getSkyscraper() {
		return skyscraper;
	}

	/**
	 * @param skyscraper the skyscraper to set
	 */
	public void setSkyscraper(Skyscraper skyscraper) {
		this.skyscraper = skyscraper;
	}

	/**
	 * Search the critical floor using the binary search algorithm among the hundred floors of the skyscraper. 
	 * Considering that if the egg breaks from a floor, it also breaks from the upper floors, and considering that if it does not break from a floor, 
	 * it does not break from the lower floors, it can be considered that the search array is ordered.
	 * @return the numberEggDrop
	 */
	public int minEggDropper100() {
		
		int  maxFloorEggNotBroken = 0;
		int  minFloorEggBroken = 0;
		
		int currentFloor = 100/2;

		
		
		return numberEggDrop;
		
	}
	
	

}
