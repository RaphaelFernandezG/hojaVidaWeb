package co.hojavida.model;

import java.io.Serializable;


/**
 * The persistent class for the municipio database table.
 * 
 */
public class Municipio implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String nombre;

	private int iddepartamento;

	public Municipio() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}