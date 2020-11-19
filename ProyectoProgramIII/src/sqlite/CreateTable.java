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
	
	/**
	 * Crear nueva tabla productos en la Base de Datos 
	 */
	
	public static void crearNuevaTablaProductos(){
		
		String name = "Tienda.db";
		String url = "jdbc:sqlite:" + name;
		
		String sql="CREATE TABLE IF NOT EXISTS Productos (\n"
				+ "id_producto integer PRIMARY KEY,\n"
				+ "precio float not null,\n"
				+ "fecha_recepcion DATETIME not null,\n"
				+ "unidades integer not null\n"
				+ ");";
				
		try
		
			(
					Connection conn=DriverManager.getConnection(url);
					Statement stmt=conn.createStatement()
			)
			
			{
			stmt.execute(sql);
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		
	}
	
	
	
	/**
	 * Crear nueva tabla camisetas en la Base de Datos 
	 */
	
	public static void crearNuevaTablaCamisetas(){
		
		String name = "Tienda.db";
		String url = "jdbc:sqlite:" + name;
		
		String sql="CREATE TABLE IF NOT EXISTS Camisetas (\n"
				+ "id_producto integer not null,\n"
				+ "marca text not null,\n"
				+ "modelo text not null,\n"
				+ "talla text not null,\n"
				+ "material_composicion arraylist not null,\n"
				+ "PRIMARY KEY (id_producto),\n"
				+ "FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)\n" 
				+ ");";
				
		try
		
			(
					Connection conn=DriverManager.getConnection(url);
					Statement stmt=conn.createStatement()
			)
			
			{
			stmt.execute(sql);
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		
	}
	
	
	/**
	 * Crear nueva tabla pantalones en la Base de Datos
	 */
	
	public static void crearNuevaTablaPantalones(){
		
		String name = "Tienda.db";
		String url = "jdbc:sqlite:" + name;
		
		String sql="CREATE TABLE IF NOT EXISTS Pantalones (\n"
				+ "id_producto integer not null,\n"
				+ "marca text not null,\n"
				+ "modelo text not null,\n"
				+ "talla text not null,\n"
				+ "material_composicion arraylist not null,\n"
				+ "PRIMARY KEY (id_producto),\n"
				+ "FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)\n" 
				+ ");";
				
		try
		
			(
					Connection conn=DriverManager.getConnection(url);
					Statement stmt=conn.createStatement()
			)
			
			{
			stmt.execute(sql);
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		
	}
	
	/**
	 * Crear nueva tabla zapatillas en la Base de Datos
	 */
	
	public static void crearNuevaTablaZapatillas(){
		
		String name = "Tienda.db";
		String url = "jdbc:sqlite:" + name;
		
		String sql="CREATE TABLE IF NOT EXISTS Zapatillas (\n"
				+ "id_producto integer not null,\n"
				+ "marca text not null,\n"
				+ "modelo text not null,\n"
				+ "talla text not null,\n"
				+ "PRIMARY KEY (id_producto),\n"
				+ "FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)\n" 
				+ ");";
				
		try
		
			(
					Connection conn=DriverManager.getConnection(url);
					Statement stmt=conn.createStatement()
			)
			
			{
			stmt.execute(sql);
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		
	}
	
	/**
	 * Crear nueva tabla usuarios en la Base de Datos
	 */
	
	public static void crearNuevaTablaUsuarios(){
		
		String name = "tienda.db";
		String url = "jdbc:sqlite:" + name;
		
		String sql="CREATE TABLE IF NOT EXISTS Usuarios (\n"
				+ "id_usuario integer PRIMARY KEY,\n"
				+ "nombre String not null,\n"
				+ "id_compra_realizada integer not null,\n"
				+ "numero_comentario integer not null,\n"
				+ "contenido_comentario String not null\n"
				+ ");";
				
		try
		
			(
					Connection conn=DriverManager.getConnection(url);
					Statement stmt=conn.createStatement()
			)
			
			{
			stmt.execute(sql);
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		
	}
	
	/**
	 * Crear nueva tabla administradores en la Base de Datos
	 */
	
	public static void crearNuevaTablaAdministradores(){
		
		String name = "Tienda.db";
		String url = "jdbc:sqlite:" + name;
		
		String sql="CREATE TABLE IF NOT EXISTS Administradores (\n"
				+ "id_usuario integer not null,\n"
				+ "id_administrador integer,\n"
				+ "PRIMARY KEY (id_usuario, id_administrador),\n"
				+ "FOREIGN KEY (id_usuario) REFERENCES Usuarios (id_usuario)\n" 
				+ ");";
				
		try
		
			(
					Connection conn=DriverManager.getConnection(url);
					Statement stmt=conn.createStatement()
			)
			
			{
			stmt.execute(sql);
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		
	}
	
	public static void main (String[] args){
		crearNuevaTablaProductos();
		crearNuevaTablaCamisetas();
		crearNuevaTablaPantalones();
		crearNuevaTablaZapatillas();
		crearNuevaTablaUsuarios();
		crearNuevaTablaAdministradores();
	}

}
