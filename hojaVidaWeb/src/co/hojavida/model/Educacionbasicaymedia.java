package co.hojavida.model;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the educacionbasicaymedia database table.
 * 
 */
public class Educacionbasicaymedia implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	
	private int educacionbasica;
	
	private String tituloobtenido;

	private Date fechagrado;

	public Educacionbasicaymedia() {
	}

	public int getEducacionbasica() {
		return this.educacionbasica;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTituloobtenido() {
		return tituloobtenido;
	}

	public void setTituloobtenido(String tituloobtenido) {
		this.tituloobtenido = tituloobtenido;
	}

	public Date getFechagrado() {
		return fechagrado;
	}

	public void setFechagrado(Date fechagrado) {
		this.fechagrado = fechagrado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setEducacionbasica(int educacionbasica) {
		this.educacionbasica = educacionbasica;
	}

	

}