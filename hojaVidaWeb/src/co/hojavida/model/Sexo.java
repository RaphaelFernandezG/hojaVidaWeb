package co.hojavida.model;

import java.io.Serializable;


/**
 * The persistent class for the sexo database table.
 * 
 */
public class Sexo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String descripcion;

	public Sexo() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}