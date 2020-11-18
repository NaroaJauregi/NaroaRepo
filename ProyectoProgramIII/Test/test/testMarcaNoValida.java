package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utilidades.excepciones.MarcaCamisetaNoValidaException;
import utilidades.excepciones.MarcaPantalonNoValidaException;
import utilidades.excepciones.MarcaZapatillasNoValidaException;

/**
 * Test de marca. El test fucionará si le hacemos fallar cuando la marca es null.
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class testMarcaNoValida {
	MarcaCamisetaNoValidaException CamisetamarcaNoValida;
	MarcaPantalonNoValidaException PantalonmarcaNoValida;
	MarcaZapatillasNoValidaException ZapatillasMarcaNoValida;
	
	@Before
	public void inicio(){
		CamisetamarcaNoValida=new MarcaCamisetaNoValidaException(null);
		PantalonmarcaNoValida=new MarcaPantalonNoValidaException(null);
		ZapatillasMarcaNoValida=new MarcaZapatillasNoValidaException(null);
		
	}
	
	@After
	public void TearDown (){
		CamisetamarcaNoValida=null;
		PantalonmarcaNoValida=null;
		ZapatillasMarcaNoValida=null;
	}
	

	@Test
	public void testCamisetaMarcaNoValida() {
		assertEquals("adidas",null);
		fail();
		
	}
	
	@Test
	public void testPantalonMarcaNoValida(){
		assertEquals("adidas",null);
		fail();
	}
	
	@Test
	public void testZapatillasMarcaNoValida(){
		assertEquals("adidas",null);
		fail();
	}

	
}
