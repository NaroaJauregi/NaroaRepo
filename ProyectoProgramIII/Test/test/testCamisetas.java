package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utilidades.Camiseta;
import utilidades.excepciones.MarcaCamisetaNoValidaException;

public class testCamisetas {

	private Camiseta camisetas;
	
	@Before
	public void setUp() throws Exception{
		camisetas=new Camiseta("ADIDAS", 0, null, 0, null, null, 0, null);
	}
	
	@After
	public void tearDown() throws Exception {
		camisetas=null;
	}
	
	@Test
	public void getMarcaCamisetaTest() {
		assertEquals("ADIDAS", camisetas.getMarca());
	}
	
	@Test
	public void setMarcaCamisetaTest() throws MarcaCamisetaNoValidaException{
		camisetas.setMarca("TERNUA");
		assertEquals("TERNUA",camisetas.getMarca());
	}

}
