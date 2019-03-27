package com.eggdropper.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.eggdropper.EggDropper;
import com.eggdropper.Skyscraper;

/**
 * 
 * @author Sergio Mu�oz
 * Implements the egg dropper unit tests
 */
public class EggDropperTest {

	/**
	 * Check that no more launches than floors have the skyscraper
	 * @throws Exception 
	 */
	@Test
	void minEggDropper100Test() throws Exception {
		
		System.out.println("minEggDropper100Test");
		
		Skyscraper skyscraper = new Skyscraper();
		
		EggDropper eggDropper = new EggDropper(skyscraper);
		
		int minimunEggDropper = eggDropper.minEggDropper100();
		
		System.out.println("Minimun Egg Dropper: " + minimunEggDropper);
		
		assertTrue(minimunEggDropper >= 1 && minimunEggDropper <= 100);
	}

}
