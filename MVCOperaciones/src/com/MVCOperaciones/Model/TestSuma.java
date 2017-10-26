package com.MVCOperaciones.Model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSuma 
{
	@Test
	public void test() 
	{
		OperacionesMatematicas test = new OperacionesMatematicas();
		
		test.setNumero1(1);
		test.setNumero2(5);
		float result = test.sumar();
		//assertEquals(6, result);
		assertTrue(6.0==result);
	}
}