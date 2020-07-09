package com.andres.registrocovid.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.andres.registrocovid.models.Empleado;

public interface EmpleadoRepository extends MongoRepository<Empleado, String> {

}
