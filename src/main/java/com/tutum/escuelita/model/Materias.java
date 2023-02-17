package com.tutum.escuelita.model;

public class Materias {
	private Integer idMateria;
	private String nombre;
	private Integer activo;
	
	
	public Materias(Integer idMateria, String nombre, Integer activo) {
		super();
		this.idMateria = idMateria;
		this.nombre = nombre;
		this.activo = activo;
	}
	public Integer getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
}
