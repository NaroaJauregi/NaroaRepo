package utilidades;

/**
 * usuario.java
 * 
 * Representa la clase usuario
 * 
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class usuario {
	
	private int id_usuario;
	private String nombre;
	private int id_compra_realizada;
	private int numero_comentario;
	private String contenido_comentario;
	
	/**
	 * Este es un getter que retorna el valor de id_usuario
	 * 
	 * @return id_usuario
	 */
	
	public int getId_usuario() {
		return id_usuario;
	}
	
	/**
	 * Este es un setter que carga el valor de id_usuario
	 * 
	 * @param id_usuario - numero de identificacion de usuario
	 */
	
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	/**
	 * Este es un getter que retorna el valor de nombre
	 * 
	 * @return nombre
	 */
	
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Este es un setter que carga el valor de nombre
	 * 
	 * @param nombre - nombre del usuario
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Este es un getter que retorna el valor id_compra_realizada
	 * 
	 * @return id_compra_realizada
	 */
	
	public int getId_compra_realizada() {
		return id_compra_realizada;
	}
	
	/**
	 * Este es un setter que carga el valor de id_compra_realizada
	 * 
	 * @param id_compra_realizada - numero de identificacion de la compra realizada
	 */
	
	public void setId_compra_realizada(int id_compra_realizada) {
		this.id_compra_realizada = id_compra_realizada;
	}
	
	/**
	 * Este es un getter que retorna el valor de numero_comentario
	 * 
	 * @return numero_comentario
	 */
	
	public int getNumero_comentario() {
		return numero_comentario;
	}
	
	/**
	 * Este es un setter que carga el valor de numero_comentario
	 * 
	 * @param numero_comentario - numero identificativo del comentario realizado
	 */
	
	public void setNumero_comentario(int numero_comentario) {
		this.numero_comentario = numero_comentario;
	}
	
	/**
	 * Este es un getter que retorna el valor de contenido_comentario
	 * 
	 * @return contenido_comentario
	 */
	
	public String getContenido_comentario() {
		return contenido_comentario;
	}
	
	/**
	 * Este es un setter que carga el valor de contenido_comentario
	 * 
	 * @param contenido_comentario - contenido del comentario realizado por el usuario
	 */
	
	public void setContenido_comentario(String contenido_comentario) {
		this.contenido_comentario = contenido_comentario;
	}
	

}
