package utilidades.excepciones;

/**
 * Excepcion ElementoNoExiste
 * @author Neroa_Jauregi
 * @version 1.0
 *
 */

public class ElementoNoExisteExcepcion extends Exception{
	private static final long serialVersionUID=1L;

	/**
	 * Constructor
	 * @param string 
	 */
	
	public ElementoNoExisteExcepcion (String string){
		super(string);
	}
	
}
