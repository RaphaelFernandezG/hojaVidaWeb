package co.hojavida.model;

import java.io.Serializable;

import com.sun.javafx.beans.IDProperty;


/**
 * The persistent class for the datospersonales database table.
 * 
 */
public class Datospersonales implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int documentopersona;

	private int direccioncorrespondencia;
	
	private int telefono;
	
	private int nacionalidad;

	public Datospersonales() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDocumentopersona() {
		return documentopersona;
	}

	public void setDocumentopersona(int documentopersona) {
		this.documentopersona = documentopersona;
	}

	public int getDireccioncorrespondencia() {
		return direccioncorrespondencia;
	}

	public void setDireccioncorrespondencia(int direccioncorrespondencia) {
		this.direccioncorrespondencia = direccioncorrespondencia;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(int nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}