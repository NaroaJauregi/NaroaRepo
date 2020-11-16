package utilidades.excepciones;

/**
 * Excepcion idNoValida
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class IdNoValidaExcepcion extends Exception{
	private static final long  serialVersionUID=1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public IdNoValidaExcepcion (String string){
		super(string);
	}

}
