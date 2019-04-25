package es.aytos.dual.hibernate.herencia.modelo;

import javax.persistence.Entity;

@Entity(name = "gato")
public class Gato extends Animal {

	private String callejero;
	private String nombre;

	public String getCallejero() {
		return callejero;
	}

	public void setCallejero(String callejero) {
		this.callejero = callejero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
