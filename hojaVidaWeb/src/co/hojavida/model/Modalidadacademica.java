package co.hojavida.model;

import java.io.Serializable;


/**
 * The persistent class for the modalidadacademica database table.
 * 
 */
public class Modalidadacademica implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String descripcion;

	public Modalidadacademica() {
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

}