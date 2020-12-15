package sqlite;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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
		
		String name = "Tienda.db";
		String url = "jdbc:sqlite:"+name;
		
		Connection conn=null;
		
		try{
			conn=DriverManager.getConnection(url);
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
		
				
	
	/**
	 * Insertar fila en la tabla camisetas
	 * @param id_producto
	 * @param marca
	 * @param modelo
	 * @param talla
	 * @param material_composicion
	 * @throws SQLException 
	 */
	
	
	public void insert (int id_producto, String marca, String modelo, String talla, String material_composicion) throws SQLException{
		String sql="INSERT INTO Camisetas (id_producto, marca, modelo, talla, material_composicion) VALUES (?,?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement pstmt= null;
		
		try{
		
				 conn=this.connect();
				 pstmt = conn.prepareStatement(sql);
			
			
		{
			pstmt.setInt (1, id_producto);
			pstmt.setString (2, marca);
			pstmt.setString (3, modelo);
			pstmt.setString(4, talla);
			pstmt.setString (5, material_composicion);
			pstmt.executeUpdate();
		}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}finally{
				conn.close();
			}
	}
	
	/**
	 * Insertar fila en la tabla pantalones
	 * @param id_producto
	 * @param marca
	 * @param modelo
	 * @param talla
	 * @param material_composicion
	 * @throws SQLException 
	 */
	
	public void insert2 (int id_producto, String marca, String modelo, String talla, String material_composicion) throws SQLException{
		String sql="INSERT INTO Pantalones (id_producto, marca, modelo, talla, material_composicion) VALUES (?,?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement pstmt= null;
		
		try{
		
				 conn=this.connect();
				 pstmt = conn.prepareStatement(sql);
		{
			pstmt.setInt (1, id_producto);
			pstmt.setString (2, marca);
			pstmt.setString (3, modelo);
			pstmt.setString(4, talla);
			pstmt.setString (5, material_composicion);
			pstmt.executeUpdate();
		}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}finally{
				conn.close();
			}
	}
	
	/**
	 * Insertar fila en la tabla zapatillas
	 * @param id_producto
	 * @param marca
	 * @param modelo
	 * @param talla
	 * @throws SQLException 
	 */
	
	public void insert3 (int id_producto, String marca, String modelo, int talla) throws SQLException{
		String sql="INSERT INTO Zapatillas (id_producto, marca, modelo, talla) VALUES (?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement pstmt= null;
		
		try{
		
				 conn=this.connect();
				 pstmt = conn.prepareStatement(sql);
		{
			pstmt.setInt (1, id_producto);
			pstmt.setString (2, marca);
			pstmt.setString (3, modelo);
			pstmt.setInt(4, talla);
			pstmt.executeUpdate();
		}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}finally{
				conn.close();
			}
	}
	
	/**
	 * Insertar fila en la tabla usuario
	 * @param id_usuario
	 * @param nombre
	 * @param id_compra_realizada
	 * @param numero_comentario
	 * @param contenido_comentario
	 * @throws SQLException 
	 */
	
	public void insert4 (int id_usuario, String nombre, int id_compra_realizada, int numero_comentario, String contenido_comentario) throws SQLException{
		String sql="INSERT INTO Usuarios (id_usuario, nombre, id_compra_realizada, numero_comentario,contenido_comentario) VALUES (?,?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement pstmt= null;
		
		try{
		
				 conn=this.connect();
				 pstmt = conn.prepareStatement(sql);
		{
			pstmt.setInt (1, id_usuario);
			pstmt.setString(2, nombre);
			pstmt.setInt(3, id_compra_realizada);
			pstmt.setInt(4, numero_comentario);
			pstmt.setString(5, contenido_comentario);
			pstmt.executeUpdate();
		}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}finally{
				conn.close();
			}
	}
	
	/**
	 * Insertar fila en la tabla administrador
	 * @param id_usuario
	 * @param id_administrador
	 * @param nombre
	 * @param id_compra_realizada
	 * @param numero_comentario
	 * @param contenido_comentario
	 * @throws SQLException 
	 */
	
	public void insert5 (int id_usuario, int id_administrador) throws SQLException{
		String sql="INSERT INTO Administradores (id_usuario, id_administrador) VALUES (?,?)";
		
		Connection conn=null;
		PreparedStatement pstmt= null;
		
		try{
		
				 conn=this.connect();
				 pstmt = conn.prepareStatement(sql);
		{
			pstmt.setInt (1, id_usuario);
			pstmt.setInt(2, id_administrador);
			pstmt.executeUpdate();
		}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}finally{
				conn.close();
			}
	}
	
	
	
	public void insert6 (int id_producto, float precio, String fecha_recepcion, int unidades) throws SQLException{
		String sql="INSERT INTO Productos (id_producto, precio, fecha_recepcion, unidades) VALUES (?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement pstmt= null;
		
		try{
		
				 conn=this.connect();
				 pstmt = conn.prepareStatement(sql);
		{
			pstmt.setInt (1, id_producto);
			pstmt.setFloat(2, precio);
			pstmt.setString(3, fecha_recepcion);
			pstmt.setInt(4, unidades);
			pstmt.executeUpdate();
		}
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}finally{
				conn.close();
			}
	}
	
	
	
	/**
	 * 
	 * @param args
	 * @throws SQLException 
	 */
	
	public static void main (String[] args) throws SQLException{
		
		/**
		 * Insertar en la tabla camisetas
		 */
		
		InsertData app=new InsertData();
		
		app.insert(1,"ADIDAS", "CORTO", "S", "Algodon");
		app.insert(2,"ADIDAS", "CORTO", "S", "Algodon");
		app.insert(3,"ADIDAS", "CORTO", "S", "Algodon");
		app.insert(4,"ADIDAS", "CORTO", "S", "Algodon");
		app.insert(5,"ADIDAS", "CORTO", "S", "Algodon");
		app.insert(6,"ADIDAS", "CORTO", "M", "Algodon");
		app.insert(7,"ADIDAS", "CORTO", "M", "Algodon");
		app.insert(8,"ADIDAS", "CORTO", "M", "Algodon");
		app.insert(9,"ADIDAS", "CORTO", "M", "Algodon");
		app.insert(10,"ADIDAS", "CORTO", "M", "Algodon");
		app.insert(12,"ADIDAS", "CORTO", "L", "Algodon");
		app.insert(13,"ADIDAS", "CORTO", "L", "Algodon");
		app.insert(14,"ADIDAS", "CORTO", "L", "Algodon");
		app.insert(15,"ADIDAS", "CORTO", "L", "Algodon");
		app.insert(16,"NIKE", "CORTO", "S", "Algodon");
		app.insert(17,"NIKE", "CORTO", "S", "Algodon");
		app.insert(18,"NIKE", "CORTO", "S", "Algodon");
		app.insert(19,"NIKE", "CORTO", "S", "Algodon");
		app.insert(20,"NIKE", "CORTO", "S", "Algodon");
		app.insert(21,"NIKE", "CORTO", "M", "Algodon");
		app.insert(22,"NIKE", "CORTO", "M", "Algodon");
		app.insert(23,"NIKE", "CORTO", "M", "Algodon");
		app.insert(24,"NIKE", "CORTO", "M", "Algodon");
		app.insert(25,"NIKE", "CORTO", "M", "Algodon");
		app.insert(26,"NIKE", "CORTO", "L", "Algodon");
		app.insert(27,"NIKE", "CORTO", "L", "Algodon");
		app.insert(28,"NIKE", "CORTO", "L", "Algodon");
		app.insert(29,"NIKE", "CORTO", "L", "Algodon");
		app.insert(30,"NIKE", "CORTO", "L", "Algodon");
		app.insert(31,"PUMA", "CORTO", "S", "Algodon");
		app.insert(32,"PUMA", "CORTO", "S", "Algodon");
		app.insert(33,"PUMA", "CORTO", "S", "Algodon");
		app.insert(34,"PUMA", "CORTO", "S", "Algodon");
		app.insert(35,"PUMA", "CORTO", "M", "Algodon");
		app.insert(37,"PUMA", "CORTO", "M", "Algodon");
		app.insert(38,"PUMA", "CORTO", "M", "Algodon");
		app.insert(39,"PUMA", "CORTO", "M", "Algodon");
		app.insert(40,"PUMA", "CORTO", "M", "Algodon");
		app.insert(41,"PUMA", "CORTO", "L", "Algodon");
		app.insert(42,"PUMA", "CORTO", "L", "Algodon");
		app.insert(43,"PUMA", "CORTO", "L", "Algodon");
		app.insert(44,"PUMA", "CORTO", "L", "Algodon");
		app.insert(45,"PUMA", "CORTO", "L", "Algodon");
		app.insert(46,"JOMA", "CORTO", "S", "Algodon");
		app.insert(47,"JOMA", "CORTO", "S", "Algodon");
		app.insert(48,"JOMA", "CORTO", "S", "Algodon");
		app.insert(49,"JOMA", "CORTO", "S", "Algodon");
		app.insert(50,"JOMA", "CORTO", "S", "Algodon");
		app.insert(51,"JOMA", "CORTO", "M", "Algodon");
		app.insert(52,"JOMA", "CORTO", "M", "Algodon");
		app.insert(53,"JOMA", "CORTO", "M", "Algodon");
		app.insert(54,"JOMA", "CORTO", "M", "Algodon");
		app.insert(55,"JOMA", "CORTO", "M", "Algodon");
		app.insert(56,"JOMA", "CORTO", "L", "Algodon");
		app.insert(57,"JOMA", "CORTO", "L", "Algodon");
		app.insert(58,"JOMA", "CORTO", "L", "Algodon");
		app.insert(59,"JOMA", "CORTO", "L", "Algodon");
		app.insert(60,"JOMA", "CORTO", "L", "Algodon");
		app.insert(61,"ORBEA", "CORTO", "L", "Algodon");
		app.insert(62,"ORBEA", "CORTO", "S", "Algodon");
		app.insert(63,"ORBEA", "CORTO", "S", "Algodon");
		app.insert(64,"ORBEA", "CORTO", "S", "Algodon");
		app.insert(65,"ORBEA", "CORTO", "S", "Algodon");
		app.insert(66,"ORBEA", "CORTO", "S", "Algodon");
		app.insert(67,"ORBEA", "CORTO", "M", "Algodon");
		app.insert(68,"ORBEA", "CORTO", "M", "Algodon");
		app.insert(69,"ORBEA", "CORTO", "M", "Algodon");
		app.insert(70,"ORBEA", "CORTO", "M", "Algodon");
		app.insert(71,"ORBEA", "CORTO", "M", "Algodon");
		app.insert(72,"ORBEA", "CORTO", "L", "Algodon");
		app.insert(73,"ORBEA", "CORTO", "L", "Algodon");
		app.insert(74,"ORBEA", "CORTO", "L", "Algodon");
		app.insert(75,"ORBEA", "CORTO", "L", "Algodon");
		app.insert(76,"ORBEA", "CORTO", "L", "Algodon");
		app.insert(77,"ASTORE", "CORTO", "L", "Algodon");
		app.insert(78,"ASTORE", "CORTO", "S", "Algodon");
		app.insert(79,"ASTORE", "CORTO", "S", "Algodon");
		app.insert(80,"ASTORE", "CORTO", "S", "Algodon");
		app.insert(81,"ASTORE", "CORTO", "S", "Algodon");
		app.insert(82,"ASTORE", "CORTO", "S", "Algodon");
		app.insert(83,"ASTORE", "CORTO", "M", "Algodon");
		app.insert(84,"ASTORE", "CORTO", "M", "Algodon");
		app.insert(85,"ASTORE", "CORTO", "M", "Algodon");
		app.insert(86,"ASTORE", "CORTO", "M", "Algodon");
		app.insert(87,"ASTORE", "CORTO", "M", "Algodon");
		app.insert(88,"ASTORE", "CORTO", "L", "Algodon");
		app.insert(89,"ASTORE", "CORTO", "L", "Algodon");
		app.insert(90,"ASTORE", "CORTO", "L", "Algodon");
		app.insert(91,"ASTORE", "CORTO", "L", "Algodon");
		app.insert(92,"ASTORE", "CORTO", "L", "Algodon");
		app.insert(93,"ADIDAS", "LARGO", "S", "Licra");
		app.insert(94,"ADIDAS", "LARGO", "S", "Licra");
		app.insert(95,"ADIDAS", "LARGO", "S", "Licra");
		app.insert(96,"ADIDAS", "LARGO", "S", "Licra");
		app.insert(97,"ADIDAS", "LARGO", "S", "Licra");
		app.insert(98,"ADIDAS", "LARGO", "M", "Licra");
		app.insert(99,"ADIDAS", "LARGO", "M", "Licra");
		app.insert(100,"ADIDAS", "LARGO", "M", "Licra");
		app.insert(101,"ADIDAS", "LARGO", "M", "Licra");
		app.insert(102,"ADIDAS", "LARGO", "M", "Licra");
		app.insert(103,"ADIDAS", "LARGO", "L", "Licra");
		app.insert(104,"ADIDAS", "LARGO", "L", "Licra");
		app.insert(105,"ADIDAS", "LARGO", "L", "Licra");
		app.insert(106,"ADIDAS", "LARGO", "L", "Licra");
		app.insert(107,"NIKE", "LARGO", "S", "Licra");
		app.insert(108,"NIKE", "LARGO", "S", "Licra");
		app.insert(109,"NIKE", "LARGO", "S", "Licra");
		app.insert(110,"NIKE", "LARGO", "S", "Licra");
		app.insert(111,"NIKE", "LARGO", "S", "Licra");
		app.insert(112,"NIKE", "LARGO", "M", "Licra");
		app.insert(113,"NIKE", "LARGO", "M", "Licra");
		app.insert(114,"NIKE", "LARGO", "M", "Licra");
		app.insert(115,"NIKE", "LARGO", "M", "Licra");
		app.insert(116,"NIKE", "LARGO", "L", "Licra");
		app.insert(117,"NIKE", "LARGO", "L", "Licra");
		app.insert(118,"NIKE", "LARGO", "L", "Licra");
		app.insert(119,"NIKE", "LARGO", "L", "Licra");
		app.insert(120,"NIKE", "LARGO", "L", "Licra");
		app.insert(121,"PUMA", "LARGO", "S", "Licra");
		app.insert(122,"PUMA", "LARGO", "S", "Licra");
		app.insert(123,"PUMA", "LARGO", "S", "Licra");
		app.insert(124,"PUMA", "LARGO", "S", "Licra");
		app.insert(125,"PUMA", "LARGO", "S", "Licra");
		app.insert(126,"PUMA", "LARGO", "M", "Licra");
		app.insert(127,"PUMA", "LARGO", "M", "Licra");
		app.insert(128,"PUMA", "LARGO", "M", "Licra");
		app.insert(129,"PUMA", "LARGO", "M", "Licra");
		app.insert(130,"PUMA", "LARGO", "M", "Licra");
		app.insert(131,"PUMA", "LARGO", "L", "Licra");
		app.insert(132,"PUMA", "LARGO", "L", "Licra");
		app.insert(133,"PUMA", "LARGO", "L", "Licra");
		app.insert(134,"PUMA", "LARGO", "L", "Licra");
		app.insert(135,"PUMA", "LARGO", "L", "Licra");
		app.insert(136,"JOMA", "LARGO", "S", "Licra");
		app.insert(137,"JOMA", "LARGO", "S", "Licra");
		app.insert(138,"JOMA", "LARGO", "S", "Licra");
		app.insert(139,"JOMA", "LARGO", "S", "Licra");
		app.insert(140,"JOMA", "LARGO", "S", "Licra");
		app.insert(141,"JOMA", "LARGO", "M", "Licra");
		app.insert(142,"JOMA", "LARGO", "M", "Licra");
		app.insert(143,"JOMA", "LARGO", "M", "Licra");
		app.insert(144,"JOMA", "LARGO", "M", "Licra");
		app.insert(145,"JOMA", "LARGO", "M", "Licra");
		app.insert(146,"JOMA", "LARGO", "L", "Licra");
		app.insert(147,"JOMA", "LARGO", "L", "Licra");
		app.insert(148,"JOMA", "LARGO", "L", "Licra");
		app.insert(149,"JOMA", "LARGO", "L", "Licra");
		app.insert(150,"JOMA", "LARGO", "L", "Licra");
		app.insert(151,"ORBEA", "LARGO", "L", "Licra");
		app.insert(152,"ORBEA", "LARGO", "S", "Licra");
		app.insert(153,"ORBEA", "LARGO", "S", "Licra");
		app.insert(154,"ORBEA", "LARGO", "S", "Licra");
		app.insert(155,"ORBEA", "LARGO", "S", "Licra");
		app.insert(156,"ORBEA", "LARGO", "S", "Licra");
		app.insert(157,"ORBEA", "LARGO", "M", "Licra");
		app.insert(158,"ORBEA", "LARGO", "M", "Licra");
		app.insert(159,"ORBEA", "LARGO", "M", "Licra");
		app.insert(160,"ORBEA", "LARGO", "M", "Licra");
		app.insert(161,"ORBEA", "LARGO", "M", "Licra");
		app.insert(162,"ORBEA", "LARGO", "L", "Licra");
		app.insert(163,"ORBEA", "LARGO", "L", "Licra");
		app.insert(164,"ORBEA", "LARGO", "L", "Licra");
		app.insert(165,"ORBEA", "LARGO", "L", "Licra");
		app.insert(166,"ORBEA", "LARGO", "L", "Licra");
		app.insert(167,"ASTORE", "LARGO", "L", "Licra");
		app.insert(168,"ASTORE", "LARGO", "S", "Licra");
		app.insert(169,"ASTORE", "LARGO", "S", "Licra");
		app.insert(170,"ASTORE", "LARGO", "S", "Licra");
		app.insert(171,"ASTORE", "LARGO", "S", "Licra");
		app.insert(172,"ASTORE", "LARGO", "S", "Licra");
		app.insert(173,"ASTORE", "LARGO", "M", "Licra");
		app.insert(174,"ASTORE", "LARGO", "M", "Licra");
		app.insert(175,"ASTORE", "LARGO", "M", "Licra");
		app.insert(176,"ASTORE", "LARGO", "M", "Licra");
		app.insert(177,"ASTORE", "LARGO", "M", "Licra");
		app.insert(178,"ASTORE", "LARGO", "L", "Licra");
		app.insert(179,"ASTORE", "LARGO", "L", "Licra");
		app.insert(180,"ASTORE", "LARGO", "L", "Licra");
		app.insert(181,"ASTORE", "LARGO", "L", "Licra");
		app.insert(182,"ASTORE", "LARGO", "L", "Licra");

		/**
		 * Insertar en la tabla Pantalones
		 */
		
		InsertData app2=new InsertData();
		
		app2.insert2(183,"ADIDAS", "CORTO", "S", "Algodon");
		app2.insert2(184,"ADIDAS", "CORTO", "S", "Algodon");
		app2.insert2(185,"ADIDAS", "CORTO", "S", "Algodon");
		app2.insert2(186,"ADIDAS", "CORTO", "S", "Algodon");
		app2.insert2(187,"ADIDAS", "CORTO", "S", "Algodon");
		app2.insert2(188,"ADIDAS", "CORTO", "M", "Algodon");
		app2.insert2(189,"ADIDAS", "CORTO", "M", "Algodon");
		app2.insert2(190,"ADIDAS", "CORTO", "M", "Algodon");
		app2.insert2(191,"ADIDAS", "CORTO", "M", "Algodon");
		app2.insert2(192,"ADIDAS", "CORTO", "M", "Algodon");
		app2.insert2(193,"ADIDAS", "CORTO", "L", "Algodon");
		app2.insert2(194,"ADIDAS", "CORTO", "L", "Algodon");
		app2.insert2(195,"ADIDAS", "CORTO", "L", "Algodon");
		app2.insert2(196,"ADIDAS", "CORTO", "L", "Algodon");
		app2.insert2(197,"NIKE", "CORTO", "S", "Algodon");
		app2.insert2(198,"NIKE", "CORTO", "S", "Algodon");
		app2.insert2(199,"NIKE", "CORTO", "S", "Algodon");
		app2.insert2(200,"NIKE", "CORTO", "S", "Algodon");
		app2.insert2(201,"NIKE", "CORTO", "S", "Algodon");
		app2.insert2(202,"NIKE", "CORTO", "M", "Algodon");
		app2.insert2(203,"NIKE", "CORTO", "M", "Algodon");
		app2.insert2(204,"NIKE", "CORTO", "M", "Algodon");
		app2.insert2(205,"NIKE", "CORTO", "M", "Algodon");
		app2.insert2(206,"NIKE", "CORTO", "M", "Algodon");
		app2.insert2(207,"NIKE", "CORTO", "L", "Algodon");
		app2.insert2(208,"NIKE", "CORTO", "L", "Algodon");
		app2.insert2(209,"NIKE", "CORTO", "L", "Algodon");
		app2.insert2(210,"NIKE", "CORTO", "L", "Algodon");
		app2.insert2(211,"NIKE", "CORTO", "L", "Algodon");
		app2.insert2(212,"PUMA", "CORTO", "S", "Algodon");
		app2.insert2(213,"PUMA", "CORTO", "S", "Algodon");
		app2.insert2(214,"PUMA", "CORTO", "S", "Algodon");
		app2.insert2(215,"PUMA", "CORTO", "S", "Algodon");
		app2.insert2(216,"PUMA", "CORTO", "M", "Algodon");
		app2.insert2(217,"PUMA", "CORTO", "M", "Algodon");
		app2.insert2(218,"PUMA", "CORTO", "M", "Algodon");
		app2.insert2(219,"PUMA", "CORTO", "M", "Algodon");
		app2.insert2(220,"PUMA", "CORTO", "M", "Algodon");
		app2.insert2(221,"PUMA", "CORTO", "L", "Algodon");
		app2.insert2(222,"PUMA", "CORTO", "L", "Algodon");
		app2.insert2(223,"PUMA", "CORTO", "L", "Algodon");
		app2.insert2(224,"PUMA", "CORTO", "L", "Algodon");
		app2.insert2(225,"PUMA", "CORTO", "L", "Algodon");
		app2.insert2(226,"JOMA", "CORTO", "S", "Algodon");
		app2.insert2(227,"JOMA", "CORTO", "S", "Algodon");
		app2.insert2(228,"JOMA", "CORTO", "S", "Algodon");
		app2.insert2(229,"JOMA", "CORTO", "S", "Algodon");
		app2.insert2(230,"JOMA", "CORTO", "S", "Algodon");
		app2.insert2(231,"JOMA", "CORTO", "M", "Algodon");
		app2.insert2(232,"JOMA", "CORTO", "M", "Algodon");
		app2.insert2(233,"JOMA", "CORTO", "M", "Algodon");
		app2.insert2(234,"JOMA", "CORTO", "M", "Algodon");
		app2.insert2(235,"JOMA", "CORTO", "M", "Algodon");
		app2.insert2(236,"JOMA", "CORTO", "L", "Algodon");
		app2.insert2(237,"JOMA", "CORTO", "L", "Algodon");
		app2.insert2(238,"JOMA", "CORTO", "L", "Algodon");
		app2.insert2(239,"JOMA", "CORTO", "L", "Algodon");
		app2.insert2(240,"JOMA", "CORTO", "L", "Algodon");
		app2.insert2(241,"ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(242,"ORBEA", "CORTO", "S", "Algodon");
		app2.insert2(243,"ORBEA", "CORTO", "S", "Algodon");
		app2.insert2(244,"ORBEA", "CORTO", "S", "Algodon");
		app2.insert2(245,"ORBEA", "CORTO", "S", "Algodon");
		app2.insert2(246,"ORBEA", "CORTO", "S", "Algodon");
		app2.insert2(247,"ORBEA", "CORTO", "M", "Algodon");
		app2.insert2(248,"ORBEA", "CORTO", "M", "Algodon");
		app2.insert2(249,"ORBEA", "CORTO", "M", "Algodon");
		app2.insert2(250,"ORBEA", "CORTO", "M", "Algodon");
		app2.insert2(251,"ORBEA", "CORTO", "M", "Algodon");
		app2.insert2(252,"ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(253,"ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(254,"ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(255,"ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(256,"ORBEA", "CORTO", "L", "Algodon");
		app2.insert2(257,"ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(258,"ASTORE", "CORTO", "S", "Algodon");
		app2.insert2(259,"ASTORE", "CORTO", "S", "Algodon");
		app2.insert2(260,"ASTORE", "CORTO", "S", "Algodon");
		app2.insert2(261,"ASTORE", "CORTO", "S", "Algodon");
		app2.insert2(262,"ASTORE", "CORTO", "S", "Algodon");
		app2.insert2(263,"ASTORE", "CORTO", "M", "Algodon");
		app2.insert2(264,"ASTORE", "CORTO", "M", "Algodon");
		app2.insert2(265,"ASTORE", "CORTO", "M", "Algodon");
		app2.insert2(266,"ASTORE", "CORTO", "M", "Algodon");
		app2.insert2(267,"ASTORE", "CORTO", "M", "Algodon");
		app2.insert2(268,"ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(269,"ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(270,"ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(271,"ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(272,"ASTORE", "CORTO", "L", "Algodon");
		app2.insert2(273,"ADIDAS", "LARGO", "S", "Licra");
		app2.insert2(274,"ADIDAS", "LARGO", "S", "Licra");
		app2.insert2(275,"ADIDAS", "LARGO", "S", "Licra");
		app2.insert2(276,"ADIDAS", "LARGO", "S", "Licra");
		app2.insert2(277,"ADIDAS", "LARGO", "S", "Licra");
		app2.insert2(278,"ADIDAS", "LARGO", "M", "Licra");
		app2.insert2(279,"ADIDAS", "LARGO", "M", "Licra");
		app2.insert2(280,"ADIDAS", "LARGO", "M", "Licra");
		app2.insert2(281,"ADIDAS", "LARGO", "M", "Licra");
		app2.insert2(282,"ADIDAS", "LARGO", "M", "Licra");
		app2.insert2(283,"ADIDAS", "LARGO", "L", "Licra");
		app2.insert2(284,"ADIDAS", "LARGO", "L", "Licra");
		app2.insert2(285,"ADIDAS", "LARGO", "L", "Licra");
		app2.insert2(286,"ADIDAS", "LARGO", "L", "Licra");
		app2.insert2(287,"NIKE", "LARGO", "S", "Licra");
		app2.insert2(288,"NIKE", "LARGO", "S", "Licra");
		app2.insert2(289,"NIKE", "LARGO", "S", "Licra");
		app2.insert2(280,"NIKE", "LARGO", "S", "Licra");
		app2.insert2(291,"NIKE", "LARGO", "S", "Licra");
		app2.insert2(292,"NIKE", "LARGO", "M", "Licra");
		app2.insert2(293,"NIKE", "LARGO", "M", "Licra");
		app2.insert2(294,"NIKE", "LARGO", "M", "Licra");
		app2.insert2(295,"NIKE", "LARGO", "M", "Licra");
		app2.insert2(296,"NIKE", "LARGO", "L", "Licra");
		app2.insert2(297,"NIKE", "LARGO", "L", "Licra");
		app2.insert2(298,"NIKE", "LARGO", "L", "Licra");
		app2.insert2(299,"NIKE", "LARGO", "L", "Licra");
		app2.insert2(300,"NIKE", "LARGO", "L", "Licra");
		app2.insert2(301,"PUMA", "LARGO", "S", "Licra");
		app2.insert2(302,"PUMA", "LARGO", "S", "Licra");
		app2.insert2(303,"PUMA", "LARGO", "S", "Licra");
		app2.insert2(304,"PUMA", "LARGO", "S", "Licra");
		app2.insert2(305,"PUMA", "LARGO", "S", "Licra");
		app2.insert2(306,"PUMA", "LARGO", "M", "Licra");
		app2.insert2(307,"PUMA", "LARGO", "M", "Licra");
		app2.insert2(308,"PUMA", "LARGO", "M", "Licra");
		app2.insert2(309,"PUMA", "LARGO", "M", "Licra");
		app2.insert2(310,"PUMA", "LARGO", "M", "Licra");
		app2.insert2(311,"PUMA", "LARGO", "L", "Licra");
		app2.insert2(312,"PUMA", "LARGO", "L", "Licra");
		app2.insert2(313,"PUMA", "LARGO", "L", "Licra");
		app2.insert2(314,"PUMA", "LARGO", "L", "Licra");
		app2.insert2(315,"PUMA", "LARGO", "L", "Licra");
		app2.insert2(316,"JOMA", "LARGO", "S", "Licra");
		app2.insert2(317,"JOMA", "LARGO", "S", "Licra");
		app2.insert2(318,"JOMA", "LARGO", "S", "Licra");
		app2.insert2(319,"JOMA", "LARGO", "S", "Licra");
		app2.insert2(320,"JOMA", "LARGO", "S", "Licra");
		app2.insert2(321,"JOMA", "LARGO", "M", "Licra");
		app2.insert2(322,"JOMA", "LARGO", "M", "Licra");
		app2.insert2(323,"JOMA", "LARGO", "M", "Licra");
		app2.insert2(324,"JOMA", "LARGO", "M", "Licra");
		app2.insert2(325,"JOMA", "LARGO", "M", "Licra");
		app2.insert2(326,"JOMA", "LARGO", "L", "Licra");
		app2.insert2(327,"JOMA", "LARGO", "L", "Licra");
		app2.insert2(328,"JOMA", "LARGO", "L", "Licra");
		app2.insert2(329,"JOMA", "LARGO", "L", "Licra");
		app2.insert2(330,"JOMA", "LARGO", "L", "Licra");
		app2.insert2(331,"ORBEA", "LARGO", "L", "Licra");
		app2.insert2(332,"ORBEA", "LARGO", "S", "Licra");
		app2.insert2(333,"ORBEA", "LARGO", "S", "Licra");
		app2.insert2(334,"ORBEA", "LARGO", "S", "Licra");
		app2.insert2(335,"ORBEA", "LARGO", "S", "Licra");
		app2.insert2(336,"ORBEA", "LARGO", "S", "Licra");
		app2.insert2(337,"ORBEA", "LARGO", "M", "Licra");
		app2.insert2(338,"ORBEA", "LARGO", "M", "Licra");
		app2.insert2(339,"ORBEA", "LARGO", "M", "Licra");
		app2.insert2(340,"ORBEA", "LARGO", "M", "Licra");
		app2.insert2(341,"ORBEA", "LARGO", "M", "Licra");
		app2.insert2(342,"ORBEA", "LARGO", "L", "Licra");
		app2.insert2(343,"ORBEA", "LARGO", "L", "Licra");
		app2.insert2(344,"ORBEA", "LARGO", "L", "Licra");
		app2.insert2(345,"ORBEA", "LARGO", "L", "Licra");
		app2.insert2(346,"ORBEA", "LARGO", "L", "Licra");
		app2.insert2(347,"ASTORE", "LARGO", "L", "Licra");
		app2.insert2(348,"ASTORE", "LARGO", "S", "Licra");
		app2.insert2(349,"ASTORE", "LARGO", "S", "Licra");
		app2.insert2(350,"ASTORE", "LARGO", "S", "Licra");
		app2.insert2(351,"ASTORE", "LARGO", "S", "Licra");
		app2.insert2(352,"ASTORE", "LARGO", "S", "Licra");
		app2.insert2(353,"ASTORE", "LARGO", "M", "Licra");
		app2.insert2(354,"ASTORE", "LARGO", "M", "Licra");
		app2.insert2(355,"ASTORE", "LARGO", "M", "Licra");
		app2.insert2(356,"ASTORE", "LARGO", "M", "Licra");
		app2.insert2(357,"ASTORE", "LARGO", "M", "Licra");
		app2.insert2(358,"ASTORE", "LARGO", "L", "Licra");
		app2.insert2(359,"ASTORE", "LARGO", "L", "Licra");
		app2.insert2(360,"ASTORE", "LARGO", "L", "Licra");
		app2.insert2(361,"ASTORE", "LARGO", "L", "Licra");
		app2.insert2(362,"ASTORE", "LARGO", "L", "Licra");
	
		/**
		 * Insertar en la tabla zapatillas
		 */
		
		InsertData app3=new InsertData();
		
		app3.insert3(363,"ADIDAS", "Running", 36);
		app3.insert3(364,"ADIDAS", "Running", 36);
		app3.insert3(365,"ADIDAS", "Running", 36);
		app3.insert3(366,"ADIDAS", "Running", 36);
		app3.insert3(367,"ADIDAS", "Running", 36);
		app3.insert3(368,"ADIDAS", "Running", 37);
		app3.insert3(369,"ADIDAS", "Running", 37);
		app3.insert3(370,"ADIDAS", "Running", 37);
		app3.insert3(371,"ADIDAS", "Running", 37);
		app3.insert3(372,"ADIDAS", "Running", 37);
		app3.insert3(373,"ADIDAS", "Running", 38);
		app3.insert3(374,"ADIDAS", "Running", 38);
		app3.insert3(375,"ADIDAS", "Running", 38);
		app3.insert3(376,"ADIDAS", "Running", 38);
		app3.insert3(377,"ADIDAS", "Running", 38);
		app3.insert3(378,"ADIDAS", "Running", 39);
		app3.insert3(379,"ADIDAS", "Running", 39);
		app3.insert3(380,"ADIDAS", "Running", 39);
		app3.insert3(381,"ADIDAS", "Running", 39);
		app3.insert3(382,"ADIDAS", "Running", 39);
		app3.insert3(383,"ADIDAS", "Running", 40);
		app3.insert3(384,"ADIDAS", "Running", 40);
		app3.insert3(385,"ADIDAS", "Running", 40);
		app3.insert3(386,"ADIDAS", "Running", 40);
		app3.insert3(387,"ADIDAS", "Running", 40);
		app3.insert3(388,"ADIDAS", "Running", 41);
		app3.insert3(389,"ADIDAS", "Running", 41);
		app3.insert3(390,"ADIDAS", "Running", 41);
		app3.insert3(391,"ADIDAS", "Running", 41);
		app3.insert3(392,"ADIDAS", "Running", 41);
		app3.insert3(393,"ADIDAS", "Running", 42);
		app3.insert3(394,"ADIDAS", "Running", 42);
		app3.insert3(395,"ADIDAS", "Running", 42);
		app3.insert3(396,"ADIDAS", "Running", 42);
		app3.insert3(397,"ADIDAS", "Running", 42);
		app3.insert3(398,"ADIDAS", "Running", 43);
		app3.insert3(399,"ADIDAS", "Running", 43);
		app3.insert3(400,"ADIDAS", "Running", 43);
		app3.insert3(401,"ADIDAS", "Running", 43);
		app3.insert3(402,"ADIDAS", "Running", 43);
		app3.insert3(403,"NIKE", "Running", 36);
		app3.insert3(404,"NIKE", "Running", 36);
		app3.insert3(405,"NIKE", "Running", 36);
		app3.insert3(406,"NIKE", "Running", 36);
		app3.insert3(407,"NIKE", "Running", 36);
		app3.insert3(408,"NIKE", "Running", 37);
		app3.insert3(409,"NIKE", "Running", 37);
		app3.insert3(410,"NIKE", "Running", 37);
		app3.insert3(411,"NIKE", "Running", 37);
		app3.insert3(412,"NIKE", "Running", 37);
		app3.insert3(413,"NIKE", "Running", 38);
		app3.insert3(414,"NIKE", "Running", 38);
		app3.insert3(415,"NIKE", "Running", 38);
		app3.insert3(416,"NIKE", "Running", 38);
		app3.insert3(417,"NIKE", "Running", 38);
		app3.insert3(418,"NIKE", "Running", 39);
		app3.insert3(419,"NIKE", "Running", 39);
		app3.insert3(420,"NIKE", "Running", 39);
		app3.insert3(421,"NIKE", "Running", 39);
		app3.insert3(422,"NIKE", "Running", 39);
		app3.insert3(423,"NIKE", "Running", 40);
		app3.insert3(424,"NIKE", "Running", 40);
		app3.insert3(425,"NIKE", "Running", 40);
		app3.insert3(426,"NIKE", "Running", 40);
		app3.insert3(427,"NIKE", "Running", 40);
		app3.insert3(428,"NIKE", "Running", 41);
		app3.insert3(429,"NIKE", "Running", 41);
		app3.insert3(430,"NIKE", "Running", 41);
		app3.insert3(431,"NIKE", "Running", 41);
		app3.insert3(432,"NIKE", "Running", 41);
		app3.insert3(433,"NIKE", "Running", 42);
		app3.insert3(434,"NIKE", "Running", 42);
		app3.insert3(435,"NIKE", "Running", 42);
		app3.insert3(436,"NIKE", "Running", 42);
		app3.insert3(437,"NIKE", "Running", 42);
		app3.insert3(438,"NIKE", "Running", 43);
		app3.insert3(439,"NIKE", "Running", 43);
		app3.insert3(440,"NIKE", "Running", 43);
		app3.insert3(441,"NIKE", "Running", 43);
		app3.insert3(442,"NIKE", "Running", 43);
		app3.insert3(443,"PUMA", "Running", 36);
		app3.insert3(444,"PUMA", "Running", 36);
		app3.insert3(445,"PUMA", "Running", 36);
		app3.insert3(446,"PUMA", "Running", 36);
		app3.insert3(447,"PUMA", "Running", 36);
		app3.insert3(448,"PUMA", "Running", 37);
		app3.insert3(449,"PUMA", "Running", 37);
		app3.insert3(450,"PUMA", "Running", 37);
		app3.insert3(451,"PUMA", "Running", 37);
		app3.insert3(452,"PUMA", "Running", 37);
		app3.insert3(453,"PUMA", "Running", 38);
		app3.insert3(454,"PUMA", "Running", 38);
		app3.insert3(455,"PUMA", "Running", 38);
		app3.insert3(456,"PUMA", "Running", 38);
		app3.insert3(457,"PUMA", "Running", 38);
		app3.insert3(458,"PUMA", "Running", 39);
		app3.insert3(459,"PUMA", "Running", 39);
		app3.insert3(460,"PUMA", "Running", 39);
		app3.insert3(461,"PUMA", "Running", 39);
		app3.insert3(462,"PUMA", "Running", 39);
		app3.insert3(463,"PUMA", "Running", 40);
		app3.insert3(464,"PUMA", "Running", 40);
		app3.insert3(465,"PUMA", "Running", 40);
		app3.insert3(466,"PUMA", "Running", 40);
		app3.insert3(467,"PUMA", "Running", 40);
		app3.insert3(468,"PUMA", "Running", 41);
		app3.insert3(469,"PUMA", "Running", 41);
		app3.insert3(470,"PUMA", "Running", 41);
		app3.insert3(471,"PUMA", "Running", 41);
		app3.insert3(472,"PUMA", "Running", 41);
		app3.insert3(473,"PUMA", "Running", 42);
		app3.insert3(474,"PUMA", "Running", 42);
		app3.insert3(475,"PUMA", "Running", 42);
		app3.insert3(476,"PUMA", "Running", 42);
		app3.insert3(477,"PUMA", "Running", 42);
		app3.insert3(478,"PUMA", "Running", 43);
		app3.insert3(479,"PUMA", "Running", 43);
		app3.insert3(480,"PUMA", "Running", 43);
		app3.insert3(481,"PUMA", "Running", 43);
		app3.insert3(482,"PUMA", "Running", 43);
		app3.insert3(483,"JOMA", "Trecking", 36);
		app3.insert3(484,"JOMA", "Trecking", 36);
		app3.insert3(485,"JOMA", "Trecking", 36);
		app3.insert3(486,"JOMA", "Trecking", 36);
		app3.insert3(487,"JOMA", "Trecking", 36);
		app3.insert3(488,"JOMA", "Trecking", 37);
		app3.insert3(489,"JOMA", "Trecking", 37);
		app3.insert3(490,"JOMA", "Trecking", 37);
		app3.insert3(491,"JOMA", "Trecking", 37);
		app3.insert3(492,"JOMA", "Trecking", 37);
		app3.insert3(493,"JOMA", "Trecking", 38);
		app3.insert3(494,"JOMA", "Trecking", 38);
		app3.insert3(495,"JOMA", "Trecking", 38);
		app3.insert3(496,"JOMA", "Trecking", 38);
		app3.insert3(497,"JOMA", "Trecking", 38);
		app3.insert3(498,"JOMA", "Trecking", 39);
		app3.insert3(499,"JOMA", "Trecking", 39);
		app3.insert3(500,"JOMA", "Trecking", 39);
		app3.insert3(501,"JOMA", "Trecking", 39);
		app3.insert3(502,"JOMA", "Trecking", 39);
		app3.insert3(503,"JOMA", "Trecking", 40);
		app3.insert3(504,"JOMA", "Trecking", 40);
		app3.insert3(505,"JOMA", "Trecking", 40);
		app3.insert3(506,"JOMA", "Trecking", 40);
		app3.insert3(507,"JOMA", "Trecking", 40);
		app3.insert3(508,"JOMA", "Trecking", 41);
		app3.insert3(509,"JOMA", "Trecking", 41);
		app3.insert3(510,"JOMA", "Trecking", 41);
		app3.insert3(511,"JOMA", "Trecking", 41);
		app3.insert3(512,"JOMA", "Trecking", 41);
		app3.insert3(513,"JOMA", "Trecking", 42);
		app3.insert3(514,"JOMA", "Trecking", 42);
		app3.insert3(515,"JOMA", "Trecking", 42);
		app3.insert3(516,"JOMA", "Trecking", 42);
		app3.insert3(517,"JOMA", "Trecking", 42);
		app3.insert3(518,"JOMA", "Trecking", 43);
		app3.insert3(519,"JOMA", "Trecking", 43);
		app3.insert3(520,"JOMA", "Trecking", 43);
		app3.insert3(521,"JOMA", "Trecking", 43);
		app3.insert3(522,"JOMA", "Trecking", 43);
		app3.insert3(523,"ORBEA", "Trecking", 36);
		app3.insert3(524,"ORBEA", "Trecking", 36);
		app3.insert3(525,"ORBEA", "Trecking", 36);
		app3.insert3(526,"ORBEA", "Trecking", 36);
		app3.insert3(527,"ORBEA", "Trecking", 36);
		app3.insert3(528,"ORBEA", "Trecking", 37);
		app3.insert3(529,"ORBEA", "Trecking", 37);
		app3.insert3(530,"ORBEA", "Trecking", 37);
		app3.insert3(531,"ORBEA", "Trecking", 37);
		app3.insert3(532,"ORBEA", "Trecking", 37);
		app3.insert3(533,"ORBEA", "Trecking", 38);
		app3.insert3(534,"ORBEA", "Trecking", 38);
		app3.insert3(535,"ORBEA", "Trecking", 38);
		app3.insert3(536,"ORBEA", "Trecking", 38);
		app3.insert3(537,"ORBEA", "Trecking", 38);
		app3.insert3(538,"ORBEA", "Trecking", 39);
		app3.insert3(539,"ORBEA", "Trecking", 39);
		app3.insert3(540,"ORBEA", "Trecking", 39);
		app3.insert3(541,"ORBEA", "Trecking", 39);
		app3.insert3(542,"ORBEA", "Trecking", 39);
		app3.insert3(543,"ORBEA", "Trecking", 40);
		app3.insert3(544,"ORBEA", "Trecking", 40);
		app3.insert3(545,"ORBEA", "Trecking", 40);
		app3.insert3(546,"ORBEA", "Trecking", 40);
		app3.insert3(547,"ORBEA", "Trecking", 40);
		app3.insert3(548,"ORBEA", "Trecking", 41);
		app3.insert3(549,"ORBEA", "Trecking", 41);
		app3.insert3(550,"ORBEA", "Trecking", 41);
		app3.insert3(551,"ORBEA", "Trecking", 41);
		app3.insert3(552,"ORBEA", "Trecking", 41);
		app3.insert3(553,"ORBEA", "Trecking", 42);
		app3.insert3(554,"ORBEA", "Trecking", 42);
		app3.insert3(555,"ORBEA", "Trecking", 42);
		app3.insert3(556,"ORBEA", "Trecking", 42);
		app3.insert3(557,"ORBEA", "Trecking", 42);
		app3.insert3(558,"ORBEA", "Trecking", 43);
		app3.insert3(559,"ORBEA", "Trecking", 43);
		app3.insert3(560,"ORBEA", "Trecking", 43);
		app3.insert3(561,"ORBEA", "Trecking", 43);
		app3.insert3(562,"ORBEA", "Trecking", 43);
		app3.insert3(563,"ASTORE", "Trecking", 36);
		app3.insert3(564,"ASTORE", "Trecking", 36);
		app3.insert3(565,"ASTORE", "Trecking", 36);
		app3.insert3(566,"ASTORE", "Trecking", 36);
		app3.insert3(567,"ASTORE", "Trecking", 36);
		app3.insert3(568,"ASTORE", "Trecking", 37);
		app3.insert3(569,"ASTORE", "Trecking", 37);
		app3.insert3(570,"ASTORE", "Trecking", 37);
		app3.insert3(571,"ASTORE", "Trecking", 37);
		app3.insert3(572,"ASTORE", "Trecking", 37);
		app3.insert3(573,"ASTORE", "Trecking", 38);
		app3.insert3(574,"ASTORE", "Trecking", 38);
		app3.insert3(575,"ASTORE", "Trecking", 38);
		app3.insert3(576,"ASTORE", "Trecking", 38);
		app3.insert3(577,"ASTORE", "Trecking", 38);
		app3.insert3(578,"ASTORE", "Trecking", 39);
		app3.insert3(579,"ASTORE", "Trecking", 39);
		app3.insert3(580,"ASTORE", "Trecking", 39);
		app3.insert3(581,"ASTORE", "Trecking", 39);
		app3.insert3(582,"ASTORE", "Trecking", 39);
		app3.insert3(583,"ASTORE", "Trecking", 40);
		app3.insert3(584,"ASTORE", "Trecking", 40);
		app3.insert3(585,"ASTORE", "Trecking", 40);
		app3.insert3(586,"ASTORE", "Trecking", 40);
		app3.insert3(587,"ASTORE", "Trecking", 40);
		app3.insert3(588,"ASTORE", "Trecking", 41);
		app3.insert3(589,"ASTORE", "Trecking", 41);
		app3.insert3(590,"ASTORE", "Trecking", 41);
		app3.insert3(591,"ASTORE", "Trecking", 41);
		app3.insert3(592,"ASTORE", "Trecking", 41);
		app3.insert3(593,"ASTORE", "Trecking", 42);
		app3.insert3(594,"ASTORE", "Trecking", 42);
		app3.insert3(595,"ASTORE", "Trecking", 42);
		app3.insert3(596,"ASTORE", "Trecking", 42);
		app3.insert3(597,"ASTORE", "Trecking", 42);
		app3.insert3(598,"ASTORE", "Trecking", 43);
		app3.insert3(599,"ASTORE", "Trecking", 43);
		app3.insert3(600,"ASTORE", "Trecking", 43);
		app3.insert3(601,"ASTORE", "Trecking", 43);
		app3.insert3(602,"ASTORE", "Trecking", 43);

		/**
		 * Insertar en la tabla usuarios
		 */
		
		InsertData app4 = new InsertData();
		
		app4.insert4(1, "Naroa1", 1, 1, "Bien1");
		app4.insert4(2, "Naroa2", 2, 2, "Bien2");
		app4.insert4(3, "Naroa3", 3, 3, "Bien3");
		app4.insert4(4, "Naroa4", 4, 4, "Bien4");
		app4.insert4(5, "Naroa5", 5, 5, "Bien5");
		app4.insert4(6, "Naroa6", 6, 6, "Bien6");
		app4.insert4(7, "Naroa7", 7, 7, "Bien7");
		app4.insert4(8, "Naroa8", 8, 8, "Bien8");
		app4.insert4(9, "Naroa9", 9, 9, "Bien9");
		app4.insert4(10, "Naroa10", 10, 10, "Bien10");
		app4.insert4(11, "Naroa11", 11, 11, "Bien11");
		app4.insert4(12, "Naroa12", 12, 12, "Bien12");
		app4.insert4(13, "Naroa13", 13, 13, "Bien13");
		app4.insert4(14, "Naroa14", 14, 14, "Bien14");
		app4.insert4(15, "Naroa15", 15, 15, "Bien15");
		app4.insert4(16, "Naroa16", 16, 16, "Bien16");
		app4.insert4(17, "Naroa17", 17, 17, "Bien17");
		app4.insert4(18, "Naroa18", 18, 18, "Bien18");
		app4.insert4(19, "Naroa19", 19, 19, "Bien19");
		app4.insert4(20, "Naroa20", 20, 20, "Bien20");
		app4.insert4(21, "Naroa21", 21, 21, "Bien21");
		app4.insert4(22, "Naroa22", 22, 22, "Bien22");
		app4.insert4(23, "Naroa23", 23, 23, "Bien23");
		app4.insert4(24, "Naroa24", 24, 24, "Bien24");
		app4.insert4(25, "Naroa25", 25, 25, "Bien25");
		app4.insert4(26, "Naroa26", 26, 26, "Bien26");
		app4.insert4(27, "Naroa27", 27, 27, "Bien27");
		app4.insert4(28, "Naroa28", 28, 28, "Bien28");
		app4.insert4(29, "Naroa29", 29, 29, "Bien29");
		app4.insert4(30, "Naroa30", 30, 30, "Bien30");
		app4.insert4(31, "Irati1", 31, 1, "Perfecto1");
		app4.insert4(32, "Irati2", 32, 2, "Perfecto2");
		app4.insert4(33, "Irati3", 33, 3, "Perfecto3");
		app4.insert4(34, "Irati4", 34, 4, "Perfecto4");
		app4.insert4(35, "Irati5", 35, 5, "Perfecto5");
		app4.insert4(36, "Irati6", 36, 6, "Perfecto6");
		app4.insert4(37, "Irati7", 37, 7, "Perfecto7");
		app4.insert4(38, "Irati8", 38, 8, "Perfecto8");
		app4.insert4(39, "Irati9", 39, 9, "Perfecto9");
		app4.insert4(40, "Irati10", 40, 10, "Perfecto10");
		app4.insert4(41, "Irati11", 41, 11, "Perfecto11");
		app4.insert4(42, "Irati12", 42, 12, "Perfecto12");
		app4.insert4(43, "Irati13", 43, 13, "Perfecto13");
		app4.insert4(44, "Irati14", 44, 14, "Perfecto14");
		app4.insert4(45, "Irati15", 45, 15, "Perfecto15");
		app4.insert4(46, "Irati16", 46, 16, "Perfecto16");
		app4.insert4(47, "Irati17", 47, 17, "Perfecto17");
		app4.insert4(48, "Irati18", 48, 18, "Perfecto18");
		app4.insert4(49, "Irati19", 49, 19, "Perfecto19");
		app4.insert4(50, "Irati20", 50, 20, "Perfecto20");
		app4.insert4(51, "Irati21", 51, 21, "Perfecto21");
		app4.insert4(52, "Irati22", 52, 22, "Perfecto22");
		app4.insert4(53, "Irati23", 53, 23, "Perfecto23");
		app4.insert4(54, "Irati24", 54, 24, "Perfecto24");
		app4.insert4(55, "Irati25", 55, 25, "Perfecto25");
		app4.insert4(56, "Irati26", 56, 26, "Perfecto26");
		app4.insert4(57, "Irati27", 57, 27, "Perfecto27");
		app4.insert4(58, "Irati28", 58, 28, "Perfecto28");
		app4.insert4(59, "Irati29", 59, 29, "Perfecto29");
		app4.insert4(60, "Irati30", 60, 30, "Perfecto30");
		app4.insert4(61, "Ana1", 61, 1, "Mejorable1");
		app4.insert4(62, "Ana2", 62, 2, "Mejorable2");
		app4.insert4(63, "Ana3", 63, 3, "Mejorable3");
		app4.insert4(64, "Ana4", 64, 4, "Mejorable4");
		app4.insert4(65, "Ana5", 65, 5, "Mejorable5");
		app4.insert4(66, "Ana6", 66, 6, "Mejorable6");
		app4.insert4(67, "Ana7", 67, 7, "Mejorable7");
		app4.insert4(68, "Ana8", 68, 8, "Mejorable8");
		app4.insert4(69, "Ana9", 69, 9, "Mejorable9");
		app4.insert4(70, "Ana10", 70, 10, "Mejorable10");
		app4.insert4(71, "Ana11", 71, 11, "Mejorable11");
		app4.insert4(72, "Ana12", 72, 12, "Mejorable12");
		app4.insert4(73, "Ana13", 73, 13, "Mejorable13");
		app4.insert4(74, "Ana14", 74, 14, "Mejorable14");
		app4.insert4(75, "Ana15", 75, 15, "Mejorable15");
		app4.insert4(76, "Ana16", 76, 16, "Mejorable16");
		app4.insert4(77, "Ana17", 77, 17, "Mejorable17");
		app4.insert4(78, "Ana18", 78, 18, "Mejorable18");
		app4.insert4(79, "Ana19", 79, 19, "Mejorable19");
		app4.insert4(80, "Ana20", 80, 20, "Mejorable20");
		app4.insert4(81, "Ana21", 81, 21, "Mejorable21");
		app4.insert4(82, "Ana22", 82, 22, "Mejorable22");
		app4.insert4(83, "Ana23", 83, 23, "Mejorable23");
		app4.insert4(84, "Ana24", 84, 24, "Mejorable24");
		app4.insert4(85, "Ana25", 85, 25, "Mejorable25");
		app4.insert4(86, "Ana26", 86, 26, "Mejorable26");
		app4.insert4(87, "Ana27", 87, 27, "Mejorable27");
		app4.insert4(88, "Ana28", 88, 28, "Mejorable28");
		app4.insert4(89, "Ana29", 89, 29, "Mejorable29");
		app4.insert4(90, "Ana30", 90, 30, "Mejorable30");
		app4.insert4(91, "Jon1", 91, 1, "Mal1");
		app4.insert4(92, "Jon2", 92, 2, "Mal2");
		app4.insert4(93, "Jon3", 93, 3, "Mal3");
		app4.insert4(94, "Jon4", 94, 4, "Mal4");
		app4.insert4(95, "Jon5", 95, 5, "Mal5");
		app4.insert4(96, "Jon6", 96, 6, "Mal6");
		app4.insert4(97, "Jon7", 97, 7, "Mal7");
		app4.insert4(98, "Jon8", 98, 8, "Mal8");
		app4.insert4(99, "Jon9", 99, 9, "Mal9");
		app4.insert4(100, "Jon10", 100, 10, "Mal10");
		app4.insert4(101, "Jon11", 101, 11, "Mal11");
		app4.insert4(102, "Jon12", 102, 12, "Mal12");
		app4.insert4(103, "Jon13", 103, 13, "Mal13");
		app4.insert4(104, "Jon14", 104, 14, "Mal14");
		app4.insert4(105, "Jon15", 105, 15, "Mal15");
		app4.insert4(106, "Jon16", 106, 16, "Mal16");
		app4.insert4(107, "Jon17", 107, 17, "Mal17");
		app4.insert4(108, "Jon18", 108, 18, "Mal18");
		app4.insert4(109, "Jon19", 109, 19, "Mal19");
		app4.insert4(110, "Jon20", 110, 20, "Mal20");
		app4.insert4(111, "Jon21", 111, 21, "Mal21");
		app4.insert4(112, "Jon22", 112, 22, "Mal22");
		app4.insert4(113, "Jon23", 113, 23, "Mal23");
		app4.insert4(114, "Jon24", 114, 24, "Mal24");
		app4.insert4(115, "Jon25", 115, 25, "Mal25");
		app4.insert4(116, "Jon26", 116, 26, "Mal26");
		app4.insert4(117, "Jon27", 117, 27, "Mal27");
		app4.insert4(118, "Jon28", 118, 28, "Mal28");
		app4.insert4(119, "Jon29", 119, 29, "Mal29");
		app4.insert4(120, "Jon30", 120, 30, "Mal30");
	
		/**
		 * Insertar en la tabla administradores
		 */
		
		
		InsertData app5 = new InsertData();
		
		app5.insert5(1,1);
		app5.insert5(2,2);
		app5.insert5(3,3);
		app5.insert5(4,4);
		app5.insert5(5,5);
		app5.insert5(20,6);
		app5.insert5(21,7);
		app5.insert5(22,8);
		app5.insert5(23,9);
		app5.insert5(24,10);
		app5.insert5(25,11);
		app5.insert5(31,12);
		app5.insert5(32,13);
		app5.insert5(33,14);
		app5.insert5(34,15);
		app5.insert5(35,16);
		app5.insert5(50,17);
		app5.insert5(51,18);
		app5.insert5(52,19);
		app5.insert5(53,20);
		app5.insert5(54,21);
		app5.insert5(55,22);
		app5.insert5(61,23);
		app5.insert5(62,24);
		app5.insert5(63,25);
		app5.insert5(64,26);
		app5.insert5(65,27);
		app5.insert5(80,28);
		app5.insert5(81,29);
		app5.insert5(82,30);
		app5.insert5(83,31);
		app5.insert5(84,32);
		app5.insert5(85,33);
		app5.insert5(91,34);
		app5.insert5(92,35);
		app5.insert5(93,36);
		app5.insert5(94,37);
		app5.insert5(95,38);
		app5.insert5(110,39);
		app5.insert5(111,40);
		app5.insert5(112,41);
		app5.insert5(113,42);
		app5.insert5(114,43);
		app5.insert5(115,44);
		
		/**
		 * Insertar en la tabla productos
		 */
		
		InsertData app6 = new InsertData();
		
		app6.insert6(1, 15, "17-11-2020", 30);
		app6.insert6(2, 15, "17-11-2020", 30);
		app6.insert6(3, 15, "17-11-2020", 30);
		app6.insert6(4, 15, "17-11-2020", 30);
		app6.insert6(5, 15, "17-11-2020", 30);
		app6.insert6(6, 15, "17-11-2020", 30);
		app6.insert6(7, 15, "17-11-2020", 30);
		app6.insert6(8, 15, "17-11-2020", 30);
		app6.insert6(9, 15, "17-11-2020", 30);
		app6.insert6(10, 15, "17-11-2020", 30);
		app6.insert6(11, 15, "07-11-2020", 35);
		app6.insert6(12, 15, "07-11-2020", 35);
		app6.insert6(13, 15, "07-11-2020", 35);
		app6.insert6(14, 15, "07-11-2020", 35);
		app6.insert6(15, 15, "07-11-2020", 35);
		app6.insert6(16, 15, "07-11-2020", 35);
		app6.insert6(17, 15, "07-11-2020", 35);
		app6.insert6(18, 15, "07-11-2020", 35);
		app6.insert6(19, 15, "07-11-2020", 35);
		app6.insert6(20, 15, "07-11-2020", 35);
		app6.insert6(21, 25, "07-11-2020", 43);
		app6.insert6(22, 25, "07-11-2020", 43);
		app6.insert6(23, 25, "07-11-2020", 43);
		app6.insert6(24, 25, "07-11-2020", 43);
		app6.insert6(25, 25, "07-11-2020", 43);
		app6.insert6(26, 25, "07-11-2020", 43);
		app6.insert6(27, 25, "07-11-2020", 43);
		app6.insert6(28, 25, "07-11-2020", 43);
		app6.insert6(29, 25, "07-11-2020", 43);
		app6.insert6(30, 25, "07-11-2020", 63);
		app6.insert6(31, 25, "07-11-2020", 63);
		app6.insert6(32, 25, "27-11-2020", 63);
		app6.insert6(33, 25, "27-11-2020", 63);
		app6.insert6(34, 25, "27-11-2020", 63);
		app6.insert6(35, 25, "27-11-2020", 63);
		app6.insert6(35, 25, "27-11-2020", 63);
		app6.insert6(37, 25, "27-11-2020", 63);
		app6.insert6(38, 25, "27-11-2020", 63);
		app6.insert6(39, 25, "27-11-2020", 63);
		app6.insert6(40, 25, "27-11-2020", 63);
		app6.insert6(41, 35, "27-11-2020", 37);
		app6.insert6(42, 35, "27-11-2020", 37);
		app6.insert6(43, 35, "27-11-2020", 37);
		app6.insert6(44, 35, "27-11-2020", 37);
		app6.insert6(45, 35, "27-11-2020", 37);
		app6.insert6(46, 35, "27-11-2020", 37);
		app6.insert6(47, 35, "27-11-2020", 37);
		app6.insert6(48, 35, "27-11-2020", 37);
		app6.insert6(49, 35, "27-11-2020", 37);
		app6.insert6(50, 35, "27-11-2020", 37);
		app6.insert6(51, 35, "27-11-2020", 53);
		app6.insert6(52, 35, "17-01-2020", 53);
		app6.insert6(53, 35, "17-01-2020", 53);
		app6.insert6(54, 35, "17-01-2020", 53);
		app6.insert6(55, 35, "17-01-2020", 53);
		app6.insert6(56, 35, "17-01-2020", 53);
		app6.insert6(57, 35, "17-01-2020", 53);
		app6.insert6(58, 35, "17-01-2020", 53);
		app6.insert6(59, 35, "17-01-2020", 53);
		app6.insert6(60, 45, "17-01-2020", 53);
		app6.insert6(61, 45, "17-01-2020", 23);
		app6.insert6(62, 45, "17-01-2020", 23);
		app6.insert6(63, 45, "17-01-2020", 23);
		app6.insert6(64, 45, "17-01-2020", 23);
		app6.insert6(65, 45, "17-01-2020", 23);
		app6.insert6(66, 45, "17-01-2020", 23);
		app6.insert6(67, 45, "17-01-2020", 23);
		app6.insert6(68, 45, "17-01-2020", 23);
		app6.insert6(69, 45, "17-01-2020", 23);
		app6.insert6(70, 45, "17-01-2020", 23);
		app6.insert6(71, 45, "17-01-2020", 3);
		app6.insert6(72, 45, "17-01-2020", 3);
		app6.insert6(73, 45, "17-01-2020", 3);
		app6.insert6(74, 45, "17-01-2020", 3);
		app6.insert6(75, 45, "17-01-2020", 3);
		app6.insert6(75, 45, "17-01-2020", 3);
		app6.insert6(77, 45, "17-01-2020", 3);
		app6.insert6(78, 45, "17-01-2020", 3);
		app6.insert6(79, 45, "17-01-2020", 3);
		app6.insert6(80, 45, "17-01-2020", 3);
		app6.insert6(81, 55, "17-03-2020", 33);
		app6.insert6(82, 55, "17-03-2020", 33);
		app6.insert6(83, 55, "17-03-2020", 33);
		app6.insert6(84, 55, "17-03-2020", 33);
		app6.insert6(85, 55, "17-03-2020", 33);
		app6.insert6(86, 55, "17-03-2020", 33);
		app6.insert6(87, 55, "17-03-2020", 33);
		app6.insert6(88, 55, "17-03-2020", 33);
		app6.insert6(89, 55, "17-03-2020", 33);
		app6.insert6(90, 55, "17-03-2020", 33);
		app6.insert6(91, 55, "17-03-2020", 40);
		app6.insert6(92, 55, "17-03-2020", 40);
		app6.insert6(93, 55, "17-03-2020", 40);
		app6.insert6(94, 55, "17-03-2020", 40);
		app6.insert6(95, 55, "17-03-2020", 40);
		app6.insert6(96, 55, "17-03-2020", 40);
		app6.insert6(97, 55, "17-03-2020", 40);
		app6.insert6(98, 55, "17-03-2020", 40);
		app6.insert6(99, 55, "17-07-2020", 40);
		app6.insert6(100, 65, "17-07-2020", 40);
		app6.insert6(101, 65, "17-07-2020", 56);
		app6.insert6(102, 65, "17-07-2020", 56);
		app6.insert6(103, 65, "17-07-2020", 56);
		app6.insert6(104, 65, "17-07-2020", 56);
		app6.insert6(105, 65, "17-07-2020", 56);
		app6.insert6(106, 65, "17-07-2020", 56);
		app6.insert6(107, 65, "17-07-2020", 56);
		app6.insert6(108, 65, "17-07-2020", 56);
		app6.insert6(109, 65, "17-07-2020", 56);
		app6.insert6(110, 65, "17-07-2020", 56);
		app6.insert6(111, 65, "17-07-2020", 56);
		app6.insert6(112, 65, "17-07-2020", 56);
		app6.insert6(113, 65, "17-07-2020", 56);
		app6.insert6(114, 65, "17-07-2020", 56);
		app6.insert6(115, 65, "17-07-2020", 56);
		app6.insert6(116, 65, "17-07-2020", 78);
		app6.insert6(117, 65, "17-07-2020", 78);
		app6.insert6(118, 65, "17-07-2020", 78);
		app6.insert6(119, 65, "05-11-2020", 78);
		app6.insert6(120, 65, "05-11-2020", 78);
		app6.insert6(121, 65, "05-11-2020", 78);
		app6.insert6(122, 65, "05-11-2020", 78);
		app6.insert6(123, 65, "05-11-2020", 78);
		app6.insert6(124, 65, "05-11-2020", 78);
		app6.insert6(125, 65, "05-11-2020", 78);
		app6.insert6(126, 65, "05-11-2020", 78);
		app6.insert6(127, 65, "05-11-2020", 78);
		app6.insert6(128, 65, "05-11-2020", 78);
		app6.insert6(129, 65, "05-11-2020", 45);
		app6.insert6(130, 65, "05-11-2020", 45);
		app6.insert6(131, 75, "05-11-2020", 45);
		app6.insert6(132, 75, "05-11-2020", 45);
		app6.insert6(133, 75, "05-11-2020", 45);
		app6.insert6(134, 75, "05-11-2020", 45);
		app6.insert6(135, 75, "05-11-2020", 45);
		app6.insert6(135, 75, "05-11-2020", 45);
		app6.insert6(137, 75, "05-11-2020", 45);
		app6.insert6(138, 75, "05-11-2020", 45);
		app6.insert6(139, 75, "05-11-2020", 45);
		app6.insert6(140, 75, "05-05-2020", 45);
		app6.insert6(141, 75, "05-05-2020", 45);
		app6.insert6(142, 75, "05-05-2020", 45);
		app6.insert6(143, 75, "05-05-2020", 45);
		app6.insert6(144, 75, "05-05-2020", 45);
		app6.insert6(145, 75, "05-05-2020", 45);
		app6.insert6(146, 75, "05-05-2020", 45);
		app6.insert6(147, 75, "05-05-2020", 45);
		app6.insert6(148, 75, "05-05-2020", 10);
		app6.insert6(149, 75, "05-05-2020", 10);
		app6.insert6(150, 75, "05-05-2020", 10);
		app6.insert6(151, 75, "05-05-2020", 10);
		app6.insert6(152, 75, "05-05-2020", 10);
		app6.insert6(153, 75, "05-05-2020", 10);
		app6.insert6(154, 75, "05-05-2020", 10);
		app6.insert6(155, 75, "05-05-2020", 10);
		app6.insert6(156, 75, "05-05-2020", 10);
		app6.insert6(157, 75, "05-05-2020", 10);
		app6.insert6(158, 75, "05-05-2020", 10);
		app6.insert6(159, 75, "05-05-2020", 10);
		app6.insert6(160, 75, "05-05-2020", 10);
		app6.insert6(161, 85, "05-05-2020", 3);
		app6.insert6(162, 85, "17-05-2020", 3);
		app6.insert6(163, 85, "17-05-2020", 3);
		app6.insert6(164, 85, "17-05-2020", 3);
		app6.insert6(165, 85, "17-05-2020", 3);
		app6.insert6(166, 85, "17-05-2020", 3);
		app6.insert6(167, 85, "17-05-2020", 3);
		app6.insert6(168, 85, "17-05-2020", 3);
		app6.insert6(169, 85, "17-05-2020", 3);
		app6.insert6(170, 85, "17-05-2020", 3);
		app6.insert6(171, 85, "17-05-2020", 13);
		app6.insert6(172, 85, "17-05-2020", 13);
		app6.insert6(173, 85, "17-05-2020", 13);
		app6.insert6(174, 85, "17-05-2020", 13);
		app6.insert6(175, 85, "17-05-2020", 13);
		app6.insert6(175, 85, "17-05-2020", 13);
		app6.insert6(177, 85, "17-05-2020", 13);
		app6.insert6(178, 85, "17-05-2020", 13);
		app6.insert6(179, 85, "17-05-2020", 13);
		app6.insert6(180, 85, "13-05-2020", 13);
		app6.insert6(181, 85, "13-05-2020", 13);
		app6.insert6(182, 85, "13-05-2020", 13);
		app6.insert6(183, 85, "13-05-2020", 13);
		app6.insert6(184, 85, "13-05-2020", 13);
		app6.insert6(185, 85, "13-05-2020", 37);
		app6.insert6(186, 85, "13-05-2020", 37);
		app6.insert6(187, 85, "13-05-2020", 37);
		app6.insert6(188, 85, "13-05-2020", 37);
		app6.insert6(189, 85, "13-05-2020", 37);
		app6.insert6(190, 85, "13-05-2020", 37);
		app6.insert6(191, 85, "13-05-2020", 37);
		app6.insert6(192, 85, "13-05-2020", 37);
		app6.insert6(193, 85, "13-05-2020", 37);
		app6.insert6(194, 85, "13-05-2020", 37);
		app6.insert6(195, 85, "13-05-2020", 37);
		app6.insert6(196, 85, "13-05-2020", 37);
		app6.insert6(197, 85, "13-05-2020", 37);
		app6.insert6(198, 85, "13-05-2020", 37);
		app6.insert6(199, 85, "13-05-2020", 37);
		app6.insert6(200, 85, "13-05-2020", 37);
		app6.insert6(201, 65, "17-07-2020", 56);
		app6.insert6(202, 65, "17-07-2020", 56);
		app6.insert6(203, 65, "17-07-2020", 56);
		app6.insert6(204, 65, "17-07-2020", 56);
		app6.insert6(205, 65, "17-07-2020", 56);
		app6.insert6(206, 65, "17-07-2020", 56);
		app6.insert6(207, 65, "17-07-2020", 56);
		app6.insert6(208, 65, "17-07-2020", 56);
		app6.insert6(209, 65, "17-07-2020", 56);
		app6.insert6(210, 65, "17-07-2020", 56);
		app6.insert6(211, 65, "17-07-2020", 56);
		app6.insert6(212, 65, "17-07-2020", 56);
		app6.insert6(213, 65, "17-07-2020", 56);
		app6.insert6(214, 65, "17-07-2020", 56);
		app6.insert6(215, 65, "17-07-2020", 56);
		app6.insert6(216, 65, "17-07-2020", 78);
		app6.insert6(217, 65, "17-07-2020", 78);
		app6.insert6(218, 65, "17-07-2020", 78);
		app6.insert6(219, 65, "05-11-2020", 78);
		app6.insert6(220, 65, "05-11-2020", 78);
		app6.insert6(221, 65, "05-11-2020", 78);
		app6.insert6(222, 65, "05-11-2020", 78);
		app6.insert6(223, 65, "05-11-2020", 78);
		app6.insert6(224, 65, "05-11-2020", 78);
		app6.insert6(225, 65, "05-11-2020", 78);
		app6.insert6(226, 65, "05-11-2020", 78);
		app6.insert6(227, 65, "05-11-2020", 78);
		app6.insert6(228, 65, "05-11-2020", 78);
		app6.insert6(229, 65, "05-11-2020", 45);
		app6.insert6(230, 65, "05-11-2020", 45);
		app6.insert6(231, 75, "05-11-2020", 45);
		app6.insert6(232, 75, "05-11-2020", 45);
		app6.insert6(233, 75, "05-11-2020", 45);
		app6.insert6(234, 75, "05-11-2020", 45);
		app6.insert6(235, 75, "05-11-2020", 45);
		app6.insert6(235, 75, "05-11-2020", 45);
		app6.insert6(237, 75, "05-11-2020", 45);
		app6.insert6(238, 75, "05-11-2020", 45);
		app6.insert6(239, 75, "05-11-2020", 45);
		app6.insert6(240, 75, "05-05-2020", 45);
		app6.insert6(241, 75, "05-05-2020", 45);
		app6.insert6(242, 75, "05-05-2020", 45);
		app6.insert6(243, 75, "05-05-2020", 45);
		app6.insert6(244, 75, "05-05-2020", 45);
		app6.insert6(245, 75, "05-05-2020", 45);
		app6.insert6(246, 75, "05-05-2020", 45);
		app6.insert6(247, 75, "05-05-2020", 45);
		app6.insert6(248, 75, "05-05-2020", 10);
		app6.insert6(249, 75, "05-05-2020", 10);
		app6.insert6(250, 75, "05-05-2020", 10);
		app6.insert6(251, 75, "05-05-2020", 10);
		app6.insert6(252, 75, "05-05-2020", 10);
		app6.insert6(253, 75, "05-05-2020", 10);
		app6.insert6(254, 75, "05-05-2020", 10);
		app6.insert6(255, 75, "05-05-2020", 10);
		app6.insert6(256, 75, "05-05-2020", 10);
		app6.insert6(257, 75, "05-05-2020", 10);
		app6.insert6(258, 75, "05-05-2020", 10);
		app6.insert6(259, 75, "05-05-2020", 10);
		app6.insert6(260, 75, "05-05-2020", 10);
		app6.insert6(261, 85, "05-05-2020", 3);
		app6.insert6(262, 85, "17-05-2020", 3);
		app6.insert6(263, 85, "17-05-2020", 3);
		app6.insert6(264, 85, "17-05-2020", 3);
		app6.insert6(265, 85, "17-05-2020", 3);
		app6.insert6(266, 85, "17-05-2020", 3);
		app6.insert6(267, 85, "17-05-2020", 3);
		app6.insert6(268, 85, "17-05-2020", 3);
		app6.insert6(269, 85, "17-05-2020", 3);
		app6.insert6(270, 85, "17-05-2020", 3);
		app6.insert6(271, 85, "17-05-2020", 13);
		app6.insert6(272, 85, "17-05-2020", 13);
		app6.insert6(273, 85, "17-05-2020", 13);
		app6.insert6(274, 85, "17-05-2020", 13);
		app6.insert6(275, 85, "17-05-2020", 13);
		app6.insert6(275, 85, "17-05-2020", 13);
		app6.insert6(277, 85, "17-05-2020", 13);
		app6.insert6(278, 85, "17-05-2020", 13);
		app6.insert6(279, 85, "17-05-2020", 13);
		app6.insert6(280, 85, "13-05-2020", 13);
		app6.insert6(281, 85, "13-05-2020", 13);
		app6.insert6(282, 85, "13-05-2020", 13);
		app6.insert6(283, 85, "13-05-2020", 13);
		app6.insert6(284, 85, "13-05-2020", 13);
		app6.insert6(285, 85, "13-05-2020", 37);
		app6.insert6(286, 85, "13-05-2020", 37);
		app6.insert6(287, 85, "13-05-2020", 37);
		app6.insert6(288, 85, "13-05-2020", 37);
		app6.insert6(289, 85, "13-05-2020", 37);
		app6.insert6(290, 85, "13-05-2020", 37);
		app6.insert6(291, 85, "13-05-2020", 37);
		app6.insert6(292, 85, "13-05-2020", 37);
		app6.insert6(293, 85, "13-05-2020", 37);
		app6.insert6(294, 85, "13-05-2020", 37);
		app6.insert6(295, 85, "13-05-2020", 37);
		app6.insert6(296, 85, "13-05-2020", 37);
		app6.insert6(297, 85, "13-05-2020", 37);
		app6.insert6(298, 85, "13-05-2020", 37);
		app6.insert6(299, 85, "13-05-2020", 37);
		app6.insert6(300, 85, "13-05-2020", 37);
		app6.insert6(301, 40, "31-05-2020", 6);
		app6.insert6(302, 40, "31-05-2020", 7);
		app6.insert6(303, 50, "11-05-2020", 3);
		app6.insert6(304, 50, "11-05-2020", 4);
		app6.insert6(305, 50, "11-05-2020", 5);
		app6.insert6(306, 50, "11-05-2020", 6);
		app6.insert6(307, 50, "11-05-2020", 7);
		app6.insert6(308, 50, "11-05-2020", 3);
		app6.insert6(309, 50, "11-05-2020", 4);
		app6.insert6(310, 50, "11-05-2020", 5);
		app6.insert6(311, 50, "11-05-2020", 6);
		app6.insert6(312, 50, "11-05-2020", 7);
		app6.insert6(313, 50, "11-05-2020", 3);
		app6.insert6(314, 50, "11-05-2020", 4);
		app6.insert6(315, 50, "11-05-2020", 5);
		app6.insert6(316, 50, "11-05-2020", 6);
		app6.insert6(317, 50, "11-05-2020", 7);
		app6.insert6(318, 50, "11-05-2020", 3);
		app6.insert6(319, 50, "11-05-2020", 4);
		app6.insert6(320, 50, "11-05-2020", 5);
		app6.insert6(321, 50, "11-05-2020", 6);
		app6.insert6(322, 50, "11-05-2020", 7);
		app6.insert6(323, 50, "11-05-2020", 3);
		app6.insert6(324, 50, "11-05-2020", 4);
		app6.insert6(325, 50, "11-05-2020", 5);
		app6.insert6(326, 50, "11-05-2020", 6);
		app6.insert6(327, 50, "11-05-2020", 7);
		app6.insert6(328, 50, "11-05-2020", 3);
		app6.insert6(329, 50, "11-05-2020", 4);
		app6.insert6(330, 50, "11-05-2020", 5);
		app6.insert6(331, 50, "11-05-2020", 6);
		app6.insert6(332, 50, "11-05-2020", 7);
		app6.insert6(333, 50, "11-05-2020", 3);
		app6.insert6(334, 50, "11-05-2020", 4);
		app6.insert6(335, 50, "11-05-2020", 5);
		app6.insert6(336, 50, "11-05-2020", 6);
		app6.insert6(337, 50, "11-05-2020", 7);
		app6.insert6(338, 50, "11-05-2020", 3);
		app6.insert6(339, 50, "11-05-2020", 4);
		app6.insert6(340, 50, "11-05-2020", 5);
		app6.insert6(341, 50, "11-05-2020", 6);
		app6.insert6(342, 50, "11-05-2020", 7);
		app6.insert6(343, 60, "21-05-2020", 3);
		app6.insert6(344, 60, "21-05-2020", 4);
		app6.insert6(345, 60, "21-05-2020", 5);
		app6.insert6(346, 60, "21-05-2020", 6);
		app6.insert6(347, 60, "21-05-2020", 7);
		app6.insert6(348, 60, "21-05-2020", 3);
		app6.insert6(349, 60, "21-05-2020", 4);
		app6.insert6(350, 60, "21-05-2020", 5);
		app6.insert6(351, 60, "21-05-2020", 6);
		app6.insert6(352, 60, "21-05-2020", 7);
		app6.insert6(353, 60, "21-05-2020", 3);
		app6.insert6(354, 60, "21-05-2020", 4);
		app6.insert6(355, 60, "21-05-2020", 5);
		app6.insert6(356, 60, "21-05-2020", 6);
		app6.insert6(357, 60, "21-05-2020", 7);
		app6.insert6(358, 60, "21-05-2020", 3);
		app6.insert6(359, 60, "21-05-2020", 4);
		app6.insert6(360, 60, "21-05-2020", 5);
		app6.insert6(361, 60, "21-05-2020", 6);
		app6.insert6(362, 60, "21-05-2020", 7);
		app6.insert6(363, 60, "21-05-2020", 3);
		app6.insert6(364, 60, "21-05-2020", 4);
		app6.insert6(365, 60, "21-05-2020", 5);
		app6.insert6(366, 60, "21-05-2020", 6);
		app6.insert6(367, 40, "31-05-2020", 7);
		app6.insert6(368, 40, "31-05-2020", 3);
		app6.insert6(369, 40, "31-05-2020", 4);
		app6.insert6(370, 40, "31-05-2020", 5);
		app6.insert6(371, 40, "31-05-2020", 6);
		app6.insert6(372, 40, "31-05-2020", 7);
		app6.insert6(373, 40, "31-05-2020", 3);
		app6.insert6(374, 40, "31-05-2020", 4);
		app6.insert6(375, 40, "31-05-2020", 5);
		app6.insert6(376, 40, "31-05-2020", 6);
		app6.insert6(377, 40, "31-05-2020", 7);
		app6.insert6(378, 40, "31-05-2020", 3);
		app6.insert6(379, 40, "31-05-2020", 4);
		app6.insert6(380, 40, "31-05-2020", 5);
		app6.insert6(381, 40, "31-05-2020", 6);
		app6.insert6(382, 40, "31-05-2020", 7);
		app6.insert6(383, 40, "31-05-2020", 3);
		app6.insert6(384, 40, "31-05-2020", 4);
		app6.insert6(385, 40, "31-05-2020", 5);
		app6.insert6(386, 40, "31-05-2020", 6);
		app6.insert6(387, 40, "31-05-2020", 7);
		app6.insert6(388, 40, "31-05-2020", 3);
		app6.insert6(389, 40, "31-05-2020", 4);
		app6.insert6(390, 40, "31-05-2020", 5);
		app6.insert6(391, 40, "31-05-2020", 6);
		app6.insert6(392, 40, "31-05-2020", 7);
		app6.insert6(393, 40, "31-05-2020", 3);
		app6.insert6(394, 40, "31-05-2020", 4);
		app6.insert6(395, 40, "31-05-2020", 5);
		app6.insert6(396, 40, "31-05-2020", 6);
		app6.insert6(397, 40, "31-05-2020", 7);
		app6.insert6(398, 40, "31-05-2020", 3);
		app6.insert6(399, 40, "31-05-2020", 4);
		app6.insert6(400, 40, "31-05-2020", 5);
		app6.insert6(401, 40, "31-05-2020", 6);
		app6.insert6(402, 40, "31-05-2020", 7);
		app6.insert6(403, 50, "11-05-2020", 3);
		app6.insert6(404, 50, "11-05-2020", 4);
		app6.insert6(405, 50, "11-05-2020", 5);
		app6.insert6(406, 50, "11-05-2020", 6);
		app6.insert6(407, 50, "11-05-2020", 7);
		app6.insert6(408, 50, "11-05-2020", 3);
		app6.insert6(409, 50, "11-05-2020", 4);
		app6.insert6(410, 50, "11-05-2020", 5);
		app6.insert6(411, 50, "11-05-2020", 6);
		app6.insert6(412, 50, "11-05-2020", 7);
		app6.insert6(413, 50, "11-05-2020", 3);
		app6.insert6(414, 50, "11-05-2020", 4);
		app6.insert6(415, 50, "11-05-2020", 5);
		app6.insert6(416, 50, "11-05-2020", 6);
		app6.insert6(417, 50, "11-05-2020", 7);
		app6.insert6(418, 50, "11-05-2020", 3);
		app6.insert6(419, 50, "11-05-2020", 4);
		app6.insert6(420, 50, "11-05-2020", 5);
		app6.insert6(421, 50, "11-05-2020", 6);
		app6.insert6(422, 50, "11-05-2020", 7);
		app6.insert6(423, 50, "11-05-2020", 3);
		app6.insert6(424, 50, "11-05-2020", 4);
		app6.insert6(425, 50, "11-05-2020", 5);
		app6.insert6(426, 50, "11-05-2020", 6);
		app6.insert6(427, 50, "11-05-2020", 7);
		app6.insert6(428, 50, "11-05-2020", 3);
		app6.insert6(429, 50, "11-05-2020", 4);
		app6.insert6(430, 50, "11-05-2020", 5);
		app6.insert6(431, 50, "11-05-2020", 6);
		app6.insert6(432, 50, "11-05-2020", 7);
		app6.insert6(433, 50, "11-05-2020", 3);
		app6.insert6(434, 50, "11-05-2020", 4);
		app6.insert6(435, 50, "11-05-2020", 5);
		app6.insert6(436, 50, "11-05-2020", 6);
		app6.insert6(437, 50, "11-05-2020", 7);
		app6.insert6(438, 50, "11-05-2020", 3);
		app6.insert6(439, 50, "11-05-2020", 4);
		app6.insert6(440, 50, "11-05-2020", 5);
		app6.insert6(441, 50, "11-05-2020", 6);
		app6.insert6(442, 50, "11-05-2020", 7);
		app6.insert6(443, 60, "21-05-2020", 3);
		app6.insert6(444, 60, "21-05-2020", 4);
		app6.insert6(445, 60, "21-05-2020", 5);
		app6.insert6(446, 60, "21-05-2020", 6);
		app6.insert6(447, 60, "21-05-2020", 7);
		app6.insert6(448, 60, "21-05-2020", 3);
		app6.insert6(449, 60, "21-05-2020", 4);
		app6.insert6(450, 60, "21-05-2020", 5);
		app6.insert6(451, 60, "21-05-2020", 6);
		app6.insert6(452, 60, "21-05-2020", 7);
		app6.insert6(453, 60, "21-05-2020", 3);
		app6.insert6(454, 60, "21-05-2020", 4);
		app6.insert6(455, 60, "21-05-2020", 5);
		app6.insert6(456, 60, "21-05-2020", 6);
		app6.insert6(457, 60, "21-05-2020", 7);
		app6.insert6(458, 60, "21-05-2020", 3);
		app6.insert6(459, 60, "21-05-2020", 4);
		app6.insert6(460, 60, "21-05-2020", 5);
		app6.insert6(461, 60, "21-05-2020", 6);
		app6.insert6(462, 60, "21-05-2020", 7);
		app6.insert6(463, 60, "21-05-2020", 3);
		app6.insert6(464, 60, "21-05-2020", 4);
		app6.insert6(465, 60, "21-05-2020", 5);
		app6.insert6(466, 60, "21-05-2020", 6);
		app6.insert6(467, 60, "21-05-2020", 7);
		app6.insert6(468, 60, "21-05-2020", 3);
		app6.insert6(469, 60, "21-05-2020", 4);
		app6.insert6(470, 60, "21-05-2020", 5);
		app6.insert6(471, 60, "21-05-2020", 6);
		app6.insert6(472, 60, "21-05-2020", 7);
		app6.insert6(473, 60, "21-05-2020", 3);
		app6.insert6(474, 60, "21-05-2020", 4);
		app6.insert6(475, 60, "21-05-2020", 5);
		app6.insert6(476, 60, "21-05-2020", 6);
		app6.insert6(477, 60, "21-05-2020", 7);
		app6.insert6(478, 60, "21-05-2020", 3);
		app6.insert6(479, 60, "21-05-2020", 4);
		app6.insert6(480, 60, "21-05-2020", 5);
		app6.insert6(481, 60, "21-05-2020", 6);
		app6.insert6(482, 60, "21-05-2020", 7);
		app6.insert6(483, 65, "21-05-2020", 3);
		app6.insert6(484, 65, "21-05-2020", 4);
		app6.insert6(485, 65, "21-05-2020", 5);
		app6.insert6(486, 65, "21-05-2020", 6);
		app6.insert6(487, 65, "21-05-2020", 7);
		app6.insert6(488, 65, "21-05-2020", 3);
		app6.insert6(489, 65, "21-05-2020", 4);
		app6.insert6(490, 65, "21-05-2020", 5);
		app6.insert6(491, 65, "21-05-2020", 6);
		app6.insert6(492, 65, "21-05-2020", 7);
		app6.insert6(493, 65, "21-05-2020", 3);
		app6.insert6(494, 65, "21-05-2020", 4);
		app6.insert6(495, 65, "21-05-2020", 5);
		app6.insert6(496, 65, "21-05-2020", 6);
		app6.insert6(497, 65, "21-05-2020", 7);
		app6.insert6(498, 65, "21-05-2020", 3);
		app6.insert6(499, 65, "21-05-2020", 4);
		app6.insert6(500, 65, "21-05-2020", 5);
		app6.insert6(501, 65, "21-05-2020", 6);
		app6.insert6(502, 65, "21-05-2020", 7);
		app6.insert6(503, 65, "21-05-2020", 3);
		app6.insert6(504, 65, "21-05-2020", 4);
		app6.insert6(505, 65, "21-05-2020", 5);
		app6.insert6(506, 65, "21-05-2020", 6);
		app6.insert6(507, 65, "21-05-2020", 7);
		app6.insert6(508, 65, "21-05-2020", 3);
		app6.insert6(509, 65, "21-05-2020", 4);
		app6.insert6(510, 65, "21-05-2020", 5);
		app6.insert6(511, 65, "21-05-2020", 6);
		app6.insert6(512, 65, "21-05-2020", 7);
		app6.insert6(513, 65, "21-05-2020", 3);
		app6.insert6(514, 65, "21-05-2020", 4);
		app6.insert6(515, 65, "21-05-2020", 5);
		app6.insert6(516, 65, "21-05-2020", 6);
		app6.insert6(517, 65, "21-05-2020", 7);
		app6.insert6(518, 65, "21-05-2020", 3);
		app6.insert6(519, 65, "21-05-2020", 4);
		app6.insert6(520, 65, "21-05-2020", 5);
		app6.insert6(521, 65, "21-05-2020", 6);
		app6.insert6(522, 65, "21-05-2020", 7);
		app6.insert6(523, 70, "21-09-2020", 3);
		app6.insert6(524, 70, "21-09-2020", 4);
		app6.insert6(525, 70, "21-09-2020", 5);
		app6.insert6(526, 70, "21-09-2020", 6);
		app6.insert6(527, 70, "21-09-2020", 7);
		app6.insert6(528, 70, "21-09-2020", 3);
		app6.insert6(529, 70, "21-09-2020", 4);
		app6.insert6(530, 70, "21-09-2020", 5);
		app6.insert6(531, 70, "21-09-2020", 6);
		app6.insert6(532, 70, "21-09-2020", 7);
		app6.insert6(533, 70, "21-09-2020", 3);
		app6.insert6(534, 70, "21-09-2020", 4);
		app6.insert6(535, 70, "21-09-2020", 5);
		app6.insert6(536, 70, "21-09-2020", 6);
		app6.insert6(537, 70, "21-09-2020", 7);
		app6.insert6(538, 70, "21-09-2020", 3);
		app6.insert6(539, 70, "21-09-2020", 4);
		app6.insert6(540, 70, "21-09-2020", 5);
		app6.insert6(541, 70, "21-09-2020", 6);
		app6.insert6(542, 70, "21-09-2020", 7);
		app6.insert6(543, 70, "21-09-2020", 3);
		app6.insert6(544, 70, "21-09-2020", 4);
		app6.insert6(545, 70, "21-09-2020", 5);
		app6.insert6(546, 70, "21-09-2020", 6);
		app6.insert6(547, 70, "21-09-2020", 7);
		app6.insert6(548, 70, "21-09-2020", 3);
		app6.insert6(549, 70, "21-09-2020", 4);
		app6.insert6(550, 70, "21-09-2020", 5);
		app6.insert6(551, 70, "21-09-2020", 6);
		app6.insert6(552, 70, "21-09-2020", 7);
		app6.insert6(553, 70, "21-09-2020", 3);
		app6.insert6(554, 70, "21-09-2020", 4);
		app6.insert6(555, 70, "21-09-2020", 5);
		app6.insert6(556, 70, "21-09-2020", 6);
		app6.insert6(557, 70, "21-09-2020", 7);
		app6.insert6(558, 70, "21-09-2020", 3);
		app6.insert6(559, 70, "21-09-2020", 4);
		app6.insert6(560, 70, "21-09-2020", 5);
		app6.insert6(561, 70, "21-09-2020", 6);
		app6.insert6(562, 70, "21-09-2020", 7);
		app6.insert6(563, 75, "01-05-2020", 3);
		app6.insert6(564, 75, "01-05-2020", 4);
		app6.insert6(565, 75, "01-05-2020", 5);
		app6.insert6(566, 75, "01-05-2020", 6);
		app6.insert6(567, 75, "01-05-2020", 7);
		app6.insert6(568, 75, "01-05-2020", 3);
		app6.insert6(569, 75, "01-05-2020", 4);
		app6.insert6(570, 75, "01-05-2020", 5);
		app6.insert6(571, 75, "01-05-2020", 6);
		app6.insert6(572, 75, "01-05-2020", 7);
		app6.insert6(573, 75, "01-05-2020", 3);
		app6.insert6(574, 75, "01-05-2020", 4);
		app6.insert6(575, 75, "01-05-2020", 5);
		app6.insert6(576, 75, "01-05-2020", 6);
		app6.insert6(577, 75, "01-05-2020", 7);
		app6.insert6(578, 75, "01-05-2020", 3);
		app6.insert6(579, 75, "01-05-2020", 4);
		app6.insert6(580, 75, "01-05-2020", 5);
		app6.insert6(581, 75, "01-05-2020", 6);
		app6.insert6(582, 75, "01-05-2020", 7);
		app6.insert6(583, 75, "01-05-2020", 3);
		app6.insert6(584, 75, "01-05-2020", 4);
		app6.insert6(585, 75, "01-05-2020", 5);
		app6.insert6(586, 75, "01-05-2020", 6);
		app6.insert6(587, 75, "01-05-2020", 7);
		app6.insert6(588, 75, "01-05-2020", 3);
		app6.insert6(589, 75, "01-05-2020", 4);
		app6.insert6(590, 75, "01-05-2020", 5);
		app6.insert6(591, 75, "01-05-2020", 6);
		app6.insert6(592, 75, "01-05-2020", 7);
		app6.insert6(593, 75, "01-05-2020", 3);
		app6.insert6(594, 75, "01-05-2020", 4);
		app6.insert6(595, 75, "01-05-2020", 5);
		app6.insert6(596, 75, "01-05-2020", 6);
		app6.insert6(597, 75, "01-05-2020", 7);
		app6.insert6(598, 75, "01-05-2020", 3);
		app6.insert6(599, 75, "01-05-2020", 4);
		app6.insert6(600, 75, "01-05-2020", 5);
		app6.insert6(601, 75, "01-05-2020", 6);
		app6.insert6(602, 75, "01-05-2020", 7);
	}
	

}
