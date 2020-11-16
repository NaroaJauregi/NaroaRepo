package fecha;

/**
 * Excepcion FormatoNoValida
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class FormatoNoValidoException extends Exception{
	private static final long serialVersionUID=1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public FormatoNoValidoException (String string){
		super(string);
	}
	
}