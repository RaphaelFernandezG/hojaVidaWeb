package co.hojavida.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.hojavida.model.Departamento;
import co.hojavida.util.Conexion;

public class DepartamentoDAO {
	
	Conexion con=null;
	
	public DepartamentoDAO() {
		this.con=Conexion.getConexion();
	}
	
	
	public List<Departamento> listarDepartamentos(){
		String cadena= "select * from departamento";
		List<Departamento> departamentos=new ArrayList<Departamento>();
		try {
			ResultSet res=con.query(cadena);
			while(res.next()) {
				Departamento d=new Departamento();
				d.setId(res.getInt("id"));
				d.setNombre(res.getString("nombre"));
				d.setIdpais(res.getInt("idpais"));
				departamentos.add(d);
			}
			res.close();
			return departamentos;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return departamentos;
		
	}
	
	

}
