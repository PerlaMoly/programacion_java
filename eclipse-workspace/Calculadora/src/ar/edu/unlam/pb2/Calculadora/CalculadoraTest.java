package ar.edu.unlam.pb2.Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		int resultado= Calculadora.suma(8, 10);
		int esperado= 18;
        assertEquals(esperado, resultado);
		
	}
      
	@Test
	public void testResta() {
		int resultado= Calculadora.resta(10,8);
		int esperado=2;
		assertEquals(esperado, resultado);
		
	}
}
