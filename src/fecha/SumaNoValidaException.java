package fecha;
/**
 * Excepcion SumaNoValida
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class SumaNoValidaException extends Exception{
	private static final long serialVersionUID=1L;
	
	/**
	 * Constructor
	 * @param string
	 */
	
	public SumaNoValidaException (String string){
		super(string);
	}
	
}