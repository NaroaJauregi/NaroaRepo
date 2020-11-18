package sqlite;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.SQLException;
import java.util.ArrayList;

import fecha.Fecha;
import utilidades.Composicion;

/**
 * 
 * @author Naroa_Jauregi
 *
 */

public class InsertData {
	
	/**
	 * 
	 * @return CONEXION
	 */
	
	private Connection connect (){
		
		String name = "Camisetas.db";
		String url = "jbdc:sqlite:"+name;
		
		Connection conn=null;
		
		try{
			conn=DriverManager.getConnection(url);
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
	
	private Connection connect2(){
		String name = "Pantalon.db";
		String url = "jbdc:sqlite:"+name;
		
		Connection conn2=null;
		
		try{
			conn2=DriverManager.getConnection(url);
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
		
		return conn2;
	}
	
	private Connection connect3(){
		String name = "Zapatillas.db";
		String url = "jbdc:sqlite:"+name;
		
		Connection conn3=null;
		
		try{
			conn3=DriverManager.getConnection(url);
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
		
		return conn3;
	}
	
	
	
	/**
	 * Insertar fila en la tabla camisetas
	 * @param id_producto
	 * @param precio
	 * @param fecha_recepcion
	 * @param unidades
	 * @param marca
	 * @param modelo
	 * @param talla
	 * @param material_composicion
	 */
	
	
	public void insert (int id_producto, float precio, String fecha_recepcion, int unidades, String marca, String modelo, String talla, String material_composicion){
		String sql="INSERT INTO camisetas (id_producto, precio, fecha_recpcion, unidades, marca, modelo, talla, material_composicion) VALUES (?,?,?,?,?,?,?,?)";
		
		try
		
			(
				Connection conn=this.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)
			
			)
		{
			pstmt.setInt (1, id_producto);
			pstmt.setFloat(2, precio);
			pstmt.setString(3,fecha_recepcion);
			pstmt.setInt (4, unidades);
			pstmt.setString (5, marca);
			pstmt.setString (6, modelo);
			pstmt.setString(7, talla);
			pstmt.setString (8, material_composicion);
			pstmt.executeUpdate();
			
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
	}
	
	/**
	 * Insertar fila en la tabla pantalones
	 * @param id_producto
	 * @param precio
	 * @param fecha_recepcion
	 * @param unidades
	 * @param marca
	 * @param modelo
	 * @param talla
	 * @param material_composicion
	 */
	
	public void insert2 (int id_producto, float precio, String fecha_recepcion, int unidades, String marca, String modelo, String talla, String material_composicion){
		String sql="INSERT INTO pantalones (id_producto, precio, fecha_recpcion, unidades, marca, modelo, talla, material_composicion) VALUES (?,?,?,?,?,?,?,?)";
		
		try
		
			(
				Connection conn2=this.connect();
				PreparedStatement pstmt = conn2.prepareStatement(sql)
			
			)
		{
			pstmt.setInt (1, id_producto);
			pstmt.setFloat(2, precio);
			pstmt.setString(3,fecha_recepcion);
			pstmt.setInt (4, unidades);
			pstmt.setString (5, marca);
			pstmt.setString (6, modelo);
			pstmt.setString(7, talla);
			pstmt.setString (8, material_composicion);
			pstmt.executeUpdate();
			
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
	}
	
	/**
	 * Insertar fila en la tabla zapatillas
	 * @param id_producto
	 * @param precio
	 * @param fecha_recepcion
	 * @param unidades
	 * @param marca
	 * @param modelo
	 * @param talla
	 */
	
	public void insert3 (int id_producto, float precio, String fecha_recepcion, int unidades, String marca, String modelo, int talla){
		String sql="INSERT INTO zapatillas (id_producto, precio, fecha_recpcion, unidades, marca, modelo, talla) VALUES (?,?,?,?,?,?,?)";
		
		try
		
			(
				Connection conn2=this.connect();
				PreparedStatement pstmt = conn2.prepareStatement(sql)
			
			)
		{
			pstmt.setInt (1, id_producto);
			pstmt.setFloat(2, precio);
			pstmt.setString(3,fecha_recepcion);
			pstmt.setInt (4, unidades);
			pstmt.setString (5, marca);
			pstmt.setString (6, modelo);
			pstmt.setInt(7, talla);
			pstmt.executeUpdate();
			
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
	}
	
	
	
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main (String[] args){
		
		InsertData app=new InsertData();
		
		app.insert(1, 15, "17-11-2020", 3, "ADIDAS", "CORTO", "S", "Algodon");
		app.insert(2, 15, "17-11-2020", 4, "ADIDAS", "CORTO", "S", "Algodon");
		app.insert(3, 15, "17-11-2020", 5, "ADIDAS", "CORTO", "S", "Algodon");
		app.insert(4, 15, "17-11-2020", 6, "ADIDAS", "CORTO", "S", "Algodon");
		app.insert(5, 15, "17-11-2020", 7, "ADIDAS", "CORTO", "S", "Algodon");
		app.insert(6, 15, "17-11-2020", 3, "ADIDAS", "CORTO", "M", "Algodon");
		app.insert(7, 15, "17-11-2020", 4, "ADIDAS", "CORTO", "M", "Algodon");
		app.insert(8, 15, "17-11-2020", 5, "ADIDAS", "CORTO", "M", "Algodon");
		app.insert(9, 15, "17-11-2020", 6, "ADIDAS", "CORTO", "M", "Algodon");
		app.insert(10, 15, "17-11-2020", 7, "ADIDAS", "CORTO", "M", "Algodon");
		app.insert(12, 15, "17-11-2020", 3, "ADIDAS", "CORTO", "L", "Algodon");
		app.insert(13, 15, "17-11-2020", 4, "ADIDAS", "CORTO", "L", "Algodon");
		app.insert(14, 15, "17-11-2020", 5, "ADIDAS", "CORTO", "L", "Algodon");
		app.insert(15, 15, "17-11-2020", 6, "ADIDAS", "CORTO", "L", "Algodon");
		app.insert(16, 15, "17-11-2020", 7, "NIKE", "CORTO", "S", "Algodon");
		app.insert(17, 15, "17-11-2020", 3, "NIKE", "CORTO", "S", "Algodon");
		app.insert(18, 15, "17-11-2020", 4, "NIKE", "CORTO", "S", "Algodon");
		app.insert(19, 15, "17-11-2020", 5, "NIKE", "CORTO", "S", "Algodon");
		app.insert(20, 15, "17-11-2020", 6, "NIKE", "CORTO", "S", "Algodon");
		app.insert(21, 15, "17-11-2020", 7, "NIKE", "CORTO", "M", "Algodon");
		app.insert(22, 15, "17-11-2020", 3, "NIKE", "CORTO", "M", "Algodon");
		app.insert(23, 15, "17-11-2020", 4, "NIKE", "CORTO", "M", "Algodon");
		app.insert(24, 15, "17-11-2020", 5, "NIKE", "CORTO", "M", "Algodon");
		app.insert(25, 15, "17-11-2020", 6, "NIKE", "CORTO", "M", "Algodon");
		app.insert(26, 15, "17-11-2020", 7, "NIKE", "CORTO", "L", "Algodon");
		app.insert(27, 15, "17-11-2020", 3, "NIKE", "CORTO", "L", "Algodon");
		app.insert(28, 15, "17-11-2020", 4, "NIKE", "CORTO", "L", "Algodon");
		app.insert(29, 15, "17-11-2020", 5, "NIKE", "CORTO", "L", "Algodon");
		app.insert(30, 15, "17-11-2020", 6, "NIKE", "CORTO", "L", "Algodon");
		app.insert(31, 15, "17-11-2020", 7, "PUMA", "CORTO", "S", "Algodon");
		app.insert(32, 15, "17-11-2020", 3, "PUMA", "CORTO", "S", "Algodon");
		app.insert(33, 15, "17-11-2020", 4, "PUMA", "CORTO", "S", "Algodon");
		app.insert(34, 15, "17-11-2020", 5, "PUMA", "CORTO", "S", "Algodon");
		app.insert(35, 15, "17-11-2020", 7, "PUMA", "CORTO", "M", "Algodon");
		app.insert(37, 15, "17-11-2020", 3, "PUMA", "CORTO", "M", "Algodon");
		app.insert(38, 15, "17-11-2020", 4, "PUMA", "CORTO", "M", "Algodon");
		app.insert(39, 15, "17-11-2020", 5, "PUMA", "CORTO", "M", "Algodon");
		app.insert(40, 15, "17-11-2020", 6, "PUMA", "CORTO", "M", "Algodon");
		app.insert(41, 15, "17-11-2020", 7, "PUMA", "CORTO", "L", "Algodon");
		app.insert(42, 15, "17-11-2020", 3, "PUMA", "CORTO", "L", "Algodon");
		app.insert(43, 15, "17-11-2020", 4, "PUMA", "CORTO", "L", "Algodon");
		app.insert(44, 15, "17-11-2020", 5, "PUMA", "CORTO", "L", "Algodon");
		app.insert(45, 15, "17-11-2020", 6, "PUMA", "CORTO", "L", "Algodon");
		app.insert(46, 15, "17-11-2020", 7, "JOMA", "CORTO", "S", "Algodon");
		app.insert(47, 15, "17-11-2020", 3, "JOMA", "CORTO", "S", "Algodon");
		app.insert(48, 15, "17-11-2020", 4, "JOMA", "CORTO", "S", "Algodon");
		app.insert(49, 15, "17-11-2020", 5, "JOMA", "CORTO", "S", "Algodon");
		app.insert(50, 15, "17-11-2020", 6, "JOMA", "CORTO", "S", "Algodon");
		app.insert(51, 15, "17-11-2020", 7, "JOMA", "CORTO", "M", "Algodon");
		app.insert(52, 15, "17-11-2020", 3, "JOMA", "CORTO", "M", "Algodon");
		app.insert(53, 15, "17-11-2020", 4, "JOMA", "CORTO", "M", "Algodon");
		app.insert(54, 15, "17-11-2020", 5, "JOMA", "CORTO", "M", "Algodon");
		app.insert(55, 15, "17-11-2020", 6, "JOMA", "CORTO", "M", "Algodon");
		app.insert(56, 15, "17-11-2020", 7, "JOMA", "CORTO", "L", "Algodon");
		app.insert(57, 15, "17-11-2020", 3, "JOMA", "CORTO", "L", "Algodon");
		app.insert(58, 15, "17-11-2020", 4, "JOMA", "CORTO", "L", "Algodon");
		app.insert(59, 15, "17-11-2020", 5, "JOMA", "CORTO", "L", "Algodon");
		app.insert(60, 15, "17-11-2020", 6, "JOMA", "CORTO", "L", "Algodon");
		app.insert(61, 15, "17-11-2020", 7, "ORBEA", "CORTO", "L", "Algodon");
		app.insert(62, 15, "17-11-2020", 7, "ORBEA", "CORTO", "S", "Algodon");
		app.insert(63, 15, "17-11-2020", 3, "ORBEA", "CORTO", "S", "Algodon");
		app.insert(64, 15, "17-11-2020", 4, "ORBEA", "CORTO", "S", "Algodon");
		app.insert(65, 15, "17-11-2020", 5, "ORBEA", "CORTO", "S", "Algodon");
		app.insert(66, 15, "17-11-2020", 6, "ORBEA", "CORTO", "S", "Algodon");
		app.insert(67, 15, "17-11-2020", 7, "ORBEA", "CORTO", "M", "Algodon");
		app.insert(68, 15, "17-11-2020", 3, "ORBEA", "CORTO", "M", "Algodon");
		app.insert(69, 15, "17-11-2020", 4, "ORBEA", "CORTO", "M", "Algodon");
		app.insert(70, 15, "17-11-2020", 5, "ORBEA", "CORTO", "M", "Algodon");
		app.insert(71, 15, "17-11-2020", 6, "ORBEA", "CORTO", "M", "Algodon");
		app.insert(72, 15, "17-11-2020", 7, "ORBEA", "CORTO", "L", "Algodon");
		app.insert(73, 15, "17-11-2020", 3, "ORBEA", "CORTO", "L", "Algodon");
		app.insert(74, 15, "17-11-2020", 4, "ORBEA", "CORTO", "L", "Algodon");
		app.insert(75, 15, "17-11-2020", 5, "ORBEA", "CORTO", "L", "Algodon");
		app.insert(76, 15, "17-11-2020", 6, "ORBEA", "CORTO", "L", "Algodon");
		app.insert(77, 15, "17-11-2020", 7, "ASTORE", "CORTO", "L", "Algodon");
		app.insert(78, 15, "17-11-2020", 7, "ASTORE", "CORTO", "S", "Algodon");
		app.insert(79, 15, "17-11-2020", 3, "ASTORE", "CORTO", "S", "Algodon");
		app.insert(80, 15, "17-11-2020", 4, "ASTORE", "CORTO", "S", "Algodon");
		app.insert(81, 15, "17-11-2020", 5, "ASTORE", "CORTO", "S", "Algodon");
		app.insert(82, 15, "17-11-2020", 6, "ASTORE", "CORTO", "S", "Algodon");
		app.insert(83, 15, "17-11-2020", 7, "ASTORE", "CORTO", "M", "Algodon");
		app.insert(84, 15, "17-11-2020", 3, "ASTORE", "CORTO", "M", "Algodon");
		app.insert(85, 15, "17-11-2020", 4, "ASTORE", "CORTO", "M", "Algodon");
		app.insert(86, 15, "17-11-2020", 5, "ASTORE", "CORTO", "M", "Algodon");
		app.insert(87, 15, "17-11-2020", 6, "ASTORE", "CORTO", "M", "Algodon");
		app.insert(88, 15, "17-11-2020", 7, "ASTORE", "CORTO", "L", "Algodon");
		app.insert(89, 15, "17-11-2020", 3, "ASTORE", "CORTO", "L", "Algodon");
		app.insert(90, 15, "17-11-2020", 4, "ASTORE", "CORTO", "L", "Algodon");
		app.insert(91, 15, "17-11-2020", 5, "ASTORE", "CORTO", "L", "Algodon");
		app.insert(92, 15, "17-11-2020", 6, "ASTORE", "CORTO", "L", "Algodon");
		app.insert(93, 25, "17-11-2020", 3, "ADIDAS", "LARGO", "S", "Licra");
		app.insert(94, 25, "17-11-2020", 4, "ADIDAS", "LARGO", "S", "Licra");
		app.insert(95, 25, "17-11-2020", 5, "ADIDAS", "LARGO", "S", "Licra");
		app.insert(96, 25, "17-11-2020", 6, "ADIDAS", "LARGO", "S", "Licra");
		app.insert(97, 25, "17-11-2020", 7, "ADIDAS", "LARGO", "S", "Licra");
		app.insert(98, 25, "17-11-2020", 3, "ADIDAS", "LARGO", "M", "Licra");
		app.insert(99, 25, "17-11-2020", 4, "ADIDAS", "LARGO", "M", "Licra");
		app.insert(100, 25, "17-11-2020", 5, "ADIDAS", "LARGO", "M", "Licra");
		app.insert(101, 25, "17-11-2020", 6, "ADIDAS", "LARGO", "M", "Licra");
		app.insert(102, 25, "17-11-2020", 7, "ADIDAS", "LARGO", "M", "Licra");
		app.insert(103, 25, "17-11-2020", 3, "ADIDAS", "LARGO", "L", "Licra");
		app.insert(104, 25, "17-11-2020", 4, "ADIDAS", "LARGO", "L", "Licra");
		app.insert(105, 25, "17-11-2020", 5, "ADIDAS", "LARGO", "L", "Licra");
		app.insert(106, 25, "17-11-2020", 6, "ADIDAS", "LARGO", "L", "Licra");
		app.insert(107, 25, "17-11-2020", 7, "NIKE", "LARGO", "S", "Licra");
		app.insert(108, 25, "17-11-2020", 3, "NIKE", "LARGO", "S", "Licra");
		app.insert(109, 25, "17-11-2020", 4, "NIKE", "LARGO", "S", "Licra");
		app.insert(110, 25, "17-11-2020", 5, "NIKE", "LARGO", "S", "Licra");
		app.insert(111, 25, "17-11-2020", 6, "NIKE", "LARGO", "S", "Licra");
		app.insert(112, 25, "17-11-2020", 7, "NIKE", "LARGO", "M", "Licra");
		app.insert(113, 25, "17-11-2020", 3, "NIKE", "LARGO", "M", "Licra");
		app.insert(114, 25, "17-11-2020", 4, "NIKE", "LARGO", "M", "Licra");
		app.insert(115, 25, "17-11-2020", 6, "NIKE", "LARGO", "M", "Licra");
		app.insert(116, 25, "17-11-2020", 7, "NIKE", "LARGO", "L", "Licra");
		app.insert(117, 25, "17-11-2020", 3, "NIKE", "LARGO", "L", "Licra");
		app.insert(118, 25, "17-11-2020", 4, "NIKE", "LARGO", "L", "Licra");
		app.insert(119, 25, "17-11-2020", 5, "NIKE", "LARGO", "L", "Licra");
		app.insert(120, 25, "17-11-2020", 6, "NIKE", "LARGO", "L", "Licra");
		app.insert(121, 25, "17-11-2020", 7, "PUMA", "LARGO", "S", "Licra");
		app.insert(122, 25, "17-11-2020", 3, "PUMA", "LARGO", "S", "Licra");
		app.insert(123, 25, "17-11-2020", 4, "PUMA", "LARGO", "S", "Licra");
		app.insert(124, 25, "17-11-2020", 5, "PUMA", "LARGO", "S", "Licra");
		app.insert(125, 25, "17-11-2020", 6, "PUMA", "LARGO", "S", "Licra");
		app.insert(126, 25, "17-11-2020", 7, "PUMA", "LARGO", "M", "Licra");
		app.insert(127, 25, "17-11-2020", 3, "PUMA", "LARGO", "M", "Licra");
		app.insert(128, 25, "17-11-2020", 4, "PUMA", "LARGO", "M", "Licra");
		app.insert(129, 25, "17-11-2020", 5, "PUMA", "LARGO", "M", "Licra");
		app.insert(130, 25, "17-11-2020", 6, "PUMA", "LARGO", "M", "Licra");
		app.insert(131, 25, "17-11-2020", 7, "PUMA", "LARGO", "L", "Licra");
		app.insert(132, 25, "17-11-2020", 3, "PUMA", "LARGO", "L", "Licra");
		app.insert(133, 25, "17-11-2020", 4, "PUMA", "LARGO", "L", "Licra");
		app.insert(134, 25, "17-11-2020", 5, "PUMA", "LARGO", "L", "Licra");
		app.insert(135, 25, "17-11-2020", 6, "PUMA", "LARGO", "L", "Licra");
		app.insert(136, 25, "17-11-2020", 7, "JOMA", "LARGO", "S", "Licra");
		app.insert(137, 25, "17-11-2020", 3, "JOMA", "LARGO", "S", "Licra");
		app.insert(138, 25, "17-11-2020", 4, "JOMA", "LARGO", "S", "Licra");
		app.insert(139, 25, "17-11-2020", 5, "JOMA", "LARGO", "S", "Licra");
		app.insert(140, 25, "17-11-2020", 6, "JOMA", "LARGO", "S", "Licra");
		app.insert(141, 25, "17-11-2020", 7, "JOMA", "LARGO", "M", "Licra");
		app.insert(142, 25, "17-11-2020", 3, "JOMA", "LARGO", "M", "Licra");
		app.insert(143, 25, "17-11-2020", 4, "JOMA", "LARGO", "M", "Licra");
		app.insert(144, 25, "17-11-2020", 5, "JOMA", "LARGO", "M", "Licra");
		app.insert(145, 25, "17-11-2020", 6, "JOMA", "LARGO", "M", "Licra");
		app.insert(146, 25, "17-11-2020", 7, "JOMA", "LARGO", "L", "Licra");
		app.insert(147, 25, "17-11-2020", 3, "JOMA", "LARGO", "L", "Licra");
		app.insert(148, 25, "17-11-2020", 4, "JOMA", "LARGO", "L", "Licra");
		app.insert(149, 25, "17-11-2020", 5, "JOMA", "LARGO", "L", "Licra");
		app.insert(150, 25, "17-11-2020", 6, "JOMA", "LARGO", "L", "Licra");
		app.insert(151, 25, "17-11-2020", 7, "ORBEA", "LARGO", "L", "Licra");
		app.insert(152, 25, "17-11-2020", 7, "ORBEA", "LARGO", "S", "Licra");
		app.insert(153, 25, "17-11-2020", 3, "ORBEA", "LARGO", "S", "Licra");
		app.insert(154, 25, "17-11-2020", 4, "ORBEA", "LARGO", "S", "Licra");
		app.insert(155, 25, "17-11-2020", 5, "ORBEA", "LARGO", "S", "Licra");
		app.insert(156, 25, "17-11-2020", 6, "ORBEA", "LARGO", "S", "Licra");
		app.insert(157, 25, "17-11-2020", 7, "ORBEA", "LARGO", "M", "Licra");
		app.insert(158, 25, "17-11-2020", 3, "ORBEA", "LARGO", "M", "Licra");
		app.insert(159, 25, "17-11-2020", 4, "ORBEA", "LARGO", "M", "Licra");
		app.insert(160, 25, "17-11-2020", 5, "ORBEA", "LARGO", "M", "Licra");
		app.insert(161, 25, "17-11-2020", 6, "ORBEA", "LARGO", "M", "Licra");
		app.insert(162, 25, "17-11-2020", 7, "ORBEA", "LARGO", "L", "Licra");
		app.insert(163, 25, "17-11-2020", 3, "ORBEA", "LARGO", "L", "Licra");
		app.insert(164, 25, "17-11-2020", 4, "ORBEA", "LARGO", "L", "Licra");
		app.insert(165, 25, "17-11-2020", 5, "ORBEA", "LARGO", "L", "Licra");
		app.insert(166, 25, "17-11-2020", 6, "ORBEA", "LARGO", "L", "Licra");
		app.insert(167, 25, "17-11-2020", 7, "ASTORE", "LARGO", "L", "Licra");
		app.insert(168, 25, "17-11-2020", 7, "ASTORE", "LARGO", "S", "Licra");
		app.insert(169, 25, "17-11-2020", 3, "ASTORE", "LARGO", "S", "Licra");
		app.insert(170, 25, "17-11-2020", 4, "ASTORE", "LARGO", "S", "Licra");
		app.insert(171, 25, "17-11-2020", 5, "ASTORE", "LARGO", "S", "Licra");
		app.insert(172, 25, "17-11-2020", 6, "ASTORE", "LARGO", "S", "Licra");
		app.insert(173, 25, "17-11-2020", 7, "ASTORE", "LARGO", "M", "Licra");
		app.insert(174, 25, "17-11-2020", 3, "ASTORE", "LARGO", "M", "Licra");
		app.insert(175, 25, "17-11-2020", 4, "ASTORE", "LARGO", "M", "Licra");
		app.insert(176, 25, "17-11-2020", 5, "ASTORE", "LARGO", "M", "Licra");
		app.insert(177, 25, "17-11-2020", 6, "ASTORE", "LARGO", "M", "Licra");
		app.insert(178, 25, "17-11-2020", 7, "ASTORE", "LARGO", "L", "Licra");
		app.insert(179, 25, "17-11-2020", 3, "ASTORE", "LARGO", "L", "Licra");
		app.insert(180, 25, "17-11-2020", 4, "ASTORE", "LARGO", "L", "Licra");
		app.insert(181, 25, "17-11-2020", 5, "ASTORE", "LARGO", "L", "Licra");
		app.insert(182, 25, "17-11-2020", 6, "ASTORE", "LARGO", "L", "Licra");

		
		InsertData app2=new InsertData();
		
		app2.insert2(1, 15, "17-11-2020", 3, "ADIDAS", "CORTO", "S", "Algodon");
		app2.insert2(2, 15, "17-11-2020", 4, "ADIDAS", "CORTO", "S", "Algodon");
		app2.insert2(3, 15, "17-11-2020", 5, "ADIDAS", "CORTO", "S", "Algodon");
		app2.insert2(4, 15, "17-11-2020", 6, "ADIDAS", "CORTO", "S", "Algodon");
		app2.insert2(5, 15, "17-11-2020", 7, "ADIDAS", "CORTO", "S", "Algodon");
		app2.insert2(6, 15, "17-11-2020", 3, "ADIDAS", "CORTO", "M", "Algodon");
		app2.insert2(7, 15, "17-11-2020", 4, "ADIDAS", "CORTO", "M", "Algodon");
		app2.insert2(8, 15, "17-11-2020", 5, "ADIDAS", "CORTO", "M", "Algodon");
		app2.insert2(9, 15, "17-11-2020", 6, "ADIDAS", "CORTO", "M", "Algodon");
		app2.insert2(10, 15, "17-11-2020", 7, "ADIDAS", "CORTO", "M", "Algodon");
		app2.insert2(12, 15, "17-11-2020", 3, "ADIDAS", "CORTO", "L", "Algodon");
		app2.insert2(13, 15, "17-11-2020", 4, "ADIDAS", "CORTO", "L", "Algodon");
		app2.insert2(14, 15, "17-11-2020", 5, "ADIDAS", "CORTO", "L", "Algodon");
		app2.insert2(15, 15, "17-11-2020", 6, "ADIDAS", "CORTO", "L", "Algodon");
		app2.insert2(16, 15, "17-11-2020", 7, "NIKE", "CORTO", "S", "Algodon");
		app2.insert2(17, 15, "17-11-2020", 3, "NIKE", "CORTO", "S", "Algodon");
		app2.insert2(18, 15, "17-11-2020", 4, "NIKE", "CORTO", "S", "Algodon");
		app2.insert2(19, 15, "17-11-2020", 5, "NIKE", "CORTO", "S", "Algodon");
		app2.insert2(20, 15, "17-11-2020", 6, "NIKE", "CORTO", "S", "Algodon");
		app2.insert2(21, 15, "17-11-2020", 7, "NIKE", "CORTO", "M", "Algodon");
		app2.insert2(22, 15, "17-11-2020", 3, "NIKE", "CORTO", "M", "Algodon");
		app2.insert2(23, 15, "17-11-2020", 4, "NIKE", "CORTO", "M", "Algodon");
		app2.insert2(24, 15, "17-11-2020", 5, "NIKE", "CORTO", "M", "Algodon");
		app2.insert2(25, 15, "17-11-2020", 6, "NIKE", "CORTO", "M", "Algodon");
		app2.insert2(26, 15, "17-11-2020", 7, "NIKE", "CORTO", "L", "Algodon");
		app2.insert2(27, 15, "17-11-2020", 3, "NIKE", "CORTO", "L", "Algodon");
		app2.insert2(28, 15, "17-11-2020", 4, "NIKE", "CORTO", "L", "Algodon");
		app2.insert2(29, 15, "17-11-2020", 5, "NIKE", "CORTO", "L", "Algodon");
		app2.insert2(30, 15, "17-11-2020", 6, "NIKE", "CORTO", "L", "Algodon");
		app2.insert2(31, 15, "17-11-2020", 7, "PUMA", "CORTO", "S", "Algodon");
		app2.insert2(32, 15, "17-11-2020", 3, "PUMA", "CORTO", "S", "Algodon");
		app2.insert2(33, 15, "17-11-2020", 4, "PUMA", "CORTO", "S", "Algodon");
		app2.insert2(34, 15, "17-11-2020", 5, "PUMA", "CORTO", "S", "Algodon");
		app2.insert2(35, 15, "17-11-2020", 7, "PUMA", "CORTO", "M", "Algodon");
		app2.insert2(37, 15, "17-11-2020", 3, "PUMA", "CORTO", "M", "Algodon");
		app2.insert2(38, 15, "17-11-2020", 4, "PUMA", "CORTO", "M", "Algodon");
		app2.insert2(39, 15, "17-11-2020", 5, "PUMA", "CORTO", "M", "Algodon");
		app2.insert2(40, 15, "17-11-2020", 6, "PUMA", "CORTO", "M", "Algodon");
		app2.insert2(41, 15, "17-11-2020", 7, "PUMA", "CORTO", "L", "Algodon");
		app2.insert2(42, 15, "17-11-2020", 3, "PUMA", "CORTO", "L", "Algodon");
		app2.insert2(43, 15, "17-11-2020", 4, "PUMA", "CORTO", "L", "Algodon");
		app2.insert2(44, 15, "17-11-2020", 5, "PUMA", "CORTO", "L", "Algodon");
		app2.insert2(45, 15, "17-11-2020", 6, "PUMA", "CORTO", "L", "Algodon");
		app2.insert2(46, 15, "17-11-2020", 7, "JOMA", "CORTO", "S", "Algodon");
		app2.insert2(47, 15, "17-11-2020", 3, "JOMA", "CORTO", "S", "Algodon");
		app2.insert2(48, 15, "17-11-2020", 4, "JOMA", "CORTO", "S", "Algodon");
		app2.insert2(49, 15, "17-11-2020", 5, "JOMA", "CORTO", "S", "Algodon");
		app2.insert2(50, 15, "17-11-2020", 6, "JOMA", "CORTO", "S", "Algodon");
		app2.insert2(51, 15, "17-11-2020", 7, "JOMA", "CORTO", "M", "Algodon");
		app2.insert2(52, 15, "17-11-2020", 3, "JOMA", "CORTO", "M", "Algodon");
		app2.insert2(53, 15, "17-11-2020", 4, "JOMA", "CORTO", "M", "Algodon");
		app2.insert2(54, 15, "17-11-2020", 5, "JOMA", "CORTO", "M", "Algodon");
		app2.insert2(55, 15, "17-11-2020", 6, "JOMA", "CORTO", "M", "Algodon");
		app2.insert2(56, 15, "17-11-2020", 7, "JOMA", "CORTO", "L", "Algodon");
		app2.insert2(57, 15, "17-11-2020", 3, "JOMA", "CORTO", "L", "Algodon");
		app2.insert2(58, 15, "17-11-2020", 4, "JOMA", "CORTO", "L", "Algodon");
		app2.insert2(59, 15, "17-11-2020", 5, "JOMA", "CORTO", "L", "Algodon");
		app2.insert2(60, 15, "17-11-2020", 6, "JOMA", "CORTO", "L", "Algodon");
		app2.insert2(61, 15, "17-11-2020", 7, "ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(62, 15, "17-11-2020", 7, "ORBEA", "CORTO", "S", "Algodon");
		app2.insert2(63, 15, "17-11-2020", 3, "ORBEA", "CORTO", "S", "Algodon");
		app2.insert2(64, 15, "17-11-2020", 4, "ORBEA", "CORTO", "S", "Algodon");
		app2.insert2(65, 15, "17-11-2020", 5, "ORBEA", "CORTO", "S", "Algodon");
		app2.insert2(66, 15, "17-11-2020", 6, "ORBEA", "CORTO", "S", "Algodon");
		app2.insert2(67, 15, "17-11-2020", 7, "ORBEA", "CORTO", "M", "Algodon");
		app2.insert2(68, 15, "17-11-2020", 3, "ORBEA", "CORTO", "M", "Algodon");
		app2.insert2(69, 15, "17-11-2020", 4, "ORBEA", "CORTO", "M", "Algodon");
		app2.insert2(70, 15, "17-11-2020", 5, "ORBEA", "CORTO", "M", "Algodon");
		app2.insert2(71, 15, "17-11-2020", 6, "ORBEA", "CORTO", "M", "Algodon");
		app2.insert2(72, 15, "17-11-2020", 7, "ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(73, 15, "17-11-2020", 3, "ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(74, 15, "17-11-2020", 4, "ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(75, 15, "17-11-2020", 5, "ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(76, 15, "17-11-2020", 6, "ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(77, 15, "17-11-2020", 7, "ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(78, 15, "17-11-2020", 7, "ASTORE", "CORTO", "S", "Algodon");
		app2.insert2(79, 15, "17-11-2020", 3, "ASTORE", "CORTO", "S", "Algodon");
		app2.insert2(80, 15, "17-11-2020", 4, "ASTORE", "CORTO", "S", "Algodon");
		app2.insert2(81, 15, "17-11-2020", 5, "ASTORE", "CORTO", "S", "Algodon");
		app2.insert2(82, 15, "17-11-2020", 6, "ASTORE", "CORTO", "S", "Algodon");
		app2.insert2(83, 15, "17-11-2020", 7, "ASTORE", "CORTO", "M", "Algodon");
		app2.insert2(84, 15, "17-11-2020", 3, "ASTORE", "CORTO", "M", "Algodon");
		app2.insert2(85, 15, "17-11-2020", 4, "ASTORE", "CORTO", "M", "Algodon");
		app2.insert2(86, 15, "17-11-2020", 5, "ASTORE", "CORTO", "M", "Algodon");
		app2.insert2(87, 15, "17-11-2020", 6, "ASTORE", "CORTO", "M", "Algodon");
		app2.insert2(88, 15, "17-11-2020", 7, "ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(89, 15, "17-11-2020", 3, "ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(90, 15, "17-11-2020", 4, "ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(91, 15, "17-11-2020", 5, "ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(92, 15, "17-11-2020", 6, "ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(93, 25, "17-11-2020", 3, "ADIDAS", "LARGO", "S", "Licra");
		app2.insert2(94, 25, "17-11-2020", 4, "ADIDAS", "LARGO", "S", "Licra");
		app2.insert2(95, 25, "17-11-2020", 5, "ADIDAS", "LARGO", "S", "Licra");
		app2.insert2(96, 25, "17-11-2020", 6, "ADIDAS", "LARGO", "S", "Licra");
		app2.insert2(97, 25, "17-11-2020", 7, "ADIDAS", "LARGO", "S", "Licra");
		app2.insert2(98, 25, "17-11-2020", 3, "ADIDAS", "LARGO", "M", "Licra");
		app2.insert2(99, 25, "17-11-2020", 4, "ADIDAS", "LARGO", "M", "Licra");
		app2.insert2(100, 25, "17-01-2020", 5, "ADIDAS", "LARGO", "M", "Licra");
		app2.insert2(101, 25, "17-01-2020", 6, "ADIDAS", "LARGO", "M", "Licra");
		app2.insert2(102, 25, "17-01-2020", 7, "ADIDAS", "LARGO", "M", "Licra");
		app2.insert2(103, 25, "17-01-2020", 3, "ADIDAS", "LARGO", "L", "Licra");
		app2.insert2(104, 25, "17-01-2020", 4, "ADIDAS", "LARGO", "L", "Licra");
		app2.insert2(105, 25, "17-01-2020", 5, "ADIDAS", "LARGO", "L", "Licra");
		app2.insert2(106, 25, "17-01-2020", 6, "ADIDAS", "LARGO", "L", "Licra");
		app2.insert2(107, 25, "17-01-2020", 7, "NIKE", "LARGO", "S", "Licra");
		app2.insert2(108, 25, "17-01-2020", 3, "NIKE", "LARGO", "S", "Licra");
		app2.insert2(109, 25, "17-01-2020", 4, "NIKE", "LARGO", "S", "Licra");
		app2.insert2(110, 25, "17-01-2020", 5, "NIKE", "LARGO", "S", "Licra");
		app2.insert2(111, 25, "17-01-2020", 6, "NIKE", "LARGO", "S", "Licra");
		app2.insert2(112, 25, "17-01-2020", 7, "NIKE", "LARGO", "M", "Licra");
		app2.insert2(113, 25, "17-01-2020", 3, "NIKE", "LARGO", "M", "Licra");
		app2.insert2(114, 25, "17-01-2020", 4, "NIKE", "LARGO", "M", "Licra");
		app2.insert2(115, 25, "17-01-2020", 5, "NIKE", "LARGO", "M", "Licra");
		app2.insert2(116, 25, "17-01-2020", 7, "NIKE", "LARGO", "L", "Licra");
		app2.insert2(117, 25, "17-01-2020", 3, "NIKE", "LARGO", "L", "Licra");
		app2.insert2(118, 25, "17-01-2020", 4, "NIKE", "LARGO", "L", "Licra");
		app2.insert2(119, 25, "17-01-2020", 5, "NIKE", "LARGO", "L", "Licra");
		app2.insert2(120, 25, "17-01-2020", 6, "NIKE", "LARGO", "L", "Licra");
		app2.insert2(121, 25, "17-01-2020", 7, "PUMA", "LARGO", "S", "Licra");
		app2.insert2(122, 25, "17-01-2020", 3, "PUMA", "LARGO", "S", "Licra");
		app2.insert2(123, 25, "17-01-2020", 4, "PUMA", "LARGO", "S", "Licra");
		app2.insert2(124, 25, "17-01-2020", 5, "PUMA", "LARGO", "S", "Licra");
		app2.insert2(125, 25, "17-01-2020", 6, "PUMA", "LARGO", "S", "Licra");
		app2.insert2(126, 25, "17-01-2020", 7, "PUMA", "LARGO", "M", "Licra");
		app2.insert2(127, 25, "17-01-2020", 3, "PUMA", "LARGO", "M", "Licra");
		app2.insert2(128, 25, "17-01-2020", 4, "PUMA", "LARGO", "M", "Licra");
		app2.insert2(129, 25, "17-01-2020", 5, "PUMA", "LARGO", "M", "Licra");
		app2.insert2(130, 25, "17-01-2020", 6, "PUMA", "LARGO", "M", "Licra");
		app2.insert2(131, 25, "17-01-2020", 7, "PUMA", "LARGO", "L", "Licra");
		app2.insert2(132, 25, "17-01-2020", 3, "PUMA", "LARGO", "L", "Licra");
		app2.insert2(133, 25, "17-01-2020", 4, "PUMA", "LARGO", "L", "Licra");
		app2.insert2(134, 25, "17-01-2020", 5, "PUMA", "LARGO", "L", "Licra");
		app2.insert2(135, 25, "17-01-2020", 6, "PUMA", "LARGO", "L", "Licra");
		app2.insert2(136, 25, "17-01-2020", 7, "JOMA", "LARGO", "S", "Licra");
		app2.insert2(137, 25, "17-01-2020", 3, "JOMA", "LARGO", "S", "Licra");
		app2.insert2(138, 25, "17-01-2020", 4, "JOMA", "LARGO", "S", "Licra");
		app2.insert2(139, 25, "17-01-2020", 5, "JOMA", "LARGO", "S", "Licra");
		app2.insert2(140, 25, "17-01-2020", 6, "JOMA", "LARGO", "S", "Licra");
		app2.insert2(141, 25, "17-01-2020", 7, "JOMA", "LARGO", "M", "Licra");
		app2.insert2(142, 25, "17-01-2020", 3, "JOMA", "LARGO", "M", "Licra");
		app2.insert2(143, 25, "17-01-2020", 4, "JOMA", "LARGO", "M", "Licra");
		app2.insert2(144, 25, "17-01-2020", 5, "JOMA", "LARGO", "M", "Licra");
		app2.insert2(145, 25, "17-01-2020", 6, "JOMA", "LARGO", "M", "Licra");
		app2.insert2(146, 25, "17-01-2020", 7, "JOMA", "LARGO", "L", "Licra");
		app2.insert2(147, 25, "17-01-2020", 3, "JOMA", "LARGO", "L", "Licra");
		app2.insert2(148, 25, "17-01-2020", 4, "JOMA", "LARGO", "L", "Licra");
		app2.insert2(149, 25, "17-01-2020", 5, "JOMA", "LARGO", "L", "Licra");
		app2.insert2(150, 25, "17-01-2020", 6, "JOMA", "LARGO", "L", "Licra");
		app2.insert2(151, 25, "17-01-2020", 7, "ORBEA", "LARGO", "L", "Licra");
		app2.insert2(152, 25, "17-01-2020", 7, "ORBEA", "LARGO", "S", "Licra");
		app2.insert2(153, 25, "17-01-2020", 3, "ORBEA", "LARGO", "S", "Licra");
		app2.insert2(154, 25, "17-01-2020", 4, "ORBEA", "LARGO", "S", "Licra");
		app2.insert2(155, 25, "17-01-2020", 5, "ORBEA", "LARGO", "S", "Licra");
		app2.insert2(156, 25, "17-01-2020", 6, "ORBEA", "LARGO", "S", "Licra");
		app2.insert2(157, 25, "17-01-2020", 7, "ORBEA", "LARGO", "M", "Licra");
		app2.insert2(158, 25, "17-01-2020", 3, "ORBEA", "LARGO", "M", "Licra");
		app2.insert2(159, 25, "17-01-2020", 4, "ORBEA", "LARGO", "M", "Licra");
		app2.insert2(160, 25, "17-01-2020", 5, "ORBEA", "LARGO", "M", "Licra");
		app2.insert2(161, 25, "17-01-2020", 6, "ORBEA", "LARGO", "M", "Licra");
		app2.insert2(162, 25, "17-01-2020", 7, "ORBEA", "LARGO", "L", "Licra");
		app2.insert2(163, 25, "17-01-2020", 3, "ORBEA", "LARGO", "L", "Licra");
		app2.insert2(164, 25, "17-01-2020", 4, "ORBEA", "LARGO", "L", "Licra");
		app2.insert2(165, 25, "17-01-2020", 5, "ORBEA", "LARGO", "L", "Licra");
		app2.insert2(166, 25, "17-01-2020", 6, "ORBEA", "LARGO", "L", "Licra");
		app2.insert2(167, 25, "17-01-2020", 7, "ASTORE", "LARGO", "L", "Licra");
		app2.insert2(168, 25, "17-01-2020", 7, "ASTORE", "LARGO", "S", "Licra");
		app2.insert2(169, 25, "17-01-2020", 3, "ASTORE", "LARGO", "S", "Licra");
		app2.insert2(170, 25, "17-01-2020", 4, "ASTORE", "LARGO", "S", "Licra");
		app2.insert2(171, 25, "17-01-2020", 5, "ASTORE", "LARGO", "S", "Licra");
		app2.insert2(172, 25, "17-01-2020", 6, "ASTORE", "LARGO", "S", "Licra");
		app2.insert2(173, 25, "17-01-2020", 7, "ASTORE", "LARGO", "M", "Licra");
		app2.insert2(174, 25, "17-01-2020", 3, "ASTORE", "LARGO", "M", "Licra");
		app2.insert2(175, 25, "17-01-2020", 4, "ASTORE", "LARGO", "M", "Licra");
		app2.insert2(176, 25, "17-01-2020", 5, "ASTORE", "LARGO", "M", "Licra");
		app2.insert2(177, 25, "17-01-2020", 6, "ASTORE", "LARGO", "M", "Licra");
		app2.insert2(178, 25, "17-01-2020", 7, "ASTORE", "LARGO", "L", "Licra");
		app2.insert2(179, 25, "17-01-2020", 3, "ASTORE", "LARGO", "L", "Licra");
		app2.insert2(180, 25, "17-01-2020", 4, "ASTORE", "LARGO", "L", "Licra");
		app2.insert2(181, 25, "17-01-2020", 5, "ASTORE", "LARGO", "L", "Licra");
		app2.insert2(182, 25, "17-01-2020", 6, "ASTORE", "LARGO", "L", "Licra");
	
		
		InsertData app3=new InsertData();
		
		app3.insert3(1, 40, "31-05-2020", 3, "ADIDAS", "Running", 36);
		app3.insert3(2, 40, "31-05-2020", 4, "ADIDAS", "Running", 36);
		app3.insert3(3, 40, "31-05-2020", 5, "ADIDAS", "Running", 36);
		app3.insert3(4, 40, "31-05-2020", 6, "ADIDAS", "Running", 36);
		app3.insert3(5, 40, "31-05-2020", 7, "ADIDAS", "Running", 36);
		app3.insert3(6, 40, "31-05-2020", 3, "ADIDAS", "Running", 37);
		app3.insert3(7, 40, "31-05-2020", 4, "ADIDAS", "Running", 37);
		app3.insert3(8, 40, "31-05-2020", 5, "ADIDAS", "Running", 37);
		app3.insert3(9, 40, "31-05-2020", 6, "ADIDAS", "Running", 37);
		app3.insert3(10, 40, "31-05-2020", 7, "ADIDAS", "Running", 37);
		app3.insert3(11, 40, "31-05-2020", 3, "ADIDAS", "Running", 38);
		app3.insert3(12, 40, "31-05-2020", 4, "ADIDAS", "Running", 38);
		app3.insert3(13, 40, "31-05-2020", 5, "ADIDAS", "Running", 38);
		app3.insert3(14, 40, "31-05-2020", 6, "ADIDAS", "Running", 38);
		app3.insert3(15, 40, "31-05-2020", 7, "ADIDAS", "Running", 38);
		app3.insert3(16, 40, "31-05-2020", 3, "ADIDAS", "Running", 39);
		app3.insert3(17, 40, "31-05-2020", 4, "ADIDAS", "Running", 39);
		app3.insert3(18, 40, "31-05-2020", 5, "ADIDAS", "Running", 39);
		app3.insert3(19, 40, "31-05-2020", 6, "ADIDAS", "Running", 39);
		app3.insert3(20, 40, "31-05-2020", 7, "ADIDAS", "Running", 39);
		app3.insert3(21, 40, "31-05-2020", 3, "ADIDAS", "Running", 40);
		app3.insert3(22, 40, "31-05-2020", 4, "ADIDAS", "Running", 40);
		app3.insert3(23, 40, "31-05-2020", 5, "ADIDAS", "Running", 40);
		app3.insert3(24, 40, "31-05-2020", 6, "ADIDAS", "Running", 40);
		app3.insert3(25, 40, "31-05-2020", 7, "ADIDAS", "Running", 40);
		app3.insert3(26, 40, "31-05-2020", 3, "ADIDAS", "Running", 41);
		app3.insert3(27, 40, "31-05-2020", 4, "ADIDAS", "Running", 41);
		app3.insert3(28, 40, "31-05-2020", 5, "ADIDAS", "Running", 41);
		app3.insert3(29, 40, "31-05-2020", 6, "ADIDAS", "Running", 41);
		app3.insert3(30, 40, "31-05-2020", 7, "ADIDAS", "Running", 41);
		app3.insert3(31, 40, "31-05-2020", 3, "ADIDAS", "Running", 42);
		app3.insert3(32, 40, "31-05-2020", 4, "ADIDAS", "Running", 42);
		app3.insert3(33, 40, "31-05-2020", 5, "ADIDAS", "Running", 42);
		app3.insert3(34, 40, "31-05-2020", 6, "ADIDAS", "Running", 42);
		app3.insert3(35, 40, "31-05-2020", 7, "ADIDAS", "Running", 42);
		app3.insert3(36, 40, "31-05-2020", 3, "ADIDAS", "Running", 43);
		app3.insert3(37, 40, "31-05-2020", 4, "ADIDAS", "Running", 43);
		app3.insert3(38, 40, "31-05-2020", 5, "ADIDAS", "Running", 43);
		app3.insert3(39, 40, "31-05-2020", 6, "ADIDAS", "Running", 43);
		app3.insert3(40, 40, "31-05-2020", 7, "ADIDAS", "Running", 43);
		app3.insert3(41, 50, "11-05-2020", 3, "NIKE", "Running", 36);
		app3.insert3(42, 50, "11-05-2020", 4, "NIKE", "Running", 36);
		app3.insert3(43, 50, "11-05-2020", 5, "NIKE", "Running", 36);
		app3.insert3(44, 50, "11-05-2020", 6, "NIKE", "Running", 36);
		app3.insert3(45, 50, "11-05-2020", 7, "NIKE", "Running", 36);
		app3.insert3(46, 50, "11-05-2020", 3, "NIKE", "Running", 37);
		app3.insert3(47, 50, "11-05-2020", 4, "NIKE", "Running", 37);
		app3.insert3(48, 50, "11-05-2020", 5, "NIKE", "Running", 37);
		app3.insert3(49, 50, "11-05-2020", 6, "NIKE", "Running", 37);
		app3.insert3(50, 50, "11-05-2020", 7, "NIKE", "Running", 37);
		app3.insert3(51, 50, "11-05-2020", 3, "NIKE", "Running", 38);
		app3.insert3(52, 50, "11-05-2020", 4, "NIKE", "Running", 38);
		app3.insert3(53, 50, "11-05-2020", 5, "NIKE", "Running", 38);
		app3.insert3(54, 50, "11-05-2020", 6, "NIKE", "Running", 38);
		app3.insert3(55, 50, "11-05-2020", 7, "NIKE", "Running", 38);
		app3.insert3(56, 50, "11-05-2020", 3, "NIKE", "Running", 39);
		app3.insert3(57, 50, "11-05-2020", 4, "NIKE", "Running", 39);
		app3.insert3(58, 50, "11-05-2020", 5, "NIKE", "Running", 39);
		app3.insert3(59, 50, "11-05-2020", 6, "NIKE", "Running", 39);
		app3.insert3(60, 50, "11-05-2020", 7, "NIKE", "Running", 39);
		app3.insert3(61, 50, "11-05-2020", 3, "NIKE", "Running", 40);
		app3.insert3(62, 50, "11-05-2020", 4, "NIKE", "Running", 40);
		app3.insert3(63, 50, "11-05-2020", 5, "NIKE", "Running", 40);
		app3.insert3(64, 50, "11-05-2020", 6, "NIKE", "Running", 40);
		app3.insert3(65, 50, "11-05-2020", 7, "NIKE", "Running", 40);
		app3.insert3(66, 50, "11-05-2020", 3, "NIKE", "Running", 41);
		app3.insert3(67, 50, "11-05-2020", 4, "NIKE", "Running", 41);
		app3.insert3(68, 50, "11-05-2020", 5, "NIKE", "Running", 41);
		app3.insert3(69, 50, "11-05-2020", 6, "NIKE", "Running", 41);
		app3.insert3(70, 50, "11-05-2020", 7, "NIKE", "Running", 41);
		app3.insert3(71, 50, "11-05-2020", 3, "NIKE", "Running", 42);
		app3.insert3(72, 50, "11-05-2020", 4, "NIKE", "Running", 42);
		app3.insert3(73, 50, "11-05-2020", 5, "NIKE", "Running", 42);
		app3.insert3(74, 50, "11-05-2020", 6, "NIKE", "Running", 42);
		app3.insert3(75, 50, "11-05-2020", 7, "NIKE", "Running", 42);
		app3.insert3(76, 50, "11-05-2020", 3, "NIKE", "Running", 43);
		app3.insert3(77, 50, "11-05-2020", 4, "NIKE", "Running", 43);
		app3.insert3(78, 50, "11-05-2020", 5, "NIKE", "Running", 43);
		app3.insert3(79, 50, "11-05-2020", 6, "NIKE", "Running", 43);
		app3.insert3(80, 50, "11-05-2020", 7, "NIKE", "Running", 43);
		app3.insert3(81, 60, "21-05-2020", 3, "PUMA", "Running", 36);
		app3.insert3(82, 60, "21-05-2020", 4, "PUMA", "Running", 36);
		app3.insert3(83, 60, "21-05-2020", 5, "PUMA", "Running", 36);
		app3.insert3(84, 60, "21-05-2020", 6, "PUMA", "Running", 36);
		app3.insert3(85, 60, "21-05-2020", 7, "PUMA", "Running", 36);
		app3.insert3(86, 60, "21-05-2020", 3, "PUMA", "Running", 37);
		app3.insert3(87, 60, "21-05-2020", 4, "PUMA", "Running", 37);
		app3.insert3(88, 60, "21-05-2020", 5, "PUMA", "Running", 37);
		app3.insert3(89, 60, "21-05-2020", 6, "PUMA", "Running", 37);
		app3.insert3(90, 60, "21-05-2020", 7, "PUMA", "Running", 37);
		app3.insert3(91, 60, "21-05-2020", 3, "PUMA", "Running", 38);
		app3.insert3(92, 60, "21-05-2020", 4, "PUMA", "Running", 38);
		app3.insert3(93, 60, "21-05-2020", 5, "PUMA", "Running", 38);
		app3.insert3(94, 60, "21-05-2020", 6, "PUMA", "Running", 38);
		app3.insert3(95, 60, "21-05-2020", 7, "PUMA", "Running", 38);
		app3.insert3(96, 60, "21-05-2020", 3, "PUMA", "Running", 39);
		app3.insert3(97, 60, "21-05-2020", 4, "PUMA", "Running", 39);
		app3.insert3(98, 60, "21-05-2020", 5, "PUMA", "Running", 39);
		app3.insert3(99, 60, "21-05-2020", 6, "PUMA", "Running", 39);
		app3.insert3(100, 60, "21-05-2020", 7, "PUMA", "Running", 39);
		app3.insert3(101, 60, "21-05-2020", 3, "PUMA", "Running", 40);
		app3.insert3(102, 60, "21-05-2020", 4, "PUMA", "Running", 40);
		app3.insert3(103, 60, "21-05-2020", 5, "PUMA", "Running", 40);
		app3.insert3(104, 60, "21-05-2020", 6, "PUMA", "Running", 40);
		app3.insert3(105, 60, "21-05-2020", 7, "PUMA", "Running", 40);
		app3.insert3(106, 60, "21-05-2020", 3, "PUMA", "Running", 41);
		app3.insert3(107, 60, "21-05-2020", 4, "PUMA", "Running", 41);
		app3.insert3(108, 60, "21-05-2020", 5, "PUMA", "Running", 41);
		app3.insert3(109, 60, "21-05-2020", 6, "PUMA", "Running", 41);
		app3.insert3(110, 60, "21-05-2020", 7, "PUMA", "Running", 41);
		app3.insert3(111, 60, "21-05-2020", 3, "PUMA", "Running", 42);
		app3.insert3(112, 60, "21-05-2020", 4, "PUMA", "Running", 42);
		app3.insert3(113, 60, "21-05-2020", 5, "PUMA", "Running", 42);
		app3.insert3(114, 60, "21-05-2020", 6, "PUMA", "Running", 42);
		app3.insert3(115, 60, "21-05-2020", 7, "PUMA", "Running", 42);
		app3.insert3(116, 60, "21-05-2020", 3, "PUMA", "Running", 43);
		app3.insert3(117, 60, "21-05-2020", 4, "PUMA", "Running", 43);
		app3.insert3(118, 60, "21-05-2020", 5, "PUMA", "Running", 43);
		app3.insert3(119, 60, "21-05-2020", 6, "PUMA", "Running", 43);
		app3.insert3(120, 60, "21-05-2020", 7, "PUMA", "Running", 43);
		app3.insert3(121, 65, "21-05-2020", 3, "JOMA", "Trecking", 36);
		app3.insert3(122, 65, "21-05-2020", 4, "JOMA", "Trecking", 36);
		app3.insert3(123, 65, "21-05-2020", 5, "JOMA", "Trecking", 36);
		app3.insert3(124, 65, "21-05-2020", 6, "JOMA", "Trecking", 36);
		app3.insert3(125, 65, "21-05-2020", 7, "JOMA", "Trecking", 36);
		app3.insert3(126, 65, "21-05-2020", 3, "JOMA", "Trecking", 37);
		app3.insert3(127, 65, "21-05-2020", 4, "JOMA", "Trecking", 37);
		app3.insert3(128, 65, "21-05-2020", 5, "JOMA", "Trecking", 37);
		app3.insert3(129, 65, "21-05-2020", 6, "JOMA", "Trecking", 37);
		app3.insert3(130, 65, "21-05-2020", 7, "JOMA", "Trecking", 37);
		app3.insert3(131, 65, "21-05-2020", 3, "JOMA", "Trecking", 38);
		app3.insert3(132, 65, "21-05-2020", 4, "JOMA", "Trecking", 38);
		app3.insert3(133, 65, "21-05-2020", 5, "JOMA", "Trecking", 38);
		app3.insert3(134, 65, "21-05-2020", 6, "JOMA", "Trecking", 38);
		app3.insert3(135, 65, "21-05-2020", 7, "JOMA", "Trecking", 38);
		app3.insert3(136, 65, "21-05-2020", 3, "JOMA", "Trecking", 39);
		app3.insert3(137, 65, "21-05-2020", 4, "JOMA", "Trecking", 39);
		app3.insert3(138, 65, "21-05-2020", 5, "JOMA", "Trecking", 39);
		app3.insert3(139, 65, "21-05-2020", 6, "JOMA", "Trecking", 39);
		app3.insert3(140, 65, "21-05-2020", 7, "JOMA", "Trecking", 39);
		app3.insert3(141, 65, "21-05-2020", 3, "JOMA", "Trecking", 40);
		app3.insert3(142, 65, "21-05-2020", 4, "JOMA", "Trecking", 40);
		app3.insert3(143, 65, "21-05-2020", 5, "JOMA", "Trecking", 40);
		app3.insert3(144, 65, "21-05-2020", 6, "JOMA", "Trecking", 40);
		app3.insert3(145, 65, "21-05-2020", 7, "JOMA", "Trecking", 40);
		app3.insert3(146, 65, "21-05-2020", 3, "JOMA", "Trecking", 41);
		app3.insert3(147, 65, "21-05-2020", 4, "JOMA", "Trecking", 41);
		app3.insert3(148, 65, "21-05-2020", 5, "JOMA", "Trecking", 41);
		app3.insert3(149, 65, "21-05-2020", 6, "JOMA", "Trecking", 41);
		app3.insert3(150, 65, "21-05-2020", 7, "JOMA", "Trecking", 41);
		app3.insert3(151, 65, "21-05-2020", 3, "JOMA", "Trecking", 42);
		app3.insert3(152, 65, "21-05-2020", 4, "JOMA", "Trecking", 42);
		app3.insert3(153, 65, "21-05-2020", 5, "JOMA", "Trecking", 42);
		app3.insert3(154, 65, "21-05-2020", 6, "JOMA", "Trecking", 42);
		app3.insert3(155, 65, "21-05-2020", 7, "JOMA", "Trecking", 42);
		app3.insert3(156, 65, "21-05-2020", 3, "JOMA", "Trecking", 43);
		app3.insert3(157, 65, "21-05-2020", 4, "JOMA", "Trecking", 43);
		app3.insert3(158, 65, "21-05-2020", 5, "JOMA", "Trecking", 43);
		app3.insert3(158, 65, "21-05-2020", 6, "JOMA", "Trecking", 43);
		app3.insert3(160, 65, "21-05-2020", 7, "JOMA", "Trecking", 43);
		app3.insert3(161, 70, "21-09-2020", 3, "ORBEA", "Trecking", 36);
		app3.insert3(162, 70, "21-09-2020", 4, "ORBEA", "Trecking", 36);
		app3.insert3(163, 70, "21-09-2020", 5, "ORBEA", "Trecking", 36);
		app3.insert3(164, 70, "21-09-2020", 6, "ORBEA", "Trecking", 36);
		app3.insert3(165, 70, "21-09-2020", 7, "ORBEA", "Trecking", 36);
		app3.insert3(166, 70, "21-09-2020", 3, "ORBEA", "Trecking", 37);
		app3.insert3(167, 70, "21-09-2020", 4, "ORBEA", "Trecking", 37);
		app3.insert3(168, 70, "21-09-2020", 5, "ORBEA", "Trecking", 37);
		app3.insert3(169, 70, "21-09-2020", 6, "ORBEA", "Trecking", 37);
		app3.insert3(170, 70, "21-09-2020", 7, "ORBEA", "Trecking", 37);
		app3.insert3(171, 70, "21-09-2020", 3, "ORBEA", "Trecking", 38);
		app3.insert3(172, 70, "21-09-2020", 4, "ORBEA", "Trecking", 38);
		app3.insert3(173, 70, "21-09-2020", 5, "ORBEA", "Trecking", 38);
		app3.insert3(174, 70, "21-09-2020", 6, "ORBEA", "Trecking", 38);
		app3.insert3(174, 70, "21-09-2020", 7, "ORBEA", "Trecking", 38);
		app3.insert3(176, 70, "21-09-2020", 3, "ORBEA", "Trecking", 39);
		app3.insert3(177, 70, "21-09-2020", 4, "ORBEA", "Trecking", 39);
		app3.insert3(178, 70, "21-09-2020", 5, "ORBEA", "Trecking", 39);
		app3.insert3(179, 70, "21-09-2020", 6, "ORBEA", "Trecking", 39);
		app3.insert3(180, 70, "21-09-2020", 7, "ORBEA", "Trecking", 39);
		app3.insert3(181, 70, "21-09-2020", 3, "ORBEA", "Trecking", 40);
		app3.insert3(182, 70, "21-09-2020", 4, "ORBEA", "Trecking", 40);
		app3.insert3(183, 70, "21-09-2020", 5, "ORBEA", "Trecking", 40);
		app3.insert3(184, 70, "21-09-2020", 6, "ORBEA", "Trecking", 40);
		app3.insert3(185, 70, "21-09-2020", 7, "ORBEA", "Trecking", 40);
		app3.insert3(186, 70, "21-09-2020", 3, "ORBEA", "Trecking", 41);
		app3.insert3(187, 70, "21-09-2020", 4, "ORBEA", "Trecking", 41);
		app3.insert3(188, 70, "21-09-2020", 5, "ORBEA", "Trecking", 41);
		app3.insert3(189, 70, "21-09-2020", 6, "ORBEA", "Trecking", 41);
		app3.insert3(190, 70, "21-09-2020", 7, "ORBEA", "Trecking", 41);
		app3.insert3(191, 70, "21-09-2020", 3, "ORBEA", "Trecking", 42);
		app3.insert3(192, 70, "21-09-2020", 4, "ORBEA", "Trecking", 42);
		app3.insert3(193, 70, "21-09-2020", 5, "ORBEA", "Trecking", 42);
		app3.insert3(194, 70, "21-09-2020", 6, "ORBEA", "Trecking", 42);
		app3.insert3(195, 70, "21-09-2020", 7, "ORBEA", "Trecking", 42);
		app3.insert3(196, 70, "21-09-2020", 3, "ORBEA", "Trecking", 43);
		app3.insert3(197, 70, "21-09-2020", 4, "ORBEA", "Trecking", 43);
		app3.insert3(198, 70, "21-09-2020", 5, "ORBEA", "Trecking", 43);
		app3.insert3(199, 70, "21-09-2020", 6, "ORBEA", "Trecking", 43);
		app3.insert3(200, 70, "21-09-2020", 7, "ORBEA", "Trecking", 43);
		app3.insert3(201, 75, "01-05-2020", 3, "ASTORE", "Trecking", 36);
		app3.insert3(202, 75, "01-05-2020", 4, "ASTORE", "Trecking", 36);
		app3.insert3(203, 75, "01-05-2020", 5, "ASTORE", "Trecking", 36);
		app3.insert3(204, 75, "01-05-2020", 6, "ASTORE", "Trecking", 36);
		app3.insert3(205, 75, "01-05-2020", 7, "ASTORE", "Trecking", 36);
		app3.insert3(206, 75, "01-05-2020", 3, "ASTORE", "Trecking", 37);
		app3.insert3(207, 75, "01-05-2020", 4, "ASTORE", "Trecking", 37);
		app3.insert3(208, 75, "01-05-2020", 5, "ASTORE", "Trecking", 37);
		app3.insert3(209, 75, "01-05-2020", 6, "ASTORE", "Trecking", 37);
		app3.insert3(210, 75, "01-05-2020", 7, "ASTORE", "Trecking", 37);
		app3.insert3(211, 75, "01-05-2020", 3, "ASTORE", "Trecking", 38);
		app3.insert3(212, 75, "01-05-2020", 4, "ASTORE", "Trecking", 38);
		app3.insert3(213, 75, "01-05-2020", 5, "ASTORE", "Trecking", 38);
		app3.insert3(214, 75, "01-05-2020", 6, "ASTORE", "Trecking", 38);
		app3.insert3(215, 75, "01-05-2020", 7, "ASTORE", "Trecking", 38);
		app3.insert3(216, 75, "01-05-2020", 3, "ASTORE", "Trecking", 39);
		app3.insert3(217, 75, "01-05-2020", 4, "ASTORE", "Trecking", 39);
		app3.insert3(218, 75, "01-05-2020", 5, "ASTORE", "Trecking", 39);
		app3.insert3(219, 75, "01-05-2020", 6, "ASTORE", "Trecking", 39);
		app3.insert3(220, 75, "01-05-2020", 7, "ASTORE", "Trecking", 39);
		app3.insert3(221, 75, "01-05-2020", 3, "ASTORE", "Trecking", 40);
		app3.insert3(222, 75, "01-05-2020", 4, "ASTORE", "Trecking", 40);
		app3.insert3(223, 75, "01-05-2020", 5, "ASTORE", "Trecking", 40);
		app3.insert3(224, 75, "01-05-2020", 6, "ASTORE", "Trecking", 40);
		app3.insert3(225, 75, "01-05-2020", 7, "ASTORE", "Trecking", 40);
		app3.insert3(226, 75, "01-05-2020", 3, "ASTORE", "Trecking", 41);
		app3.insert3(227, 75, "01-05-2020", 4, "ASTORE", "Trecking", 41);
		app3.insert3(228, 75, "01-05-2020", 5, "ASTORE", "Trecking", 41);
		app3.insert3(229, 75, "01-05-2020", 6, "ASTORE", "Trecking", 41);
		app3.insert3(230, 75, "01-05-2020", 7, "ASTORE", "Trecking", 41);
		app3.insert3(231, 75, "01-05-2020", 3, "ASTORE", "Trecking", 42);
		app3.insert3(232, 75, "01-05-2020", 4, "ASTORE", "Trecking", 42);
		app3.insert3(233, 75, "01-05-2020", 5, "ASTORE", "Trecking", 42);
		app3.insert3(234, 75, "01-05-2020", 6, "ASTORE", "Trecking", 42);
		app3.insert3(235, 75, "01-05-2020", 7, "ASTORE", "Trecking", 42);
		app3.insert3(236, 75, "01-05-2020", 3, "ASTORE", "Trecking", 43);
		app3.insert3(237, 75, "01-05-2020", 4, "ASTORE", "Trecking", 43);
		app3.insert3(238, 75, "01-05-2020", 5, "ASTORE", "Trecking", 43);
		app3.insert3(239, 75, "01-05-2020", 6, "ASTORE", "Trecking", 43);
		app3.insert3(240, 75, "01-05-2020", 7, "ASTORE", "Trecking", 43);


	}	

}
