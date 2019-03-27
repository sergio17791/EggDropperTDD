package com.eggdropper.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.eggdropper.EggDropper;
import com.eggdropper.Skyscraper;

/**
 * 
 * @author Sergio Muñoz
 * Implements the egg dropper unit tests
 */
public class EggDropperTest {

	/**
	 * Check that no more launches than floors have the skyscraper
	 */
	@Test
	void minEggDropper100Test() {
		
		Skyscraper skyscraper = new Skyscraper();
		
		EggDropper eggDropper = new EggDropper(skyscraper);
		
		int minimunEggDropper = eggDropper.minEggDropper100();
		
		assertTrue(minimunEggDropper >= 1 && minimunEggDropper <= 100);
	}

}
