package utilidades.excepciones;

/**
 * Excepcion NumeroUnidadesNoValido
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class NumeroUnidadesNoValidoException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public NumeroUnidadesNoValidoException (String string){
		super(string);
	}
}
