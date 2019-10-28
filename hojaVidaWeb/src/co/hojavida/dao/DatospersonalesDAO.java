package co.hojavida.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.hojavida.model.Datospersonales;
import co.hojavida.model.Persona;
import co.hojavida.util.Conexion;

public class DatospersonalesDAO {
	
Conexion con = null;
	
	public DatospersonalesDAO() {
		this.con = Conexion.getConexion();
	}
	
	
	public void insertar(Datospersonales datospersonales) {
		String cadena = "insert into persona "
				+ "(id,nombre,descripcion) "
				+ "values ("+datospersonales.getId()+",'"+datospersonales.getDocumentopersona()+"','"+
				datospersonales.getDireccioncorrespondencia()+"')";
		try {
			con.exec(cadena);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public void actualizar(Persona  pokemon) {
			
		}
	
	public void eliminar(String id) {
		
	}
	
	public Persona consultar(String id) {
		
		return null;
		
	}
	
	public List<Persona> listar() {
		List<Persona> dats = new ArrayList<Persona>(); 
		
		String cadena = "select * from pokemon";
		try {
			ResultSet r = con.query(cadena);

				while(r.next()){
	        	    Datospersonales dat = new Datospersonales();
	        	    //dat.setId(r.getInt("id"));
	        	    //dat.setNombre(r.getString("nombre"));
	        	    //dat.setDescripcion(r.getString("descripcion"));
	        	    //dats.add(dat);
				}
		   	r.close();
		   	
		   	return dats;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
