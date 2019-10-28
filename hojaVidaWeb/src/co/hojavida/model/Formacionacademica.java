package co.hojavida.model;

import java.io.Serializable;


/**
 * The persistent class for the formacionacademica database table.
 * 
 */
public class Formacionacademica implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	
	private int educacionbasicaymedia;

	private int educacionsuperior;

	private int idioma;

	public Formacionacademica() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEducacionbasicaymedia() {
		return educacionbasicaymedia;
	}

	public void setEducacionbasicaymedia(int educacionbasicaymedia) {
		this.educacionbasicaymedia = educacionbasicaymedia;
	}

	public int getEducacionsuperior() {
		return educacionsuperior;
	}

	public void setEducacionsuperior(int educacionsuperior) {
		this.educacionsuperior = educacionsuperior;
	}

	public int getIdioma() {
		return idioma;
	}

	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}