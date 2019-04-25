package es.aytos.dual.hibernate.herencia.modelo;

import javax.persistence.Entity;

@Entity(name = "canario")
public class Canario extends Animal {

	private String tamanioAlas;
	private String cantarin;

	public String getTamanioAlas() {
		return tamanioAlas;
	}

	public void setTamanioAlas(String tamanioAlas) {
		this.tamanioAlas = tamanioAlas;
	}

	public String getCantarin() {
		return cantarin;
	}

	public void setCantarin(String cantarin) {
		this.cantarin = cantarin;
	}

}
