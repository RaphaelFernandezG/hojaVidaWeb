package co.hojavida.model;

import java.io.Serializable;


/**
 * The persistent class for the educacionbasica database table.
 * 
 */
public class Educacionbasica implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String descripcion;

	public Educacionbasica() {
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}