package es.aytos.dual.hibernate.herencia.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//@Entity(name = "empleado")
@MappedSuperclass

public class Empleado {

	@Id
	@GeneratedValue
	private Integer idEmpleado;
	private String raza;
	private String nombre;
	private String apellidos;
	private double salario;
	private int vacaciones;

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getVacaciones() {
		return vacaciones;
	}

	public void setVacaciones(int vacaciones) {
		this.vacaciones = vacaciones;
	}

}
