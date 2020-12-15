package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utilidades.Camiseta;
import utilidades.Pantalon;
import utilidades.Zapatillas;
import utilidades.excepciones.IdNoValidaExcepcion;
import utilidades.excepciones.ModeloCamisetaNoValidoException;
import utilidades.excepciones.PrecioNoValidoException;

/**
 * Para testear los metodos de la clase Camiseta
 * @author Naroa Jauregi
 *
 */


public class testProducto {

	private Camiseta camiseta;

	
	@Before
	public void setUp() throws Exception{
		camiseta=new Camiseta("1", "ADIDAS", "CORTO", "S", "algodon");
	}
	
	@After
	public void tearDown() throws Exception{
		camiseta=null;
	}
	
	@Test
	public void getPrecioTest(){
		assertEquals(30, camiseta.getPrecio());
	}
	
	@Test
	public void setPrecioTest() throws PrecioNoValidoException {
		camiseta.setPrecio(30);
		assertEquals(30,camiseta.getPrecio());
	}
	
	@Test
	public void getTallaTest(){
		assertEquals("S", camiseta.getTalla());
	}
	
	@Test
	public void setTallaTest() {
		camiseta.setTalla("S");
		assertEquals("S",camiseta.getTalla());
	}
	
	@Test
	public void getModeloTest(){
		assertEquals("CORTO", camiseta.getModelo());
	}
		
	@Test
	public void setModeloTest() throws ModeloCamisetaNoValidoException {
		camiseta.setModelo("CORTO");
		assertEquals("CORTO",camiseta.getModelo());
	}
	
	@Test
	public void getMarcaTest(){
		assertEquals("ADIDAS", camiseta.getMarca());
	}
	
	@Test
	public void setMarcaTest() {
		camiseta.setTalla("ADIDAS");
		assertEquals("ADIDAS",camiseta.getMarca());
	}
		
	}


