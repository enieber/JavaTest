package com.banco.troconatroca;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrocoNaTrocaTest {
	
	TrocoNaTroca trt = new TrocoNaTroca();
	
	@Test
	public void TrocoZero(){		
		double result = trt.troco(10, 10);
		assertEquals(0, result, 1e-15);
	}

	
	@Test
	public void trocoMaiorQueZero(){		
		double result = trt.troco(10, 45);
		assertEquals(0, result, 1e-15);
	}
}
