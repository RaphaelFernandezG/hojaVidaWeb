package co.hojavida.util;

import co.hojavida.dao.PaisDAO;
import co.hojavida.model.Pais;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaisDAO pa=new PaisDAO();
		Pais p=new Pais();
		p.setId(2);
		p.setNombre("Venezuela");
		pa.insertarPais(p);
		//pa.eliminarPais(p);

	}

}
