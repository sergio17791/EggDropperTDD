package com.eggdropper;

/**
 * 
 * @author Sergio Mu�oz
 * This class defines egg drop tests from the skyscraper
 */
public class EggDropper {
	
	private int numberEggDrop;
	private int numberEggBroken;
	private Skyscraper skyscraper;
	private int currentFloor;
	private int  maxFloorEggNotBroken;
	
	public EggDropper(Skyscraper skyscraper) {
		this.numberEggDrop = 0;
		this.numberEggBroken = 0;
		this.currentFloor = 0;
		this.maxFloorEggNotBroken = 0;
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
	 * @return the currentFloor
	 */
	public int getCurrentFloor() {
		return currentFloor;
	}

	/**
	 * @param currentFloor the currentFloor to set
	 */
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
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

		int minFloorEggBroken = 100;
		
		Boolean criticalFloorFound = false;
		
		while(!criticalFloorFound) {
			
			//We calculate the next floor adding to the lowest floor the difference between both divided by two
			currentFloor = maxFloorEggNotBroken + ((minFloorEggBroken - maxFloorEggNotBroken) / 2);
			
			numberEggDrop++;
			
			if(isEggBroken()) {
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
	private Boolean isEggBroken() {		
		return currentFloor >= this.getSkyscraper().getCriticalFloor();		
	}	

	/**
	 * Search for the critical floor by launching ten by ten until the first egg breaks. 
	 * Then, continue from the previous nine floors until you find the floor where the egg breaks. 
	 * In the worst case, 18 launches will be made
	 * @return the numberEggDrop
	 * @throws Exception
	 */
	public int minEggDropper2( ) throws Exception {
		
		Boolean criticalFloorFound = false;
		
		while(!criticalFloorFound) {
			
			//We calculate the next floor, adding ten floors, or if an egg has already been broken, adding floor to floor.
			//To try to break the minimum number of eggs, if we reach the 90th floor, we begin to increase from floor to floor.
			if(numberEggBroken == 0 && currentFloor < 90) {
				currentFloor = currentFloor + 10;
			} else {
				currentFloor = currentFloor + 1;
			}			
			
			numberEggDrop++;
			
			if(isEggBroken()) {
				if(numberEggBroken == 0 && currentFloor < 90) {
					currentFloor = currentFloor - 10;
				} else {
					criticalFloorFound = true;
				}	
				
				numberEggBroken++;
			} 	
			
			//If the floor is 101 the search has failed
			if(currentFloor == 101 ) {
				break;
			}
		}
		
		if(!criticalFloorFound) {
			throw new Exception("The critical floor has not been found");
		}
		
		
		return numberEggDrop;
		
	}
}
