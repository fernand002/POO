package EjercicioUno;

public class Circulo {

	private double radio;
	private int exponente = 2;
	private double pi = 3.1416;

	// Constructores

	public Circulo() {
	}

	public Circulo(double radio, double pi) {

		this.setRadio(radio);
		this.pi = pi;
	}

	// Getters and setters

	public int getExponente() {
		return exponente;
	}

	public void setExponente(int exponente) {
		this.exponente = exponente;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	// Metodos area y perimetro

	public void CalcularPerimetro() {

		double perimetro = 2 * pi * radio;

		System.out.println("El area del circulo es : " + perimetro + "cm");

	}

	public void CalcularArea() {
		double resultadoPotencia = Math.pow(radio, exponente);

		double area = pi * resultadoPotencia;

		System.out.println("El perimetro del circulo es" + area + "cm2");

	}

}
