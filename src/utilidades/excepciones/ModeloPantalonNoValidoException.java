package utilidades.excepciones;

/**
 * Excepcion ModeloPantalonNoValido
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class ModeloPantalonNoValidoException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public ModeloPantalonNoValidoException (String string){
		super(string);
	}
}
