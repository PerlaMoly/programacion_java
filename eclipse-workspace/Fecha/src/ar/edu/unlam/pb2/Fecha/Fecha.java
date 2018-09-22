package ar.edu.unlam.pb2.Fecha;

public class Fecha {
  private Integer dia;
  private Integer mes;
  private Integer anio;
  
  public Fecha(Integer dia,Integer mes,Integer anio) {
	  this.dia=dia;
	  this.mes=mes;
	  this.anio=anio;
  }
  
  public Integer  Dia(Integer dia) {
	  return dia;
  }
  
  public Integer mes (Integer mes) {
	  return mes;
  }
  
  public Integer anio( Integer anio) {
	  return anio;
  }

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((anio == null) ? 0 : anio.hashCode());
	result = prime * result + ((dia == null) ? 0 : dia.hashCode());
	result = prime * result + ((mes == null) ? 0 : mes.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Fecha other = (Fecha) obj;
	if (anio == null) {
		if (other.anio != null)
			return false;
	} else if (!anio.equals(other.anio))
		return false;
	if (dia == null) {
		if (other.dia != null)
			return false;
	} else if (!dia.equals(other.dia))
		return false;
	if (mes == null) {
		if (other.mes != null)
			return false;
	} else if (!mes.equals(other.mes))
		return false;
	return true;
}
}
