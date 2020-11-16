package utilidades.excepciones;

/**
 * Excepcion NombreNoValido
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class NombreNoValidoException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public NombreNoValidoException (String string){
		super(string);
	}
}

