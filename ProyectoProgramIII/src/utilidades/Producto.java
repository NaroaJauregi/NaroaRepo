package utilidades;

import fecha.Fecha;
import utilidades.excepciones.IdNoValidaExcepcion;
import utilidades.excepciones.NombreNoValidoException;
import utilidades.excepciones.NumeroUnidadesNoValidoException;
import utilidades.excepciones.PrecioNoValidoException;


/**
 * producto.java
 * 
 * Representa la clase producto.
 * Un producto se compone de:
 * <ul>
 * <li> id_producto. Identificador numerico del producto
 * <li> precio. Precio del producto
 * <li> fecha_recepcion. Fecha en el que se recibio el producto
 * <li> unidades. Numero de unidades de ese producto
 * 
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public abstract class Producto implements I_Descuento{
	
	/**
	 * identificador numerico del producto
	 */
	private String id_producto;
	
	/**
	 * precio del producto
	 */
	
	private float precio;
	
	/**
	 * fecha de recepcion del producto
	 */
	
	private Fecha fecha_recepcion;
	
	/**
	 * numero de unidades del producto
	 */
	
	private int unidades;
	
	/**
	 * constructor que recibe el identificador del prducto
	 * @param id_producto
	 * @throws IdNoValidaException id no valida
	 */
	
	public Producto(String id_producto) throws IdNoValidaExcepcion {
		super();
		setId_producto(id_producto);	
	}
	
	/**
	 * constructor que recibe el identificador, el precio, la fecha de recepcion y las unidades
	 * @param id_producto 
	 * @param precio
	 * @param fecha_recepcion
	 * @param unidades
	 */

	public Producto(String id_producto, float precio, Fecha fecha_recepcion, int unidades) throws
			IdNoValidaExcepcion, NumeroUnidadesNoValidoException, PrecioNoValidoException, 
			NombreNoValidoException{
		super();
		setId_producto(id_producto);
		setPrecio(precio);
		setFecha_recepcion(new Fecha());
		setUnidades(unidades);
	}


	/**
	 * Este es un getter que retorna el valor de id_producto
	 * 
	 * @return id_producto
	 */
	
	public String getId_producto() {
		return id_producto;
	}
	
	/**
	 * Este es un setter que carga el valor de id_producto
	 * 
	 * @param id_producto2 - numero de identificacion de producto
	 */
	
	protected void setId_producto(String id_producto) throws IdNoValidaExcepcion {
		this.id_producto = id_producto;
	}
	
	/**
	 * Este es un getter que retorna el valor de precio
	 * 
	 * @return precio
	 */
	
	public float getPrecio() {
		return precio;
	}
	
	/**
	 * Este es un setter que carga el valor de precio
	 * 
	 * @param precio - el precio del producto
	 */
	
	public void setPrecio(float precio) throws PrecioNoValidoException {
		if(precio<=0)
			throw new PrecioNoValidoException ("El precio tiene que ser mayor que 0");
		this.precio = precio;
	}
	
	/**
	 * Este es un getter que retorna el valor de fecha_recepcion
	 * 
	 * @return fecha_recepcion
	 */
	
	public Fecha getFecha_recepcion() {
		return fecha_recepcion;
	}
	
	/**
	 * Este es un setter que carga el valor de fecha_recepcion
	 * 
	 * @param fecha_recepcion - fecha en el que hemos recibido el producto
	 */
	
	public void setFecha_recepcion(Fecha fecha_recepcion) {
		this.fecha_recepcion = fecha_recepcion;
	}
	
	/**
	 * Este es un getter que retorna el valor de unidades
	 * 
	 * @return unidades
	 */
	
	public int getUnidades() {
		return unidades;
	}
	
	/**
	 * Este es un setter que carga el valor de unidades
	 * 
	 * @param unidades - numero de unidades que tenemos disponibles
	 */
	
	public void setUnidades(int unidades)throws NumeroUnidadesNoValidoException {
		if(unidades<0)
			throw new NumeroUnidadesNoValidoException ("Laas unidades tienen que ser mas que 0");
		this.unidades = unidades;
	}

	/**
	 * Metodo que calculara el precio una vez aplicado el descuento
	 * @return precio
	 */
	
	@Override 
	public abstract float calcularPrecio();
	

}
