package com.tutum.escuelita.model;

import java.util.Date;

public class Calificaciones {
	private Integer idCalificacion;
	private Materias idMateria;
	private Alumnos idAlumno;
	private Double calificacion;
	private Date fechaRegistro;
	
	public Calificaciones(Integer idCalificacion, Materias idMateria, Alumnos idAlumno, Double calificacion,
			Date fechaRegistro) {
		super();
		this.idCalificacion = idCalificacion;
		this.idMateria = idMateria;
		this.idAlumno = idAlumno;
		this.calificacion = calificacion;
		this.fechaRegistro = fechaRegistro;
	}
	public Integer getIdCalificacion() {
		return idCalificacion;
	}
	public void setIdCalificacion(Integer idCalificacion) {
		this.idCalificacion = idCalificacion;
	}
	public Materias getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(Materias idMateria) {
		this.idMateria = idMateria;
	}
	public Alumnos getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(Alumnos idAlumno) {
		this.idAlumno = idAlumno;
	}
	public Double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
}
