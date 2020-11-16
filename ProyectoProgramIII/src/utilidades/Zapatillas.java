package utilidades;

import java.util.ArrayList;
import java.util.regex.Pattern;

import fecha.FechaNoValidaException;
import utilidades.excepciones.IdNoValidaExcepcion;
import utilidades.excepciones.MarcaCamisetaNoValidaException;
import utilidades.excepciones.MarcaZapatillasNoValidaException;
import utilidades.excepciones.ModeloCamisetaNoValidoException;
import utilidades.excepciones.ModeloZapatillasNoValidoException;
import utilidades.excepciones.NombreNoValidoException;
import utilidades.excepciones.NumeroUnidadesNoValidoException;
import utilidades.excepciones.PrecioNoValidoException;

/**
 * zapatillas.java
 * 
 * Representa la clase zapatillas
 * Hereda de producto (id_preoducto, precio, fecha_recepcion, unidades)
 * <li> marca. La marca del pantalon
 * <li> modelo. El modelo del pantalon
 * <li> talla. La talla del pantalon
 * 
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */


public class Zapatillas extends Producto implements I_DevolucionZapatillas{
	
	private static final long serialVersionUID = 1L;

	/**
	 * patron de la id de las zapatillas
	 */
	
	private static final Pattern patronId=Pattern.compile("^za\\d{4}$", Pattern.CASE_INSENSITIVE);
	
	/**
	 * marca zapatillas
	 */
	
	private String marca;
	
	/**
	 * talla zapatillas
	 */
	
	private int talla;
	
	/**
	 * modelo zapatillas
	 */
	
	private String modelo;
	
	/**
	 * Constructor
	 * @param id_producto
	 * @param marca
	 * @param modelo
	 * @param talla
	 * @throws IdNoValidaExcepcion
	 * @throws NumeroUnidadesNoValidoException
	 * @throws PrecioNoValidoException
	 * @throws NombreNoValidoException
	 * @throws ModeloZapatillasNoValidoException
	 * @throws MarcaZapatillasNoValidaException
	 */
	
	public Zapatillas(String id_producto, float precio, fecha.Fecha fecha_recepcion, int unidades, String marca, String modelo, int talla) 
			throws IdNoValidaExcepcion,PrecioNoValidoException, FechaNoValidaException,NumeroUnidadesNoValidoException, MarcaZapatillasNoValidaException, ModeloZapatillasNoValidoException, NombreNoValidoException{
		super(id_producto, precio, fecha_recepcion, unidades);
		setMarca (marca);
		setModelo (modelo);
		setTalla (talla);
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
	 * @throws MarcaZapatillasNoValidaException
	 */
	
	public void setMarca(String marca) throws MarcaZapatillasNoValidaException {
		if (marca==null)
			throw new MarcaZapatillasNoValidaException("marca incorrecta");
		this.marca = marca;
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
	 * @throws ModeloZapatillasNoValidoException
	 */
	
	public void setModelo(String modelo) throws ModeloZapatillasNoValidoException {
		if (modelo==null)
			throw new ModeloZapatillasNoValidoException("modelo incorrecto");
		this.modelo = modelo;
	}
	
	/**
	 * Me dice si las zapatillas han sido devueltas o no
	 * @return true si han sido devueltas y false si no lo han sido
	 */
	
	@Override
	public boolean devolucion() {
		return false;	
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
			precio=  (float)(getPrecio()-(getPrecio()*0.35));
		case "PUMA":
			precio=  (float)(getPrecio()-(getPrecio()*0.2));
		case "JOMA":
			precio=  (float)(getPrecio()-(getPrecio()*0.25));
		case "ORBEA":
			precio=  (float)(getPrecio()-(getPrecio()*0.4));
		case "ASTORE":
			precio=  (float)(getPrecio()-(getPrecio()*0.1));
		}
		return precio;
	
	}

}
