package co.hojavida.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	private Connection con=null;
	private static Conexion db;
	private Statement statement;
	
	private String url= "jdbc:mysql://localhost:3306/";
    private String dbName = "hojavida";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String userName = "root";
    private String password = "";
    private String zonahoraria="?useTimezone=true&serverTimezone=UTC";

	public Conexion() {
		try {
			Class.forName(driver).newInstance();
			con = (Connection)DriverManager.getConnection(url+dbName+zonahoraria,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	public static Conexion getConexion(){
		if ( db == null ) {
            db = new Conexion();
        }
		return db;
	}
 
	public void cerrarConexion(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet query(String query) throws SQLException{
        statement = db.con.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
	
	/*
	 * permite ejecutar consultas para borrar, actualizar, modificar y valirdarlas
	 */
		
	public int exec(String insertQuery) throws SQLException {
        statement = db.con.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
 
    }

}
