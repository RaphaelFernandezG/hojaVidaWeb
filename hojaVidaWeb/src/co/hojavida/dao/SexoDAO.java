package co.hojavida.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import co.hojavida.model.Sexo;
import co.hojavida.util.Conexion;

public class SexoDAO {
	
	Conexion con=null;
	
	public SexoDAO(){
		this.con = Conexion.getConexion();
	}
	
	public List<Sexo> listarSexo(){
		String cadena="select * from sexo";
		List<Sexo> sexos=new ArrayList<Sexo>();
		try {
			ResultSet res=con.query(cadena);
			while(res.next()) {
				Sexo sexo=new Sexo();
				sexo.setId(res.getString("id"));
				sexo.setDescripcion(res.getString("descripcion"));
				sexos.add(sexo);
			}
			res.close();
			return sexos;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return sexos;
	}

}
