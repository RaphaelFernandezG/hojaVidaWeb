package co.hojavida.model;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the persona database table.
 * 
 */
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	private String tipodocumento;
	
	private int numerodocumento;
	
	private String nombres;
	
	private String primerapellido;

	private String segundoapellido;
	
	private String sexo;
	
	private String fechanacimiento;
	
	private int paisnacimiento;
	
	private int departamentonacimiento;

	private int municipionacimiento;

	private String correo;

	private String password;


	public Persona() {
	}


	public String getTipodocumento() {
		return tipodocumento;
	}


	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}


	public int getNumerodocumento() {
		return numerodocumento;
	}


	public void setNumerodocumento(int numerodocumento) {
		this.numerodocumento = numerodocumento;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getPrimerapellido() {
		return primerapellido;
	}


	public void setPrimerapellido(String primerapellido) {
		this.primerapellido = primerapellido;
	}


	public String getSegundoapellido() {
		return segundoapellido;
	}


	public void setSegundoapellido(String segundoapellido) {
		this.segundoapellido = segundoapellido;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public Date getFechanacimiento() {
		return fechanacimiento;
	}


	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	public int getPaisnacimiento() {
		return paisnacimiento;
	}


	public void setPaisnacimiento(int paisnacimiento) {
		this.paisnacimiento = paisnacimiento;
	}


	public int getDepartamentonacimiento() {
		return departamentonacimiento;
	}


	public void setDepartamentonacimiento(int departamentonacimiento) {
		this.departamentonacimiento = departamentonacimiento;
	}


	public int getMunicipionacimiento() {
		return municipionacimiento;
	}


	public void setMunicipionacimiento(int municipionacimiento) {
		this.municipionacimiento = municipionacimiento;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}