package EjercicioUno;

public class rectangulo {

	private double altura;
	private double base;

	// Constructores

	public rectangulo()

	public rectangulo(double base, double altura) {

		this.base = base;
		this.altura = altura;

	}
	
	//getters and setters 
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//metodos area y perimetro 
	
	
	public double Calcularperimetro () {

		double perimetro = (base * 2) + (altura *2);
		return perimetro; 
	}
	
	public double CalcularArea() {
		dauble area = base * altura ; 
		return area ;
		
	}
	
	void MostrarPorPantalla() {
		System.out.println("El area del rectangulo es " + CalcularArea());
		System.out.println("El perimetro del rectangulo es:" + Calcularperimetro());
	}
	
	
	
	
	
}
