package CasaApuestas;


public class Apuesta {

	double IdPuesta = 0;
	String equiposApuesta = "";
	double valorApostado = 0;
	
	
	
	public Apuesta(String equiposApuesta, double valorApostado) {
		super();
		this.equiposApuesta = equiposApuesta;
		this.valorApostado = valorApostado;
	}
	public double getIdPuesta() {
		return IdPuesta;
	}
	public void setIdPuesta(double idPuesta) {
		IdPuesta = idPuesta;
	}
	public String getEquiposApuesta() {
		return equiposApuesta;
	}
	public void setEquiposApuesta(String equiposApuesta) {
		this.equiposApuesta = equiposApuesta;
	}
	public double getValorApostado() {
		return valorApostado;
	}
	public void setValorApostado(double valorApostado) {
		this.valorApostado = valorApostado;
	}
	
	
}
