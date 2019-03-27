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
	 * @throws Exception 
	 */
	public int minEggDropper100() throws Exception {
		
		int  maxFloorEggNotBroken = 0;
		int  minFloorEggBroken = 100;
		
		int currentFloor;

		Boolean criticalFloorFound = false;
		
		
		while(!criticalFloorFound) {
			
			//We calculate the next floor adding to the lowest floor the difference between both divided by two
			currentFloor = maxFloorEggNotBroken + ((minFloorEggBroken - maxFloorEggNotBroken) / 2);
			
			numberEggDrop++;
			
			if(isEggBroken(currentFloor)) {
				minFloorEggBroken = currentFloor;
				numberEggBroken++;
			} else {
				maxFloorEggNotBroken = currentFloor;
			}
			
			//If the difference between the highest floor that the egg has not been broken and the floor lower than the egg has been broken is one, 
			//we have found the critical floor, since the critical floor will be the lowest floor that the egg has been broken
			if((minFloorEggBroken - maxFloorEggNotBroken) == 1) {
				criticalFloorFound = true;
			}
			
			//If the floor is 0 the search has failed
			if(currentFloor == 0) {
				break;
			}
		}
		
		if(!criticalFloorFound) {
			throw new Exception("The critical floor has not been found");
		}
		
		return numberEggDrop;
		
	}
	
	/**
	 * Check if an egg has broken after an egg drop test
	 * @param currentFloor
	 * @return true if currentFloor is greater than or equal to the criticalFloor, or false otherwise
	 */
	private Boolean isEggBroken(int currentFloor) {		
		return currentFloor >= this.getSkyscraper().getCriticalFloor();		
	}	

}
