package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
	private String USERNAME = "root";
	private String PASSWORD = "nico";
	private String HOST = "localhost";
	private String PORT = "3306";
	private String DATABASE = "javaDB";
	private String CLASNAME = "com.mysql.jdbc.Driver";
	private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
	private Connection con;
	
	public Conexion(){
		try {
			Class.forName(CLASNAME);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			System.err.println("error"+e);
			
		}
		catch (SQLException e) {
		System.err.println("error" +e);
		}
	}
	public Connection getConexion(){
		return con;
		
	}
	
	
}
