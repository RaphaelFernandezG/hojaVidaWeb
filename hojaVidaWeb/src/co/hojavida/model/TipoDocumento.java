package co.hojavida.model;

import java.io.Serializable;


/**
 * The persistent class for the tipodocumento database table.
 * 
 */
public class TipoDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String descripcion;

	

	public TipoDocumento() {
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

}