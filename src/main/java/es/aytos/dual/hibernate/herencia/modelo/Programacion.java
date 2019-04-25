package es.aytos.dual.hibernate.herencia.modelo;

import javax.persistence.Entity;

@Entity(name = "programacion")
public class Programacion extends Empleado {

	private String programa;

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

}
