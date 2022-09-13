package com.gestion.empleados.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestion.empleados.entidades.Empleado;

public interface EmpleadoService {
	
	public List<Empleado> findAll(); //listo todos los empleados que busco
	
	public Page<Empleado> findAll(Pageable pageable); //Le doy paginación
	
	public void save(Empleado empleado); //le paso el empleado que voy a guardar
	
	public Empleado findOne(Long id);
	
	public void delete(Long id);
	
	
	

}
