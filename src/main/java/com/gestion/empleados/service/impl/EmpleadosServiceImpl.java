package com.gestion.empleados.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.empleados.entidades.Empleado;
import com.gestion.empleados.repository.EmpleadoRepository;
import com.gestion.empleados.service.EmpleadoService;

@Service
public class EmpleadosServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository empleadoRepository; //inyecto el repositorio
	
	@Override
	@Transactional(readOnly = true) //solo de lectura
	public List<Empleado> findAll() {
		return (List<Empleado>) empleadoRepository.findAll(); 

	}

	@Override
	@Transactional(readOnly = true)
	public Page<Empleado> findAll(Pageable pageable) {
		return empleadoRepository.findAll(pageable);
	}

	@Override
	@Transactional
	public void save(Empleado empleado) {
		empleadoRepository.save(empleado);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Empleado findOne(Long id) {
		return empleadoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		empleadoRepository.deleteById(id);
		
	}

}
