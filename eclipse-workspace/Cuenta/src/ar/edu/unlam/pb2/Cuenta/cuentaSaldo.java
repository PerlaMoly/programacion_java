package ar.edu.unlam.pb2.Cuenta;

public class cuentaSaldo extends Cuenta{
	
	public cuentaSaldo(Double monto) {
		super( monto);
	}
	
	@Override
	public  extraer(Double monto) {
		if(this.monto>0) {
			return true;
		}
	}
	
	
	

}
