package es.aytos.dual.hibernate.herencia;

import es.aytos.dual.hibernate.herencia.modelo.Canario;
import es.aytos.dual.hibernate.herencia.repositorio.RepositorioCanario;

public class Pruebas {

	public static void main(String[] args) {

		// final Perro perro = new Perro();
		// perro.setAlimentacion("omnivoro");
		// perro.setColor("Blanco");
		// perro.setJugueton("Mucho");
		// perro.setRaza("Chucho");
		// perro.setTamanio("Mediano");
		//
		// RepositorioPerro.crearPerro(perro);

		// final Sistemas sistema = new Sistemas();
		// sistema.setNombre("Pepe");
		// sistema.setApellidos("Lopez");
		// sistema.setRaza("asiatico");
		// sistema.setSalario(123.45);
		// sistema.setVacaciones(24);
		// sistema.setReparaciones("redes");
		// sistema.setMontaje("hardware");
		//
		// RepositorioSistemas.crearEmpleadoSistema(sistema);

		final Canario canario = new Canario();
		canario.setAlimentacion("omnivoro");
		canario.setColor("Blanco");
		canario.setCantarin("Mucho");
		canario.setTamanioAlas("Cortas");

		RepositorioCanario.crearCanario(canario);

	}
}
