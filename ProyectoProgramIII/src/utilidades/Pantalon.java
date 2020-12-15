package utilidades;

import java.util.ArrayList;
import java.util.regex.Pattern;

import fecha.FechaNoValidaException;
import utilidades.excepciones.IdNoValidaExcepcion;
import utilidades.excepciones.MarcaPantalonNoValidaException;
import utilidades.excepciones.ModeloPantalonNoValidoException;
import utilidades.excepciones.NombreNoValidoException;
import utilidades.excepciones.NumeroUnidadesNoValidoException;
import utilidades.excepciones.PrecioNoValidoException;

/**
 * pantalon.java
 * 
 * Representa la clase pantalon
 * Hereda de producto (id_preoducto, precio, fecha_recepcion, unidades)
 * <li> marca. La marca del pantalon
 * <li> modelo. El modelo del pantalon
 * <li> talla. La talla del pantalon
 * <li> material_composicion. Varios materiales que componen el pantalon
 * 
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class Pantalon extends Producto{
	private static final long serialVersionUID = 1L;

	/**
	 * patron de la id del pantalon
	 */
	
	private static final Pattern patronId=Pattern.compile("^pa\\d{4}$", Pattern.CASE_INSENSITIVE);
	
	/**
	 * marca pantalon
	 */
	
	private String marca;
	
	/**
	 * modelo pantalon
	 */
	
	private String modelo;
	
	/**
	 * talla pantalon
	 */
	
	private int talla;
	
	/**
	 * composicion pantalon
	 */
	
	private String material_composicion;
	
	/**
	 * Constructor
	 * @param id_producto
	 * @param marca
	 * @param modelo
	 * @param talla
	 * @param material_composicion
	 * @throws IdNoValidaExcepcion
	 * @throws NumeroUnidadesNoValidoException
	 * @throws PrecioNoValidoException
	 * @throws NombreNoValidoException
	 * @throws MarcaPantalonNoValidaException 
	 * @throws ModeloPantalonNoValidoException
	 */
	
	public Pantalon(String id_producto, float precio, fecha.Fecha fecha_recepcion, int unidades, String marca, String modelo, int talla,
			String material_composicion) 
			throws IdNoValidaExcepcion,PrecioNoValidoException, FechaNoValidaException,NumeroUnidadesNoValidoException, MarcaPantalonNoValidaException, ModeloPantalonNoValidoException, NombreNoValidoException{
		super(id_producto, precio, fecha_recepcion, unidades);
		setMarca (marca);
		setModelo (modelo);
		setTalla (talla);
		setComposicion (material_composicion);
	}

	/**
	 * Comprueba que la id cumpla con el patrón 
	 * @param id del producto
	 * @return true si la id sigue el patrón
	 */
		
	private boolean esValidaID (String id_producto){
		return patronId.matcher(id_producto).matches();
	}
	
	/**
	 * Establece la id
	 * @param id_producto
	 * @throws IdNoValidaExcepcion
	 */

	@Override
	protected void setId_producto(String id_producto) throws IdNoValidaExcepcion{
		if(!esValidaID(id_producto))
			throw new IdNoValidaExcepcion("Id no valida");
		super.setId_producto(id_producto.toUpperCase());
	}
	
	/**
	 * Este es un getter que retorna el valor de marca
	 * 
	 * @return marca
	 */
	
	public String getMarca() {
		return marca;
	}
	
	/**
	 * Este es un setter que carga el valor de marca
	 * 
	 * @param marca - nombre de la marca
	 * @throws MarcaPantalonNoValidaException
	 */
	
	public void setMarca(String marca) throws MarcaPantalonNoValidaException{
		if(marca==null)
			throw new MarcaPantalonNoValidaException("Marca incorrecta");
		this.marca = marca;
	}
	
	/**
	 * Este es un getter que retorna el valor de modelo
	 * 
	 * @return modelo
	 */
	
	public String getModelo() {
		return modelo;
	}
	
	/**
	 * Este es un setter que carga el valor de modelo
	 * 
	 * @param modelo - nombre del modelo
	 * @throws ModeloPantalonNoValidoException 
	 */
	
	public void setModelo(String modelo) throws ModeloPantalonNoValidoException {
		if (modelo==null)
			throw new ModeloPantalonNoValidoException("modelo incorrecto");
		this.modelo = modelo;
	}
	
	/**
	 * Este es un getter que retorna el valor de talla
	 * 
	 * @return talla
	 */
	
	public int getTalla() {
		return talla;
	}
	
	/**
	 * Este es un setter que carga el valor de talla
	 * 
	 * @param talla - numero de talla
	 */
	
	public void setTalla(int talla) {
		this.talla = talla;
	}
	
	/**
	 * Este es un getter que retorna el valor de matrial_composicion
	 * 
	 * @return material_composicion
	 */
	
	public String getmaterial_composicion() {
		return material_composicion;
	}
	
	/**
	 * Este es un setter que carga el valor de material_composicion
	 * 
	 * @param material_composicion2 - elementos de los que está compuesto
	 */
	
	public void setComposicion(String material_composicion2) {
		this.material_composicion = material_composicion2;
	}
	
	/**
	 * Calcula el precio del producto (camiseta) dependiendo de la marca
	 *
	 * @return precio del producto con el descuento ya aplicado
	 */
	
	@Override
	
	public float calcularPrecio(){
		float precio=0;
		
		switch (marca){
		
		case "ADIDAS":
			precio=(float)(getPrecio()-(getPrecio()*0.3));
		case "NIKE":
			precio= (float)(getPrecio()-(getPrecio()*0.35));
		case "PUMA":
			precio= (float)(getPrecio()-(getPrecio()*0.2));
		case "JOMA":
			precio= (float)(getPrecio()-(getPrecio()*0.25));
		case "ORBEA":
			precio= (float)(getPrecio()-(getPrecio()*0.4));
		case "ASTORE":
			precio= (float)(getPrecio()-(getPrecio()*0.1));
		}
		return precio;
		
	}
	
	
	
	
	

}
