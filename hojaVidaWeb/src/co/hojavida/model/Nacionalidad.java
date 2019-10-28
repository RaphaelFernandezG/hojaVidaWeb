package co.hojavida.model;

import java.io.Serializable;


/**
 * The persistent class for the nacionalidad database table.
 * 
 */
public class Nacionalidad implements Serializable {
	private static final long serialVersionUID = 1L;

	private int tipo;
	
	private String nombre;

	public Nacionalidad() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}