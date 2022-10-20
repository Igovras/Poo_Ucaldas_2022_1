package INTERFACE;

public class Circulo extends Figura {
	private double Radio;

	Circulo(double Radio, double Area, double Perimetro) {
		super(Area, Perimetro);
		this.Radio = Radio;
	}

	public void CirArea() {
		double Area;
		Area = (Math.PI * Radio * Radio);
		System.out.println("El area del Circulo es: " + Area);
	}

	public void CirPerimetro() {
		double Perimetro;
		Perimetro = (2 * Math.PI * Radio);
		System.out.println("El Perimetro del Circulo es: " + Perimetro);
	}
}
