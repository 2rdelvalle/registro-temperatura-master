package com.andres.registrocovid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.andres.registrocovid.models.Empleado;
import com.andres.registrocovid.services.IEmpleadoService;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService servicio;

	@PostMapping
	public Empleado crear(@RequestBody Empleado empleado) {
		return servicio.save(empleado);
	}

	@GetMapping
	public List<Empleado> listar() {
		return servicio.findAll();
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void eliminar(@PathVariable String id) {
		servicio.delete(id);
	}
	
	@PutMapping
	public Empleado actulizar(@RequestBody Empleado empleado) {
		return servicio.save(empleado);
	}
}
