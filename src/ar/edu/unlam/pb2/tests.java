package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	@Test
	public void queSePuedaCrearElRectangulo() {
		Rectangulo figura = new Rectangulo(4.0, 8.0);

		assertNotNull(figura);
	}

	@Test
	public void queSePuedaCalcularElPerimetro() {
		Rectangulo figura = new Rectangulo(4.0, 8.0);

		Double obtenido = figura.getPerimetro();
		Double deseado = 24.0;

		assertEquals(obtenido, deseado);
	}

	@Test
	public void queSePuedaCalcularElArea() {
		Rectangulo figura = new Rectangulo(4.0, 8.0);

		Double obtenido = figura.getArea();
		Double deseado = 32.0;

		assertEquals(obtenido, deseado);
	}

	@Test
	public void queSePuedaObtenerUnToString() {
		Rectangulo figura = new Rectangulo(4.0, 8.0);

		String obtenido = figura.toString();
		String deseado = "Rectangulo [ancho=" + 4.0 + ", alto=" + 8.0 + "]";

		assertEquals(obtenido, deseado);
	}

}
