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

}
