package sqlite;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Naroa_Jauregi
 * @version 1.0
 */

public class CreateDB {
	
	/**
	 * BASE DE DATOS CAMISETA
	 * @param filename
	 */
	
	public static void crearBaseDeDatosCamiseta(String filename){
		
		String url="jdbc:sqlite:" + filename;
		try(Connection conn=DriverManager.getConnection(url)){
			if (conn!=null){
				DatabaseMetaData meta=conn.getMetaData();
				System.out.println("El nombre del driver es: "+meta.getDriverName());
				System.out.println("Se ha creado una nueva Base de Datos");
			}
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * BASE DE DATOS PANTALON
	 * @param filename
	 */
	
	public static void crearBaseDeDatosPantalon(String filename){
			
			String url="jdbc:sqlite:" + filename;
			try(Connection conn=DriverManager.getConnection(url)){
				if (conn!=null){
					DatabaseMetaData meta=conn.getMetaData();
					System.out.println("El nombre del driver es: "+meta.getDriverName());
					System.out.println("Se ha creado una nueva Base de Datos");
				}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
	
	/**
	 * BASE DA DATOS ZAPATILLAS
	 * @param filename
	 */

	public static void crearBaseDeDatosZapatillas(String filename){
		
		String url="jdbc:sqlite:" + filename;
		try(Connection conn=DriverManager.getConnection(url)){
			if (conn!=null){
				DatabaseMetaData meta=conn.getMetaData();
				System.out.println("El nombre del driver es: "+meta.getDriverName());
				System.out.println("Se ha creado una nueva Base de Datos");
			}
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
	}
		
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String [] args){
		crearBaseDeDatosCamiseta("Camisetas.db");
		
		crearBaseDeDatosPantalon("Pantalon.db");
		
		crearBaseDeDatosZapatillas("Zapatillas.db");
	}

}
