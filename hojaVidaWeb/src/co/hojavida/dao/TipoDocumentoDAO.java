package co.hojavida.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.hojavida.model.TipoDocumento;
import co.hojavida.util.Conexion;

public class TipoDocumentoDAO {
	
	Conexion con=null;
	
	public TipoDocumentoDAO(){
		this.con = Conexion.getConexion();
	}
	
	public List<TipoDocumento> listarTipoDocumento(){
		String cadena="select * from tipodocumento";
		List<TipoDocumento> tiposdocumentos= new ArrayList<TipoDocumento>();
		try {
			ResultSet res=con.query(cadena);
			while(res.next()) {
				TipoDocumento tipodoc=new TipoDocumento();
				tipodoc.setId(res.getString("id"));
				tipodoc.setDescripcion(res.getString("descripcion"));
				tiposdocumentos.add(tipodoc);
			}
			res.close();
			return tiposdocumentos;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tiposdocumentos;
	}
	
	
	

}
