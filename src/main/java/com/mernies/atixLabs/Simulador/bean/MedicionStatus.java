package com.mernies.atixLabs.Simulador.bean;

import java.io.Serializable;

public class MedicionStatus implements Serializable{
	private static final long serialVersionUID = -6906684823576607060L;
	private String status;
	private String descripcion;
	
	public MedicionStatus() {
		super();
	}
	
	public MedicionStatus(String status, String descripcion) {
		super();
		this.status = status;
		this.descripcion = descripcion;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
