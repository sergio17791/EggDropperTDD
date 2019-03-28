package com.eggdropper.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.eggdropper.EggDropper;
import com.eggdropper.Skyscraper;

class EggDropperTestX {

	@Test
	void minEggDropperXTest() throws Exception {
		
		EggDropper eggDropper;
		int minimunEggDropper;
		int eggsAmount;
		
		Skyscraper skyscraper100 = new Skyscraper();	
		Skyscraper skyscraper1000 = new Skyscraper(1000);	
		Skyscraper skyscraper2000 = new Skyscraper(2000);	

		//Test with 100 floors and 2 eggs
	    eggsAmount = 2;			
	    eggDropper = new EggDropper(skyscraper100);		
	    minimunEggDropper = eggDropper.minEggDropperX(eggsAmount);		
		System.out.println("Minimun Egg Dropper X with " + skyscraper100.getFloorsNumber() + " floors and " + eggsAmount + " eggs: " + minimunEggDropper);		
		assertTrue(minimunEggDropper >= 1 && minimunEggDropper <= 100);
		assertTrue(eggDropper.getNumberEggBroken() >= 0 && eggDropper.getNumberEggBroken() <= eggsAmount );
		
		//Test with 100 floors and 100 eggs
	    eggsAmount = 100;	
	    eggDropper = new EggDropper(skyscraper100);		
	    minimunEggDropper = eggDropper.minEggDropperX(eggsAmount);		
		System.out.println("Minimun Egg Dropper X with " + skyscraper100.getFloorsNumber() + " floors and " + eggsAmount + " eggs: " + minimunEggDropper);		
		assertTrue(minimunEggDropper >= 1 && minimunEggDropper <= 100);
		assertTrue(eggDropper.getNumberEggBroken() >= 0 && eggDropper.getNumberEggBroken() <= eggsAmount );
		
		//Test with 1000 floors and 2 eggs
	    eggsAmount = 2;	
	    eggDropper = new EggDropper(skyscraper1000);		
	    minimunEggDropper = eggDropper.minEggDropperX(eggsAmount);		
		System.out.println("Minimun Egg Dropper X with " + skyscraper1000.getFloorsNumber() + " floors and " + eggsAmount + " eggs: " + minimunEggDropper);		
		assertTrue(minimunEggDropper >= 1 && minimunEggDropper <= 100);
		assertTrue(eggDropper.getNumberEggBroken() >= 0 && eggDropper.getNumberEggBroken() <= eggsAmount );
		
		//Test with 1000 floors and 500 eggs
	    eggsAmount = 500;	
	    eggDropper = new EggDropper(skyscraper2000);		
	    minimunEggDropper = eggDropper.minEggDropperX(eggsAmount);		
		System.out.println("Minimun Egg Dropper X with " + skyscraper1000.getFloorsNumber() + " floors and " + eggsAmount + " eggs: " + minimunEggDropper);		
		assertTrue(minimunEggDropper >= 1 && minimunEggDropper <= 100);
		assertTrue(eggDropper.getNumberEggBroken() >= 0 && eggDropper.getNumberEggBroken() <= eggsAmount );
		
		//Test with 2000 floors and 200 eggs
	    eggsAmount = 200;	
	    eggDropper = new EggDropper(skyscraper1000);		
	    minimunEggDropper = eggDropper.minEggDropperX(eggsAmount);		
		System.out.println("Minimun Egg Dropper X with " + skyscraper1000.getFloorsNumber() + " floors and " + eggsAmount + " eggs: " + minimunEggDropper);		
		assertTrue(minimunEggDropper >= 1 && minimunEggDropper <= 100);
		assertTrue(eggDropper.getNumberEggBroken() >= 0 && eggDropper.getNumberEggBroken() <= eggsAmount );
		
	}

}
