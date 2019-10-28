package co.hojavida.model;

import java.io.Serializable;

public class HojaDeVida implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int datospersonales;
	
	private int formacionacademica;
	
	private int experiencialaboral;
	
	private int tiempototalexperiencia;

	public HojaDeVida() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDatospersonales() {
		return datospersonales;
	}

	public void setDatospersonales(int datospersonales) {
		this.datospersonales = datospersonales;
	}

	public int getFormacionacademica() {
		return formacionacademica;
	}

	public void setFormacionacademica(int formacionacademica) {
		this.formacionacademica = formacionacademica;
	}

	public int getExperiencialaboral() {
		return experiencialaboral;
	}

	public void setExperiencialaboral(int experiencialaboral) {
		this.experiencialaboral = experiencialaboral;
	}

	public int getTiempototalexperiencia() {
		return tiempototalexperiencia;
	}

	public void setTiempototalexperiencia(int tiempototalexperiencia) {
		this.tiempototalexperiencia = tiempototalexperiencia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
