package ar.edu.unlam.pb2.Cerradura;

public class Cerradura {
 
	private Integer contrase�a=123;
	private Boolean estadoAbierto=false;
	private Integer cantidadIntentos=3;

	public Integer recuperarContrase�a(){
		return this.contrase�a;
	}
	
public void abrirCerradura(Integer contrase�a){
	if(this.contrase�a==contrase�a){
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
