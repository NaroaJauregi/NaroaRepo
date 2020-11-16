package utilidades.excepciones;

/**
 * Excepcion MarcaPantalonNoValida
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class MarcaPantalonNoValidaException extends Exception{
	private static final long serialVersionUID=1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public MarcaPantalonNoValidaException (String string){
		super(string);
	}

}
