package com.tutum.escuelita.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import com.tutum.escuelita.model.Alumnos;
import com.tutum.escuelita.model.Calificaciones;
import com.tutum.escuelita.model.Materias;

public class CalificacionesData {
	List<Alumnos> listAlumnos = new ArrayList<>();
	List<Materias> listMaterias = new ArrayList<>();
	List<Calificaciones> listCalif = new ArrayList<>();
	
	public CalificacionesData() {
		initAlumnos();
		initMaterias();
		initCalificaciones();
	}
	
	private void initAlumnos() {
		if(!listAlumnos.isEmpty())
			listAlumnos.clear();
		
		listAlumnos.add(new Alumnos(1,"John", "Dow", "Down", 1));
	}
	
	private void initMaterias() {
		if(!listMaterias.isEmpty())
			listMaterias.clear();
		
		listMaterias.add(new Materias(1, "Matematicas", 1));
		listMaterias.add(new Materias(2, "Programacion", 1));
		listMaterias.add(new Materias(3, "Ingenieria de Software", 1));
	}
	
	public void revertDeletedCalificaciones() {
        initAlumnos();
        initMaterias();
        initCalificaciones();
    }
	
	public void deleteCalificaciones() {
		listCalif.clear();
	}
	
	public void initCalificaciones() {
		if(!listCalif.isEmpty())
			listCalif.clear();
		
		listCalif.add(new Calificaciones(1, listMaterias.get(0), listAlumnos.get(0), 8.5, new Date()));
		listCalif.add(new Calificaciones(2, listMaterias.get(1), listAlumnos.get(0), 7.3, new Date()));
		listCalif.add(new Calificaciones(3, listMaterias.get(2), listAlumnos.get(0), 6.5, new Date()));
	}
	
	public void deleteCalificaciones(Calificaciones califValue) {
		listCalif.remove(califValue);
	}
	
	public List<Calificaciones> getTabla() {
		return listCalif;
	}
	
	public Integer getSizeTabla() {
		return listCalif.size();
	}

}
