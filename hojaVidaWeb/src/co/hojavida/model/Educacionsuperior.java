package co.hojavida.model;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the educacionsuperior database table.
 * 
 */
public class Educacionsuperior implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String modalidadacademica;
	
	private int semestresaprobados;
	
	private String graduado;
	
	private String nombretitulo;
	
	private Date fechaterminacion;

	private int tarjetaprofesional;

	public Educacionsuperior() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModalidadacademica() {
		return modalidadacademica;
	}

	public void setModalidadacademica(String modalidadacademica) {
		this.modalidadacademica = modalidadacademica;
	}

	public int getSemestresaprobados() {
		return semestresaprobados;
	}

	public void setSemestresaprobados(int semestresaprobados) {
		this.semestresaprobados = semestresaprobados;
	}

	public String getGraduado() {
		return graduado;
	}

	public void setGraduado(String graduado) {
		this.graduado = graduado;
	}

	public String getNombretitulo() {
		return nombretitulo;
	}

	public void setNombretitulo(String nombretitulo) {
		this.nombretitulo = nombretitulo;
	}

	public Date getFechaterminacion() {
		return fechaterminacion;
	}

	public void setFechaterminacion(Date fechaterminacion) {
		this.fechaterminacion = fechaterminacion;
	}

	public int getTarjetaprofesional() {
		return tarjetaprofesional;
	}

	public void setTarjetaprofesional(int tarjetaprofesional) {
		this.tarjetaprofesional = tarjetaprofesional;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}