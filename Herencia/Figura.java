package INTERFACE;

public class Figura {
	private String Color;
	protected double Area;
	protected double Perimetro;

	public Figura(String color) {
		this.setColor(color);
	}

	Figura(double Area, double Perimetro) {
		this.Area = Area;
		this.Perimetro = Perimetro;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
}
