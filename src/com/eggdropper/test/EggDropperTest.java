package com.eggdropper.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.eggdropper.EggDropper;
import com.eggdropper.Skyscraper;

/**
 * 
 * @author Sergio Muñoz
 * Implements the egg dropper unit tests
 */
public class EggDropperTest {
	
	private Skyscraper skyscraper;
	
	@BeforeEach
	void initSkyscraper () {
		 skyscraper = new Skyscraper();
	}

	/**
	 * Check that no more launches than floors have the skyscraper on the minEggDropper100
	 * @throws Exception 
	 */
	@Test
	void minEggDropper100Test() throws Exception {
		
		System.out.println("minEggDropper100Test");
				
		EggDropper eggDropper = new EggDropper(skyscraper);
		
		int minimunEggDropper = eggDropper.minEggDropper100();
		
		System.out.println("Minimun Egg Dropper: " + minimunEggDropper);
		
		assertTrue(minimunEggDropper >= 1 && minimunEggDropper <= 100);
	}
	
	/**
	 * Check that no more launches than floors have the skyscraper on the minEggDropper2
	 * @throws Exception 
	 */
	@Test
	void minEggDropper2Test() throws Exception {
		
		System.out.println("minEggDropper2Test");
		
		EggDropper eggDropper = new EggDropper(skyscraper);
		
		int minimunEggDropper = eggDropper.minEggDropper2();
		
		System.out.println("Minimun Egg Dropper: " + minimunEggDropper);
		
		assertTrue(minimunEggDropper >= 1 && minimunEggDropper <= 100);
		assertTrue(eggDropper.getNumberEggBroken() >= 0 && eggDropper.getNumberEggBroken() <= 2 );
		
	}

}
