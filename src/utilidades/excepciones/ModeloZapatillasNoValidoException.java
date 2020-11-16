package utilidades.excepciones;

/**
 * Excepcion ModeloZapatillasNoValido
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class ModeloZapatillasNoValidoException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public ModeloZapatillasNoValidoException (String string){
		super(string);
	}
}
