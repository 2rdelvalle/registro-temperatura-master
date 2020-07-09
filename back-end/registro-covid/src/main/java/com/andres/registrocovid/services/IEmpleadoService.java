package com.andres.registrocovid.services;
import java.util.List;
import com.andres.registrocovid.models.Empleado;

public interface IEmpleadoService {
	
	public Empleado findById(String id);

	public Empleado save(Empleado empleado);

	public List<Empleado> findAll();

	public void delete(String id);

	public Empleado actulizar(Empleado empleado);

}
