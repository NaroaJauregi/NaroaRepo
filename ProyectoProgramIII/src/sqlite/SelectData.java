package sqlite;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Naroa_Jauregi
 *
 */

public class SelectData {
	
	
	
	/**
	 * 
	 * @return la conexion con Pantalon.db
	 */
	
	private Connection connect(){
		String name="Tienda.db";
		String url="jdbc:sqlite:"+name;
		Connection conn2 = null;
		
		try{
			conn2=DriverManager.getConnection(url);
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
		return conn2;
	}
	

	
	/**
	 * selecciona todas las filas de la tabla camisetas
	 */
	
	public void selectAll(){
		String sql="SELECT id_producto, precio, fecha_recepcion, unidades, marca, modelo, talla, material_composicion from camisetas";
		
		try
			(
				Connection conn=this.connect();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql)
					)
			{
			while (rs.next()){
				
			System.out.println
				(
						rs.getInt("id_producto")+ "\t" +
						rs.getFloat ("precio")+ "\t" +
						rs.getString ("fecha_recepcion")+ "\t" +
						rs.getInt("unidades")+ "\t" +
						rs.getString("marca")+ "\t" +
						rs.getString("modelo")+ "\t" +
						rs.getInt("talla")+ "\t" +
						rs.getString ("material_composicion")
						);
			}
	}catch (SQLException e){
		System.out.println(e.getMessage());
	}
}
	/**
	 * selecciona todas las filas de la tabla zapatillas
	 */
	
	public void selectAll2(){
		String sql="SELECT id_producto, precio, fecha_recepcion, unidades, marca, modelo, talla, material_composicion from pantalones";
		
		try
			(
				Connection conn2=this.connect();
				Statement stmt=conn2.createStatement();
				ResultSet rs2=stmt.executeQuery(sql)
					)
			{
			while (rs2.next()){
				
			System.out.println
				(
						rs2.getInt("id_producto")+ "\t" +
						rs2.getFloat ("precio")+ "\t" +
						rs2.getString ("fecha_recepcion")+ "\t" +
						rs2.getInt("unidades")+ "\t" +
						rs2.getString("marca")+ "\t" +
						rs2.getString("modelo")+ "\t" +
						rs2.getInt("talla")+ "\t" +
						rs2.getString ("material_composicion")
						);
			}
	}catch (SQLException e){
		System.out.println(e.getMessage());
	}
}
	
	/**
	 * selecciona todas las filas de la tabla zapatillas
	 */
	
	public void selectAll3(){
		String sql="SELECT id_producto, precio, fecha_recepcion, unidades, marca, modelo, talla from zapatillas";
		
		try
			(
				Connection conn3=this.connect();
				Statement stmt=conn3.createStatement();
				ResultSet rs3=stmt.executeQuery(sql)
					)
			{
			while (rs3.next()){
				
			System.out.println
				(
						rs3.getInt("id_producto")+ "\t" +
						rs3.getFloat ("precio")+ "\t" +
						rs3.getString ("fecha_recepcion")+ "\t" +
						rs3.getInt("unidades")+ "\t" +
						rs3.getString("marca")+ "\t" +
						rs3.getString("modelo")+ "\t" +
						rs3.getInt("talla")
						);
			}
	}catch (SQLException e){
		System.out.println(e.getMessage());
	}
}
	
	/**
	 * selecciona todas las filas de la tabla usuarios
	 */
	
	public void selectAll4(){
		String sql="SELECT id_usuario, nombre, id_compra_realizada, numero_comentario, contenido_comentario from usuarios";
		
		try
			(
				Connection conn4=this.connect();
				Statement stmt=conn4.createStatement();
				ResultSet rs4=stmt.executeQuery(sql)
					)
			{
			while (rs4.next()){
				
			System.out.println
				(
						rs4.getInt("id_usuario")+ "\t" +
						rs4.getString ("nombre")+ "\t" +
						rs4.getInt ("id_compra_realizada")+ "\t" +
						rs4.getInt("numero_comentario")+ "\t" +
						rs4.getString("contenido_comentario")
	
						);
			}
	}catch (SQLException e){
		System.out.println(e.getMessage());
	}
}
	
	/**
	 * selecciona todas las filas de la tabla administrador
	 */
	
	public void selectAll5(){
		String sql="SELECT id_usuario, id_administrador, nombre, id_compra_realizada, numero_comentario, contenido_comentario from administradores";
		
		try
			(
				Connection conn5=this.connect();
				Statement stmt=conn5.createStatement();
				ResultSet rs5=stmt.executeQuery(sql)
					)
			{
			while (rs5.next()){
				
			System.out.println
				(
						rs5.getInt("id_usuario")+ "\t" +
						rs5.getInt("id_administrador")+ "\t" +
						rs5.getString("nombre")+ "\t" +
						rs5.getInt ("id_compra_realizada")+ "\t" +
						rs5.getInt("numero_comentario")+ "\t" +
						rs5.getString("contenido_comentario")
	
						);
			}
	}catch (SQLException e){
		System.out.println(e.getMessage());
	}
}
	
	/**
	 * Selecciona todas las filas de la tabla productos
	 */
	
	public void selectAll6(){
		String sql="SELECT id_producto,precio, fecha_recepcion, unidades from productos";
		
		try
			(
				Connection conn6=this.connect();
				Statement stmt=conn6.createStatement();
				ResultSet rs6=stmt.executeQuery(sql)
					)
			{
			while (rs6.next()){
				
			System.out.println
				(
						rs6.getInt("id_producto")+ "\t" +
						rs6.getFloat("precio")+ "\t" +
						rs6.getString("fecha_recepcion")+ "\t" +
						rs6.getInt ("unidades")
						
						);
			}
	}catch (SQLException e){
		System.out.println(e.getMessage());
	}
}
	
	

	public static void main (String[] args){
		SelectData app=new SelectData();
		app.selectAll();
		
		SelectData app2= new SelectData();
		app2.selectAll2();
		
		SelectData app3=new SelectData();
		app3.selectAll3();
		
		SelectData app4=new SelectData();
		app4.selectAll4();
		
		SelectData app5=new SelectData();
		app5.selectAll5();
		
		SelectData app6=new SelectData();
		app6.selectAll6();
		
	}
}