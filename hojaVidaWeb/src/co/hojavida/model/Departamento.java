package co.hojavida.model;

import java.io.Serializable;


/**
 * The persistent class for the departamento database table.
 * 
 */
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String nombre;
	
	private int idpais;

	public Departamento() {
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

	public int getIdpais() {
		return idpais;
	}

	public void setIdpais(int idpais) {
		this.idpais = idpais;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}