package es.aytos.dual.hibernate.herencia.modelo;

import javax.persistence.Entity;

@Entity(name = "perro")
public class Perro extends Animal {

	private String tamanio;
	private String jugueton;

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getJugueton() {
		return jugueton;
	}

	public void setJugueton(String jugueton) {
		this.jugueton = jugueton;
	}

}
