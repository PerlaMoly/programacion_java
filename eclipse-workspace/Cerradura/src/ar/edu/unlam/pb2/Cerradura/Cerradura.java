package ar.edu.unlam.pb2.Cerradura;

public class Cerradura {
 
	private Integer contraseņa=123;
	private Boolean estadoAbierto=false;
	private Integer cantidadIntentos=3;

	public Integer recuperarContraseņa(){
		return this.contraseņa;
	}
	
public void abrirCerradura(Integer contraseņa){
	if(this.contraseņa==contraseņa){
		this.estadoAbierto=true;
			}
	else{
		this.estadoAbierto=false;
			}
	}
	

	public boolean estadoCerradura(){
		return estadoAbierto;
	}
	
	public integer cantidadIntento () {
	
	}
	
   
	
}
