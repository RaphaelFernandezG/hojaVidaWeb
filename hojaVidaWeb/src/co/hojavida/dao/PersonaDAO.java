package co.hojavida.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.hojavida.model.Persona;
import co.hojavida.util.Conexion;

public class PersonaDAO {
	
	Conexion con = null;
	
	public PersonaDAO() {
		this.con = Conexion.getConexion();
	}
	
	
	
	public void insertarPersona(Persona persona) {
		String cadena = "insert into persona "
				+ "(tipodocumento, numerodocumento, nombres, primerapellido, segundoapellido, "
				+ "sexo, fechanacimiento,paisnacimiento, departamentonacimiento, correo, password) "
				+ "values ("+persona.getTipodocumento()+",'"+persona.getNumerodocumento()+"','"+
				persona.getNombres()+"', '"+persona.getPrimerapellido()+"','"+persona.getSegundoapellido()+"',"
						+ "'"+persona.getSexo()+"','"+persona.getFechanacimiento()+"','"+persona.getPaisnacimiento()+"',"
								+ "'"+persona.getDepartamentonacimiento()+"','"+persona.getCorreo()+"','"+persona.getPassword()+"' )";
		try {
			con.exec(cadena);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void eliminarPersona(Persona persona) {
		String cadena = "delete from persona where numerodocumento='"+persona.getNumerodocumento()+"'";
		try {
			con.exec(cadena);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public List<Persona> listarPersona() {
		String cadena="select * from persona";
		List<Persona> personas= new ArrayList<Persona>();
		try {
			ResultSet res=con.query(cadena);
			while(res.next()) {
				Persona perso=new Persona();
				perso.setTipodocumento(res.getString("tipodocumento"));
				perso.setNumerodocumento(res.getInt("numerodocumento"));
				perso.setNombres(res.getString("nombres"));
				perso.setPrimerapellido(res.getString("primerapellido"));
				perso.setSegundoapellido(res.getString("segundoapellido"));
				perso.setSexo(res.getString("sexo"));
				perso.setFechanacimiento(res.getString("fechanacimiento"));
				perso.setPaisnacimiento(res.getInt("paisnacimiento"));
				perso.setDepartamentonacimiento(res.getInt("departamentonacimiento"));
				perso.setMunicipionacimiento(res.getInt("municipionacimiento"));
				perso.setCorreo(res.getString("correo"));
				perso.setPassword(res.getString("password"));
				personas.add(perso);
			}
			res.close();
			return personas;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return personas;
		
	}
	
	public boolean buscarPersona(Persona persona) {
		String correo = persona.getCorreo();
		String pass = persona.getPassword();
		String cadena = "select * from persona where correo='" + correo + "' AND password='" + pass+"'";
		try {
			ResultSet res = con.query(cadena);
			if (res.getString("correo") == correo && res.getString("password") == pass) {
				res.close();
				return true;
			}
			return false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
