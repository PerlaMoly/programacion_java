package ar.edu.unlam.pb2.Rectangulo;

public class Rectangulo {
  
	private double base;
	private double altura;
	
	

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	//metodo constructor
	
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
		
	}
	
	public double calculoDeArea( double base, double altura) {
		double area;
		area=base*altura;
		return area;
		
	}
	
	public double calculoDePerimetro(double base, double altura) {
		double perimetro;
		perimetro= (base+altura)*2;
		return perimetro;
	}
}
