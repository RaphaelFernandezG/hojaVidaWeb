package co.hojavida.model;

import java.io.Serializable;


/**
 * The persistent class for the direccion database table.
 * 
 */
public class Direccion implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String direccion;
	
	private int pais;
	
	private int departamento;
	
	private int municipio;
	
	public Direccion() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getPais() {
		return pais;
	}

	public void setPais(int pais) {
		this.pais = pais;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public int getMunicipio() {
		return municipio;
	}

	public void setMunicipio(int municipio) {
		this.municipio = municipio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}