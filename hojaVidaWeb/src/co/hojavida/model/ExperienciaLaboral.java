package co.hojavida.model;

import java.io.Serializable;
import java.util.Date;

public class ExperienciaLaboral implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private int actual;
	
	private String entidad;
	
	private String publicaprivada;
	
	private int pais;
	
	private int departamento;
	
	private int municipio;
	
	private String correoempresa;
	
	private String telefono;
	
	private Date fechaingreso;
	
	private Date fecharetiro;
	
	private String cargo;
	
	private String  dependencia;
	
	private String direccion;

	public ExperienciaLaboral() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActual() {
		return actual;
	}

	public void setActual(int actual) {
		this.actual = actual;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getPublicaprivada() {
		return publicaprivada;
	}

	public void setPublicaprivada(String publicaprivada) {
		this.publicaprivada = publicaprivada;
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

	public String getCorreoempresa() {
		return correoempresa;
	}

	public void setCorreoempresa(String correoempresa) {
		this.correoempresa = correoempresa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Date getFecharetiro() {
		return fecharetiro;
	}

	public void setFecharetiro(Date fecharetiro) {
		this.fecharetiro = fecharetiro;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	
}
