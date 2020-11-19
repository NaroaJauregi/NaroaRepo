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

public class CrearTablaUsuario{
	
	/**
	 * Crear nueva tabla en la Base de Datos
	 */
	
	public static void crearNuevaTablaUsuario(){
		
		String name = "Usuario.db";
		String url = "jdbc:sqlite:" + name;
		
		String sql="CREATE TABLE IF NOT EXITS usuario (\n"
				+ "id_usuario integer PRIMARY KEY,\n"
				+ "nombre String not null,\n"
				+ "id_compra_realizada integer not null,\n"
				+ "numero_comentario integer not null,\n"
				+ "contenido_comentario String not null,\n"
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
		crearNuevaTablaUsuario();
	}

}
