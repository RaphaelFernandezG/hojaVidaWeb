package co.hojavida.model;

import java.io.Serializable;

public class TiempoExperiencia implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int servidorpublicoaños;
	
	private int servidorpublicomeses;
	
	private int empleadosectorprivadoaños;
	
	private int empleadosectorprivadomeses;
	
	private int trabajadorindependeinteaños;
	
	private int trabajadorindependeintemeses;
	
	private int totaltiempoaños;
	
	private int totaltiempomeses;

	public TiempoExperiencia() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getServidorpublicoaños() {
		return servidorpublicoaños;
	}

	public void setServidorpublicoaños(int servidorpublicoaños) {
		this.servidorpublicoaños = servidorpublicoaños;
	}

	public int getServidorpublicomeses() {
		return servidorpublicomeses;
	}

	public void setServidorpublicomeses(int servidorpublicomeses) {
		this.servidorpublicomeses = servidorpublicomeses;
	}

	public int getEmpleadosectorprivadoaños() {
		return empleadosectorprivadoaños;
	}

	public void setEmpleadosectorprivadoaños(int empleadosectorprivadoaños) {
		this.empleadosectorprivadoaños = empleadosectorprivadoaños;
	}

	public int getEmpleadosectorprivadomeses() {
		return empleadosectorprivadomeses;
	}

	public void setEmpleadosectorprivadomeses(int empleadosectorprivadomeses) {
		this.empleadosectorprivadomeses = empleadosectorprivadomeses;
	}

	public int getTrabajadorindependeinteaños() {
		return trabajadorindependeinteaños;
	}

	public void setTrabajadorindependeinteaños(int trabajadorindependeinteaños) {
		this.trabajadorindependeinteaños = trabajadorindependeinteaños;
	}

	public int getTrabajadorindependeintemeses() {
		return trabajadorindependeintemeses;
	}

	public void setTrabajadorindependeintemeses(int trabajadorindependeintemeses) {
		this.trabajadorindependeintemeses = trabajadorindependeintemeses;
	}

	public int getTotaltiempoaños() {
		return totaltiempoaños;
	}

	public void setTotaltiempoaños(int totaltiempoaños) {
		this.totaltiempoaños = totaltiempoaños;
	}

	public int getTotaltiempomeses() {
		return totaltiempomeses;
	}

	public void setTotaltiempomeses(int totaltiempomeses) {
		this.totaltiempomeses = totaltiempomeses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
