package INTERFACE;

public class Cuadrado extends Figura {
	private double Alto;
	private double Ancho;

	Cuadrado(double Alto, double Ancho, double Area, double Perimetro) {
		super(Area, Perimetro);
		this.Alto = Alto;
		this.Ancho = Ancho;
	}

	public void CuadraArea() {
		double Area;
		Area = Alto * Ancho;
		System.out.println("El area del cuadrado es: " + Area);
	}

	public void CuadraPerimetro() {
		double Perimetro;
		Perimetro = (2 * Alto) + (2 * Ancho);
		System.out.println("El area del cuadrado es: " + Perimetro);
	}
}
