package com.guatex.impresiones.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author ESTEFANIECM
 *
 */
public class Conexion {
	
	public Connection AbrirConexion() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://serverdb;databaseName=OperacionesPrueba;user=operaciones;password=gtxgtx01;encrypt=true;trustServerCertificate=true;";
			Connection con = DriverManager.getConnection(url);
			return con;
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println("Excepción AbrirConexion() -> "+ex.getLocalizedMessage());
			return null;
		}
	}
}
