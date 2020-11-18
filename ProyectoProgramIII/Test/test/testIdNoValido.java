package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sqlite.InsertarDatosCamisetas;
import utilidades.Producto;
import utilidades.excepciones.IdNoValidaExcepcion;


/**
 * Test de id. El test fucionará si le hacemos fallar cuando el id es diferente 
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class testIdNoValido {
	
	IdNoValidaExcepcion idNovalido;
	
	@Before
	public void inicio(){
		idNovalido=new IdNoValidaExcepcion(null);
	}

	@After
	public void TearDown(){
		idNovalido=null;
	}
	
	@Test
	public void testIdNoValido() {
		assertEquals(
				
	}			

}