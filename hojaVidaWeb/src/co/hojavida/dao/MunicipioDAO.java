package co.hojavida.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.hojavida.model.Municipio;
import co.hojavida.util.Conexion;

public class MunicipioDAO {
	
	Conexion con=null;
	
	public MunicipioDAO() {
		this.con=Conexion.getConexion();
	}
	
	public List<Municipio> listarMunicipios(){
		String cadena= "select * from municipio";
		List<Municipio> municipios=new ArrayList<Municipio>();
		try {
			ResultSet res=con.query(cadena);
			while(res.next()) {
				Municipio m=new Municipio();
				m.setId(res.getInt("id"));
				m.setNombre(res.getString("nombre"));
				m.setIddepartamento(res.getInt("iddepartamento"));
				municipios.add(m);
			}
			res.close();
			return municipios;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return municipios;
	}
	
	
	

}
