package utilidades;

/**
 * administrador.java
 * 
 * Representa la clase administrador
 * Hereda de usuario
 * 
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class Administrador extends Usuario  {
	
	private int id_administrador;
	
	/**
	 * Este es un getter que retorna el valor de id_administrados
	 * 
	 * @return id_administrador
	 */

	public int getId_administrador() {
		return id_administrador;
	}
	
	/**
	 * Este es un setter que carga el valor de id_administrador
	 * 
	 * @param id_administrador - numero de identificacion del administrador
	 */

	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
	}
	
	

}
