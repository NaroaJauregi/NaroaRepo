package fecha;

/**
 * Excepcion FechaNoValida
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class FechaNoValidaException extends Exception{
	private static final long serialVersionUID=1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public FechaNoValidaException (String string){
		super(string);
	}
	
}
