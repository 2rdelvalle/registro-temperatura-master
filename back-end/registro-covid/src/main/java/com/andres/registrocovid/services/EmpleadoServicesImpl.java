package com.andres.registrocovid.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andres.registrocovid.models.Empleado;
import com.andres.registrocovid.repository.EmpleadoRepository;

@Service
public class EmpleadoServicesImpl implements IEmpleadoService {

	@Autowired
	private EmpleadoRepository  repo;
	
	@Override
	public Empleado findById(String id) {
		return null;
	}

	@Override
	public Empleado save(Empleado empleado) {

		return repo.save(empleado);
	}

	@Override
	public List<Empleado> findAll() {
		return repo.findAll();

	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);
	}

	@Override
	public Empleado actulizar(Empleado empleado) {
		return repo.save(empleado);
	}

}
