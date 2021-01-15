package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class CreateTable {
	
	 static String name = "Tienda.db";
	 static String url = "jdbc:sqlite:" + name;
	
	/**
	 * Crear nueva tabla productos en la Base de Datos 
	 * @throws SQLException 
	 */
	
	public static void crearNuevaTablaProductos() throws SQLException{
		
		
		
		String drop_sql="DROP TABLE IF EXISTS Productos";
		 
		 
		String sql="CREATE TABLE IF NOT EXISTS Productos (\n"
				+ "id_producto integer PRIMARY KEY,\n"
				+ "precio float not null,\n"
				+ "fecha_recepcion DATETIME not null,\n"
				+ "unidades integer not null\n"
				+ ");";
		
		Connection conn=null;
		Statement stmt=null;
		try{
					conn=DriverManager.getConnection(url);
					stmt=conn.createStatement();
			
			stmt.execute(sql);
			
			
			}catch (SQLException e){
				System.out.println(e.getMessage());
			
			}finally{
			conn.close();
			}
	}
	
	
	
	
	/**
	 * Crear nueva tabla camisetas en la Base de Datos 
	 * @throws SQLException 
	 */
	
	public static void crearNuevaTablaCamisetas() throws SQLException{
		
		String drop_sql="DROP TABLE IF EXISTS Camisetas";
		
		String sql="CREATE TABLE IF NOT EXISTS Camisetas (\n"
				+ "id_producto integer not null,\n"
				+ "marca text not null,\n"
				+ "modelo text not null,\n"
				+ "talla text not null,\n"
				+ "material_composicion arraylist not null,\n"
				+ "PRIMARY KEY (id_producto),\n"
				+ "FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)\n" 
				+ ");";
		
		
		
		Connection conn=null;
		Statement stmt=null;
		try{
					conn=DriverManager.getConnection(url);
					stmt=conn.createStatement();
		
			{
			stmt.execute(sql);
			}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			
			}finally{
			conn.close();
			}
		
	}
	
	
	/**
	 * Crear nueva tabla pantalones en la Base de Datos
	 * @throws SQLException 
	 */
	
	public static void crearNuevaTablaPantalones() throws SQLException{
		
		String drop_sql="DROP TABLE IF EXISTS Pantalones";
		
		String sql="CREATE TABLE IF NOT EXISTS Pantalones (\n"
				+ "id_producto integer not null,\n"
				+ "marca text not null,\n"
				+ "modelo text not null,\n"
				+ "talla text not null,\n"
				+ "material_composicion arraylist not null,\n"
				+ "PRIMARY KEY (id_producto),\n"
				+ "FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)\n" 
				+ ");";
		
		Connection conn=null;
		Statement stmt=null;
		
		try{
					conn=DriverManager.getConnection(url);
					stmt=conn.createStatement();
		
			{
			stmt.execute(sql);
			}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			
			}finally{
			conn.close();
			}
			
		
	}
	
	/**
	 * Crear nueva tabla zapatillas en la Base de Datos
	 * @throws SQLException 
	 */
	
	public static void crearNuevaTablaZapatillas() throws SQLException{
		
		String drop_sql="DROP TABLE IF EXISTS Zapatillas";
		
		String sql="CREATE TABLE IF NOT EXISTS Zapatillas (\n"
				+ "id_producto integer not null,\n"
				+ "marca text not null,\n"
				+ "modelo text not null,\n"
				+ "talla text not null,\n"
				+ "PRIMARY KEY (id_producto),\n"
				+ "FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)\n" 
				+ ");";
				
		Connection conn=null;
		Statement stmt=null;
		try{
					conn=DriverManager.getConnection(url);
					stmt=conn.createStatement();
		
			{
			stmt.execute(sql);
			}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			
			}finally{
			conn.close();
			}
		
	}
	
	/**
	 * Crear nueva tabla usuarios en la Base de Datos
	 * @throws SQLException 
	 */
	
	public static void crearNuevaTablaUsuarios() throws SQLException{
		
		String drop_sql="DROP TABLE IF EXISTS Usuarios";
		
		String sql="CREATE TABLE IF NOT EXISTS Usuarios (\n"
				+ "id_usuario integer PRIMARY KEY,\n"
				+ "nombre String not null,\n"
				+ "id_compra_realizada integer not null,\n"
				+ "numero_comentario integer not null,\n"
				+ "contenido_comentario String not null\n"
				+ ");";
				
		Connection conn=null;
		Statement stmt=null;
		try{
					conn=DriverManager.getConnection(url);
					stmt=conn.createStatement();
		
			{
			stmt.execute(sql);
			}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			
			}finally{
			conn.close();
			}
		
	}
	
	/**
	 * Crear nueva tabla administradores en la Base de Datos
	 * @throws SQLException 
	 */
	
	public static void crearNuevaTablaAdministradores() throws SQLException{
		
		String drop_sql="DROP TABLE IF EXISTS Administradores";
		
		String sql="CREATE TABLE IF NOT EXISTS Administradores (\n"
				+ "id_usuario integer not null,\n"
				+ "id_administrador integer,\n"
				+ "PRIMARY KEY (id_usuario, id_administrador),\n"
				+ "FOREIGN KEY (id_usuario) REFERENCES Usuarios (id_usuario)\n" 
				+ ");";
				
		Connection conn=null;
		Statement stmt=null;
		try{
					conn=DriverManager.getConnection(url);
					stmt=conn.createStatement();
		
			{
			stmt.execute(sql);
			}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			
			}finally{
			conn.close();
			}
		
	}
	
	
	
	
/*	public static void closeLink(){
		if(DriverManager.getConnection(url) !=null && DriverManager.getConnection(url).isOpen()){
			DriverManager.getConnection(url).close();
			DriverManager.getConnection(url)= null;
		
		}
	}
	
	*/
	
	public static void main (String[] args) throws SQLException{
		crearNuevaTablaProductos();
		crearNuevaTablaCamisetas();
		crearNuevaTablaPantalones();
		crearNuevaTablaZapatillas();
		crearNuevaTablaUsuarios();
		crearNuevaTablaAdministradores();
	//	closeLink();

		
		
	}
	

}
