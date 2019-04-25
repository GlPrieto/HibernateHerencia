package es.aytos.dual.hibernate.herencia;

import es.aytos.dual.hibernate.herencia.modelo.Perro;
import es.aytos.dual.hibernate.herencia.repositorio.RepositorioPerro;

public class Pruebas {

	public static void main(String[] args) {

		final Perro perro = new Perro();
		perro.setAlimentacion("omnivoro");
		perro.setColor("Blanco");
		perro.setJugueton("Mucho");
		perro.setRaza("Chucho");
		perro.setTamanio("Mediano");

		RepositorioPerro.crearPerro(perro);

	}
}
