package co.hojavida.model;

import java.io.Serializable;


/**
 * The persistent class for the idioma database table.
 * 
 */
public class Idioma implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private int idioma;
	
	private String lohabla;
	
	private String lolee;

	private String loescribe;

	public Idioma() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdioma() {
		return idioma;
	}

	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}

	public String getLohabla() {
		return lohabla;
	}

	public void setLohabla(String lohabla) {
		this.lohabla = lohabla;
	}

	public String getLolee() {
		return lolee;
	}

	public void setLolee(String lolee) {
		this.lolee = lolee;
	}

	public String getLoescribe() {
		return loescribe;
	}

	public void setLoescribe(String loescribe) {
		this.loescribe = loescribe;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}