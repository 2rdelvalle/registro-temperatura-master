package com.andres.registrocovid.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("empleados")
public class Empleado {
	@Id
	private String id;
	private String nombre;
	private String tipoDocumento;
	private String numeroDocumento;
	private String dolorGarganta;
	private String malestarGeneral;
	private String dolorHueso;
	private String fiebre;
	private String tos;
	private String dificultadRespirar;

    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoDocuemnto() {
		return tipoDocumento;
	}
	public void setTipoDocuemnto(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getDolorGarganta() {
		return dolorGarganta;
	}
	public void setDolorGarganta(String dolorGarganta) {
		this.dolorGarganta = dolorGarganta;
	}
	public String getMalestarGeneral() {
		return malestarGeneral;
	}
	public void setMalestarGeneral(String malestarGeneral) {
		this.malestarGeneral = malestarGeneral;
	}
	public String getDolorHueso() {
		return dolorHueso;
	}
	public void setDolorHueso(String dolorHueso) {
		this.dolorHueso = dolorHueso;
	}
	public String getFiebre() {
		return fiebre;
	}
	public void setFiebre(String fiebre) {
		this.fiebre = fiebre;
	}
	public String getTos() {
		return tos;
	}
	public void setTos(String tos) {
		this.tos = tos;
	}
	public String getDificultadRespirar() {
		return dificultadRespirar;
	}
	public void setDificultadRespirar(String dificultadRespirar) {
		this.dificultadRespirar = dificultadRespirar;
	}

}
