package utilidades;

import java.util.ArrayList;
import java.util.regex.Pattern;

import fecha.FechaNoValidaException;
import utilidades.excepciones.IdNoValidaExcepcion;
import utilidades.excepciones.MarcaCamisetaNoValidaException;
import utilidades.excepciones.MarcaPantalonNoValidaException;
import utilidades.excepciones.ModeloCamisetaNoValidoException;
import utilidades.excepciones.ModeloPantalonNoValidoException;
import utilidades.excepciones.NombreNoValidoException;
import utilidades.excepciones.NumeroUnidadesNoValidoException;
import utilidades.excepciones.PrecioNoValidoException;

/**
 * camiseta.java
 * 
 * Representa la clase camiseta
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

public class Camiseta extends Producto {
	
	private static final long serialVersionUID = 1L;

	/**
	 * patron de la id de la camiseta
	 */
	
	private static final Pattern patronId=Pattern.compile("^ca\\d{4}$", Pattern.CASE_INSENSITIVE);
	
	/**
	 * marca camiseta
	 */
	
	private String marca;
	
	/**
	 * modelo camiseta
	 */
	
	private String modelo;
	
	/**
	 * talla camiseta
	 */
	
	private String talla;
	
	/**
	 * composicion camiseta
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
	 * @throws ModeloCamisetaNoValidoException
	 */
	
	public Camiseta(String id_producto, float precio, fecha.Fecha fecha_recepcion, int unidades, String marca, String modelo, String talla,
			String material_composicion) 
			throws IdNoValidaExcepcion,PrecioNoValidoException, FechaNoValidaException,NumeroUnidadesNoValidoException, MarcaCamisetaNoValidaException, ModeloCamisetaNoValidoException, NombreNoValidoException{
		super(id_producto, precio, fecha_recepcion, unidades);
		setMarca (marca);
		setModelo (modelo);
		setTalla (talla);
		setComposicion (material_composicion);
	}
	
	/**
	 * Comprueba que la id cumpla con el patr�n 
	 * @param id del producto
	 * @return true si la id sigue el patr�n
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
	 * @throws MarcaCamisetaNoValidaException 
	 */
	
	public void setMarca(String marca) throws MarcaCamisetaNoValidaException {
		if(marca==null)
			throw new MarcaCamisetaNoValidaException ("marca incorrecta");
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
	 * @throws ModeloCamisetaNoValidoException 
	 */
	
	public void setModelo(String modelo) throws ModeloCamisetaNoValidoException {
		if (modelo==null)
			throw new ModeloCamisetaNoValidoException("modelo incorrecto");
		this.modelo = modelo;
	}
	
	/**
	 * Este es un getter que retorna el valor de talla
	 * 
	 * @return talla
	 */
	
	public String getTalla() {
		return talla;
	}
	
	/**
	 * Este es un setter que carga el valor de talla
	 * 
	 * @param string - numero de talla
	 */
	
	public void setTalla(String string) {
		this.talla = string;
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
	 * @param material_composicion2 - elementos de los que est� compuesto
	 */
	
	public void setComposicion(String material_composicion2) {
		this.material_composicion = material_composicion2;
	}
	
	
	
	
	public Camiseta(String id_producto, String marca, String modelo, String talla, String material_composicion)
			throws IdNoValidaExcepcion {
		super(id_producto);
		this.marca = marca;
		this.modelo = modelo;
		this.talla = talla;
		this.material_composicion = material_composicion;
	}
	
	

	public Camiseta(String id_producto) throws IdNoValidaExcepcion {
		super(id_producto);
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
			precio= (float)(getPrecio()-(getPrecio()*0.3));
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
	
	
	


