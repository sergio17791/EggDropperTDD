package com.eggdropper.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.eggdropper.Skyscraper;

class SkyscraperTest {

	/**
	 * Perform a test to verify that the critical floor has been correctly generated between the first floor and the top floor of the skyscraper
	 */
	@Test
	void generateCriticalFloorTest() {
		Skyscraper skyscraper = new Skyscraper();
		int criticalFloor = skyscraper.getCriticalFloor();
		
		assertTrue(criticalFloor >= 1 && criticalFloor <= 100);
	}

	
	/**
	 * Perform a test to verify that the critical floor has been correctly generated between the first floor and the top floor of the skyscraper with number of floors variable
	 * @throws Exception 
	 */
	@Test
	void generateCriticalFloorVariableTest() throws Exception {
		
		Skyscraper skyscraper = new Skyscraper(1);		
		assertTrue(skyscraper.getCriticalFloor() >= 1 && skyscraper.getCriticalFloor() <= skyscraper.getFloorsNumber());
	    skyscraper = new Skyscraper(100);		
		assertTrue(skyscraper.getCriticalFloor() >= 1 && skyscraper.getCriticalFloor() <= skyscraper.getFloorsNumber());
	    skyscraper = new Skyscraper(1000);		
		assertTrue(skyscraper.getCriticalFloor() >= 1 && skyscraper.getCriticalFloor() <= skyscraper.getFloorsNumber());
	    skyscraper = new Skyscraper(10000);		
		assertTrue(skyscraper.getCriticalFloor() >= 1 && skyscraper.getCriticalFloor() <= skyscraper.getFloorsNumber());
	    skyscraper = new Skyscraper(100000);		
		assertTrue(skyscraper.getCriticalFloor() >= 1 && skyscraper.getCriticalFloor() <= skyscraper.getFloorsNumber());
	    skyscraper = new Skyscraper(1000000);		
		assertTrue(skyscraper.getCriticalFloor() >= 1 && skyscraper.getCriticalFloor() <= skyscraper.getFloorsNumber());
		
		assertThrows(Exception.class, () -> {
			new Skyscraper(0);	
		  });
	}

}
