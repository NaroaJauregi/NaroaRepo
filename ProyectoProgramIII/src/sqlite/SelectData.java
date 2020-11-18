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
	 * @return la conexion con Camisetas.db
	 */
	
	private Connection connect(){
		String name="Camisetas.db";
		String url="jdbc:sqlite:"+name;
		Connection conn = null;
		
		try{
			conn=DriverManager.getConnection(url);
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	/**
	 * 
	 * @return la conexion con Pantalon.db
	 */
	
	private Connection connect2(){
		String name="Pantalon.db";
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
	 * 
	 * @return la conexion con Zapatillas.db
	 */
	
	private Connection connect3(){
		String name="Zapatillas.db";
		String url="jdbc:sqlite:"+name;
		Connection conn3 = null;
		
		try{
			conn3=DriverManager.getConnection(url);
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
		return conn3;
	}
	
	
	
	
	/**
	 * selecciona todas las filas de la tabla camisetas
	 */
	
	public void selectAll(){
		String sql="SELECT id_producto, precio, fecha_recpcion, unidades, marca, modelo, talla, material_composicion from camisetas";
		
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
		String sql="SELECT id_producto, precio, fecha_recpcion, unidades, marca, modelo, talla, material_composicion from pantalones";
		
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
	 * selecciona todas las filas de la tabla camisetas
	 */
	
	public void selectAll3(){
		String sql="SELECT id_producto, precio, fecha_recpcion, unidades, marca, modelo, talla from zapatillas";
		
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
	
	

	public static void main (String[] args){
		SelectData app=new SelectData();
		app.selectAll();
		
		SelectData app2= new SelectData();
		app2.selectAll2();
		
		SelectData app3=new SelectData();
		app3.selectAll3();
	
	}
}