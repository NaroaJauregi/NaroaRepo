package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utilidades.excepciones.PrecioNoValidoException;

/**
 * Test de precio. El test fucionará si le hacemos fallar cuando el precio es menor que 0.
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class testPrecioNoValido {
	
	PrecioNoValidoException precioNovalido;
	
	@Before
	public void inicio(){
		precioNovalido=new PrecioNoValidoException(null);
	}

	@After
	public void TearDown(){
		precioNovalido=null;
	}
	
	@Test
	public void testPrecioNoValido() {
		assertEquals(5,-5);
		fail();
	}

}
