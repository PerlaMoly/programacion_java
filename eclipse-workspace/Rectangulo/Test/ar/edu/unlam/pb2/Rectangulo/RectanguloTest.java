package ar.edu.unlam.pb2.Rectangulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanguloTest {

	
	
	@Test
	public void sePuedenCrearRectangulos() {
		
		Rectangulo unRectangulo= new Rectangulo(1.0,2.0);
		assertNotNull(unRectangulo);
		
		
		Rectangulo otroRectangulo= new Rectangulo(4.0,5.0);
		assertNotNull(otroRectangulo);
		
}
    
 
@Test
   public void elPerimetroDeUnRectanguloDebeSerLaSumaDeSusLados() {
	    Rectangulo unRectangulo= new Rectangulo(4.0,2.0);
	    double actual=unRectangulo.calculoDePerimetro(4.0, 2.0);
	    assertEquals(12, actual,0.01);
	    
	   
	    
   }
	   
   @Test
   public void elAreaDeUnRectanguloDebeSerSuBasePorAltura() {
	   Rectangulo otroRectangulo= new Rectangulo(4.0,2.0);
	   Double experado=8.0;
	   
	   double actual=otroRectangulo.calculoDeArea(4.0, 2.0);
	   
	   assertEquals(experado, actual, 0.01);
	   
   }
   }