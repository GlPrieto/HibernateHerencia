package es.aytos.dual.hibernate.herencia.modelo;

import javax.persistence.Entity;

@Entity(name = "sistemas")
public class Sistemas extends Empleado {

	private String reparaciones;
	private String montaje;

	public String getReparaciones() {
		return reparaciones;
	}

	public void setReparaciones(String reparaciones) {
		this.reparaciones = reparaciones;
	}

	public String getMontaje() {
		return montaje;
	}

	public void setMontaje(String montaje) {
		this.montaje = montaje;
	}
}
