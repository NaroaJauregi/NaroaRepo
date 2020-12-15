package test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sqlite.CreateDB;

/**
 * Para testear los metodos de la clase CreateDB
 * @author Naroa Jauregi
 *
 */

public class BDTest {
	
	private CreateDB db;
	private Connection conn;

	
	@Before
	public void openConnection() throws SQLException{
		conn=DriverManager.getConnection("jdbc:sqlite:jdbctest.db");
	}
	
	@After
	public void closeConnection() throws SQLException{
		conn.close();
	}
	
	@Test
	public void testGetConection() throws SQLException{
		Assert.assertNotNull(conn);
	}
	
	@Test
	public void testSetAutoCommit() throws SQLException{
		
		/**
		 * Test para comprobar que automaticamente se pone auto-commit
		 */
		Assert.assertTrue(conn.getAutoCommit());
		
		/**
		 * test si apagamos la opcion del auto-commit automatico
		 */
		conn.setAutoCommit(false);
		Assert.assertFalse(conn.getAutoCommit());
		
		/**
		 * Test si estamos en forma no automatica de auto-commit
		 */
		conn.commit();
		Assert.assertFalse(conn.getAutoCommit());
		conn.rollback();
		Assert.assertFalse(conn.getAutoCommit());
		
		/**
		 * Test si volvemos a la forma automatica de auto-commit
		 */
		conn.setAutoCommit(true);
		Assert.assertTrue(conn.getAutoCommit());
	}
	
	
	
/*	@Before
	public void setUp() throws Exception{
		db=new CreateDB();
	}
	
	@After
	public void tearDown() throws Exception{
		db=null;
	}

	@Test
	public void crearBasesDeDatostest() {
		assertTrue(db.crearBaseDeDatosTienda("Tienda.db"));
	}
	*/

}
