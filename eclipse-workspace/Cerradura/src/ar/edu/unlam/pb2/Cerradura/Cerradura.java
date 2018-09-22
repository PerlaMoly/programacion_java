package ar.edu.unlam.pb2.Cerradura;

public class Cerradura {
 
	private Integer contraseña=123;
	private Boolean estadoAbierto=false;
	private Integer cantidadIntentos=3;

	public Integer recuperarContraseña(){
		return this.contraseña;
	}
	
public void abrirCerradura(Integer contraseña){
	if(this.contraseña==contraseña){
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
