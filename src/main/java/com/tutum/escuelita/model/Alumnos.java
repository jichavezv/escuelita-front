package com.tutum.escuelita.model;

public class Alumnos {
	private Integer idUsuario;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private Integer activo;
	
	public Alumnos(Integer idUsuario, String nombre, String apPaterno, String apMaterno, Integer activo) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.activo = activo;
	}
	
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	
	public String getNombreCompleto() {
		return this.nombre + " " + this.apMaterno;
	}
}
