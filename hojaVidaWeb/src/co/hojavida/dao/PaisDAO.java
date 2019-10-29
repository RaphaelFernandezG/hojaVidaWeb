package co.hojavida.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.hojavida.model.Pais;
import co.hojavida.util.Conexion;

public class PaisDAO {
	
	Conexion con=null;
	
	public PaisDAO() {
		this.con=Conexion.getConexion();
	}
	
	
	public void insertarPais(Pais pais) {
		String cadena = "insert into pais(id, nombre) values ("+pais.getId()+",'"+pais.getNombre()+"')";
		try {
			con.exec(cadena);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void eliminarPais(Pais pais) {
		String cadena = "delete from pais where id="+pais.getId()+"";
		try {
			con.exec(cadena);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public List<Pais> listarPaises(){
		String cadena= "select * from pais";
		List<Pais> paises=new ArrayList<Pais>();
		try {
			ResultSet res=con.query(cadena);
			while(res.next()) {
				Pais p=new Pais();
				p.setId(res.getInt("id"));
				p.setNombre(res.getString("nombre"));
				paises.add(p);
			}
			res.close();
			return paises;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return paises;
		
	}

}
