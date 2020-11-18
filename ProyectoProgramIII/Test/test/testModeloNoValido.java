package test;

import static org.junit.Assert.*;

import org.junit.Test;

import utilidades.excepciones.ModeloCamisetaNoValidoException;
import utilidades.excepciones.ModeloPantalonNoValidoException;
import utilidades.excepciones.ModeloZapatillasNoValidoException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * Test de marca. El test fucionará si le hacemos fallar cuando el modelo es null.
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class testModeloNoValido {
	ModeloCamisetaNoValidoException CamisetaModeloNoValido;
	ModeloPantalonNoValidoException PantalonModeloNoValido;
	ModeloZapatillasNoValidoException ZapatillasModeloNoValido;
	
	@Before
	public void inicio(){
		CamisetaModeloNoValido=new ModeloCamisetaNoValidoException(null);
		PantalonModeloNoValido=new ModeloPantalonNoValidoException(null);
		ZapatillasModeloNoValido=new ModeloZapatillasNoValidoException(null);
		
	}
	
	@After
	public void TearDown (){
		CamisetaModeloNoValido=null;
		PantalonModeloNoValido=null;
		ZapatillasModeloNoValido=null;
	}
	

	@Test
	public void testCamisetaModeloNoValida() {
		assertEquals("corto",null);
		fail();
		
	}
	
	@Test
	public void testPantalonModeloNoValida(){
		assertEquals("corto",null);
		fail();
	}
	
	@Test
	public void testZapatillasModeloNoValida(){
		assertEquals("running",null);
		fail();
	}

	
}
