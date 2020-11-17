package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fecha.Fecha;
import utilidades.Composicion;

/**
 * 
 * @author Naroa_Jauregi
 *
 */

public class InsertarDatos {
	
	private Connection connect (){
		
		String name = "Camisetas.db";
		String url = "jbdc:sqlote:"+name;
		
		Connection conn=null;
		
		try{
			conn=DriverManager.getConnection(url);
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
	
	/**
	 * Insertar fila en la tabla
	 * @param id_producto
	 * @param precio
	 * @param fecha_recepcion
	 * @param unidades
	 * @param marca
	 * @param modelo
	 * @param talla
	 * @param material_composicion
	 */
	
	public void insert (int id_producto, float precio, Fecha fecha_recepcion, int unidades, String marca, String modelo, int talla, Composicion material_composicion){
		String sql="INSERT INTO warehouses (id_producto, precio, fecha_recpcion, unidades, marca, modelo, talla, maerial_composicion) VALUES (?,?,?,?,?,?,?,?)";
		
		try
		
			(
				Connection conn=this.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)
			
			)
		{
			pstmt.setInt (1, id_producto);
			pstmt.setFloat(2, precio);
			pstmt.setFecha (3, fecha_recepcion);
			pstmt.setInt (4, unidades);
			pstmt.setString (5, marca);
			pstmt.setString (6, modelo);
			pstmt.setInt (7, talla);
			pstmt.setComposicion(8, material_composicion);
			pstmt.executeUpdate();
			
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
			
	}
	

}
