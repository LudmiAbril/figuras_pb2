package ar.edu.unlam.pb2;

public class Rectangulo {
	private Double ancho;
	private Double alto;

	public Rectangulo(Double ancho, Double alto) {
		this.ancho = ancho;
		this.alto = alto;

	}

	public Double getPerimetro() {
		return this.alto * 2 + this.ancho * 2;
	}
	
	public Double getArea() {
		return this.alto * this.ancho;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
	
}
