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

public class CrearTablaCamisetas {
	
	/**
	 * Crear nueva tabla en la Base de Datos
	 */
	
	public static void crearNuevaTablaCamisetas(){
		
		String name = "Camisetas.db";
		String url = "jdbc:sqlite:" + name;
		
		String sql="CREATE TABLE IF NOT EXITS camisetas (\n"
				+ "id_producto integer PRIMARY KEY,\n"
				+ "precio float not null,\n"
				+ "fecha_recepcion DATETIME not null,\n"
				+ "unidades integer not null,\n"
				+ "marca text not null,\n"
				+ "modelo text not nul,\n"
				+ "talla text not null,\n"
				+ "material_composicion arraylist not null,\n"
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
		crearNuevaTablaCamisetas();
	}

}
