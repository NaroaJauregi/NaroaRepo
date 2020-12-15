package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import utilidades.Administrador;

/**
 * Para testear los metodos de la clase Administrador
 * @author Naroa Jauregi
 *
 */

public class testAdministrador {

	
	private Administrador admin;
	
	
	@Before
	public void setUp() throws Exception{
		admin=new Administrador();
	}
	
	@After
	public void tearDown() throws Exception{
		admin=null;
	}
					
	
/**
 * Test de getId_administrador, clase Administrador
 */
	
	@Test
	public void GetId_administrador (){
		assertEquals(1, admin.getId_administrador());
	}
	
/**
 * Test de setId_administrador, clase Administrador
*/
		
	@Test
	public void SetId_administrador() {
		admin.setId_administrador(1);
		assertEquals(1, admin.getId_administrador());
		
	}
}
