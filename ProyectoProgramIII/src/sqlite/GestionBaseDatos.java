package sqlite;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

import utilidades.Administrador;
import utilidades.Camiseta;
import utilidades.Pantalon;
import utilidades.Producto;
import utilidades.Usuario;
import utilidades.Zapatillas;

/**
 * 
 * @author Naroa_Jauregi
 * 
 * Clase que gestiona toda la sqlite
 */

public class GestionBaseDatos {
	
	private String nombreFichero;
	private String url="jdbc:sqlite:" +nombreFichero;
	private Connection conn;
	private SimpleDateFormat formatoFec;
	private ArrayList <Administrador> administradores;
	private ArrayList<Camiseta> camisetas;
	private ArrayList<Pantalon> pantalones;
	private ArrayList<Zapatillas> zapatillas;
	private ArrayList<Producto> productos;
		

	/**
	 * Constructor
	 */
	
	public GestionBaseDatos (String nombreFichero){
		this.nombreFichero=nombreFichero;
		this.url="jdbc:sqlite:" + nombreFichero;
		this.conn=null;
		this.administradores=new ArrayList<Administrador>();
		this.camisetas=new ArrayList<Camiseta>();
		this.pantalones=new ArrayList<Pantalon>();
		this.zapatillas=new ArrayList<Zapatillas>();
		this.productos=new ArrayList<Producto>();	
	}


	public String getNombreFichero() {
		return nombreFichero;
	}


	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Connection getConn() {
		return conn;
	}


	public void setConn(Connection conn) {
		this.conn = conn;
	}


	public SimpleDateFormat getFormatoFec() {
		return formatoFec;
	}


	public void setFormatoFec(SimpleDateFormat formatoFec) {
		this.formatoFec = formatoFec;
	}


	public ArrayList<Administrador> getAdministradores() {
		return administradores;
	}


	public void setAdministradores(ArrayList<Administrador> administradores) {
		this.administradores = administradores;
	}


	public ArrayList<Camiseta> getCamisetas() {
		return camisetas;
	}


	public void setCamisetas(ArrayList<Camiseta> camisetas) {
		this.camisetas = camisetas;
	}


	public ArrayList<Pantalon> getPantalones() {
		return pantalones;
	}


	public void setPantalones(ArrayList<Pantalon> pantalones) {
		this.pantalones = pantalones;
	}


	public ArrayList<Zapatillas> getZapatillas() {
		return zapatillas;
	}


	public void setZapatillas(ArrayList<Zapatillas> zapatillas) {
		this.zapatillas = zapatillas;
	}


