package utilidades.excepciones;

/**
 * Excepcion MarcaCamisetaNoValida
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class MarcaCamisetaNoValidaException extends Exception{
	private static final long serialVersionUID=1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public MarcaCamisetaNoValidaException (String string){
		super(string);
	}
	
	
}
