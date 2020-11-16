package utilidades.excepciones;

/**
 * Excepcion PrecioNoValido
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class PrecioNoValidoException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public PrecioNoValidoException (String string){
		super(string);
	}
}

