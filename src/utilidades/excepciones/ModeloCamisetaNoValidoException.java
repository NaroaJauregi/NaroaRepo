package utilidades.excepciones;

/**
 * Excepcion ModeloCamisetaNoValido
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class ModeloCamisetaNoValidoException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public ModeloCamisetaNoValidoException (String string){
		super(string);
	}
}
