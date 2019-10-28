package co.hojavida.model;

import java.io.Serializable;


/**
 * The persistent class for the pais database table.
 * 
 */
public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String nombre;

	public Pais() {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}