	public ArrayList<Producto> getProductos() {
		return productos;
	}


	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public void establecerConection(){
		try{
			conn=DriverManager.getConnection(url);
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public void createBaseDatos(){
		establecerConection();
		
		if (conn!=null){
			DatabaseMetaData meta=null;
			try{
				meta = conn.getMetaData();
			}catch (SQLException e){
				e.printStackTrace();
			}
			try{
				System.out.println("El nombre del driver es: "+meta.getDriverName());
			}catch (SQLException e) {
				e.printStackTrace();
			}
		System.out.println("Se ha creado la nueva base de datos");
		cerrarConection (conn);
		
		}	
	}
	
	public void createTable (String sql){
		establecerConection();
		Statement stmt=null;
		try{
			stmt=conn.createStatement();
		}catch (SQLException e1){
			e1.printStackTrace();
		}
		
		try{
			stmt.execute(sql);
		}catch (SQLException e){
			e.printStackTrace();
		}
		cerrarConection (conn);
		System.out.println("La accion se ha ejecutado en la tabla");
	}
	
	
	public void insertarDatosCamiseta(int id_producto, String marca, String modelo, String talla, String material_composicion){
		establecerConection();
		PreparedStatement pstmt=null;
		
		String sql="INSERT INTO Camisetas (id_producto, marca, modelo, talla, material_composicion) VALUES (?,?,?,?,?)";
		
		try{
			pstmt =conn.prepareStatement(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		try{
			pstmt.setInt (1, id_producto);
			pstmt.setString (2, marca);
			pstmt.setString (3, modelo);
			pstmt.setString(4, talla);
			pstmt.setString (5, material_composicion);
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		cerrarConection (conn);
		System.out.println("La accion se ha ejecutado en la tabla camisetas");
	}
	
	public void insertarDatosPantalones(int id_producto, String marca, String modelo, String talla, String material_composicion){
		establecerConection();
		PreparedStatement pstmt=null;
		
		String sql="INSERT INTO Pantalones (id_producto, marca, modelo, talla, material_composicion) VALUES (?,?,?,?,?)";
		
		try{
			pstmt =conn.prepareStatement(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		try{
			pstmt.setInt (1, id_producto);
			pstmt.setString (2, marca);
			pstmt.setString (3, modelo);
			pstmt.setString(4, talla);
			pstmt.setString (5, material_composicion);
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		cerrarConection (conn);
		System.out.println("La accion se ha ejecutado en la tabla pantalones");
	}
	
	public void insertarDatosZapatillas(int id_producto, String marca, String modelo, int talla){
		establecerConection();
		PreparedStatement pstmt=null;
		
		String sql="INSERT INTO Zapatillas (id_producto, marca, modelo, talla) VALUES (?,?,?,?)";
		
		try{
			pstmt =conn.prepareStatement(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		try{
			pstmt.setInt (1, id_producto);
			pstmt.setString (2, marca);
			pstmt.setString (3, modelo);
			pstmt.setInt(4, talla);
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		cerrarConection (conn);
		System.out.println("La accion se ha ejecutado en la tabla zapatillas");
	}
	
	public void insertarDatosUsuarios(int id_usuario, String nombre, int id_compra_realizada, int numero_comentario, String contenido_comentario){
		establecerConection();
		PreparedStatement pstmt=null;
		
		String sql="INSERT INTO Usuarios (id_usuario, nombre, id_compra_realizada, numero_comentario,contenido_comentario) VALUES (?,?,?,?,?)";
		
		try{
			pstmt =conn.prepareStatement(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		try{
			pstmt.setInt (1, id_usuario);
			pstmt.setString(2, nombre);
			pstmt.setInt(3, id_compra_realizada);
			pstmt.setInt(4, numero_comentario);
			pstmt.setString(5, contenido_comentario);
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		cerrarConection (conn);
		System.out.println("La accion se ha ejecutado en la tabla usuarios");
	}
	
	public void insertarDatosAdministradores(int id_usuario, int id_administrador){
		establecerConection();
		PreparedStatement pstmt=null;
		
		String sql="INSERT INTO Administradores (id_usuario, id_administrador) VALUES (?,?)";
		
		try{
			pstmt =conn.prepareStatement(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		try{
			pstmt.setInt (1, id_usuario);
			pstmt.setInt(2, id_administrador);
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		cerrarConection (conn);
		System.out.println("La accion se ha ejecutado en la tabla administradores");
	}
	
	public void insertarDatosProductos(int id_producto, float precio, String fecha_recepcion, int unidades){
		establecerConection();
		PreparedStatement pstmt=null;
		
		String sql="INSERT INTO Productos (id_producto, precio, fecha_recepcion, unidades) VALUES (?,?,?,?)";
		
		try{
			pstmt =conn.prepareStatement(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		try{
			pstmt.setInt (1, id_producto);
			pstmt.setFloat(2, precio);
			pstmt.setString(3, fecha_recepcion);
			pstmt.setInt(4, unidades);
			pstmt.executeUpdate();
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		cerrarConection (conn);
		System.out.println("La accion se ha ejecutado en la tabla productos");
	}
	
	 public java.util.Date string2Date (String formato, String fecha){
			
		 this.formatoFec = new SimpleDateFormat(formato);

		 try {
			return this.formatoFec.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	 }
	
		public void cerrarConection(Connection conn) {
			 if(conn!=null) {
				 try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }
		
		public static void main (String [ ] args) {
			
			GestionBaseDatos gbd1=new GestionBaseDatos("Tienda.db");
	
	
	
	 }
}
