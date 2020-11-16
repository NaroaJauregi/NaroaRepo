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

public class CrearTablaZapatillas {
	
	/**
	 * Crear nueva tabla en la Base de Datos
	 */
	
	public static void crearNuevaTablaZapatillas(){
		
		String name = "Zapatillas.db";
		String url = "jdbc:sqlite:" + name;
		
		String sql="CREATE TABLE IF NOT EXITS warehouses (\n"
				+ "id_producto PRIMARY KEY,\n"
				+ "precio not null,\n"
				+ "fecha_recepcion not null,\n"
				+ "unidades not null,\n"
				+ "marca not null,\n"
				+ "modelo not nul,\n"
				+ "talla not null,\n"
				+ "material_composicion,\n"
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
		crearNuevaTablaZapatillas();
	}

}