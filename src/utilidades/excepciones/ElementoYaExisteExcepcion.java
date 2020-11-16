package utilidades.excepciones;

/**
 * Excepcion ElementoYaExiste
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class ElementoYaExisteExcepcion extends Exception {
	private static final long serialVersionUID=1L;

	/**
	 * Constructor
	 * @param string
	 */
	
	public ElementoYaExisteExcepcion (String string){
		super(string);
	}
	
}
