package utilidades.excepciones;

/**
 * Excepcion MarcaZapatillasNoValida
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class MarcaZapatillasNoValidaException extends Exception{
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 * @param string
	 */
	
	public MarcaZapatillasNoValidaException(String string){
		super(string);
	}
}
