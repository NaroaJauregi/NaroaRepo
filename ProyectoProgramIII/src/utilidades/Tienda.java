package utilidades;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

import utilidades.excepciones.ElementoNoExisteExcepcion;
import utilidades.excepciones.ElementoYaExisteExcepcion;

public class Tienda <productos> implements Serializable{
	private static final long serialVersionUID=1L;


	/**
	 * lista de productos
	 */
	
	private ArrayList <productos> almacen=new ArrayList<productos>();
	
	/**
	 * Me dice si se ha modificado la lista
	 */
	
	public boolean modificado=false;
	
	/**
	 * devuelve la lista de productos del almacen
	 * @return lista de almacen
	 */
	
	public ArrayList<productos> getAlmacen(){
		return almacen;
	}
	
	/**
	 * comprueba si la lista ha sido modificada
	 * @return true si ha sid omodificado, y false si no ha sido modificado
	 */
	
	public boolean modificado(){
		return modificado;
	}
	
	/**
	 * pone modificado a true o a false
	 * @param modificado
	 */
	
	public void setModificado (boolean modificado){
		this.modificado=modificado;
	}
	
	/**
	 * Añade el producto a la lista
	 * @param elemento
	 * @return true si se ha añadido
	 * @throws ElementoYaExisteExcepcion
	 */
	
	public boolean anyadirProducto (productos elemento) throws ElementoYaExisteExcepcion{
		if(almacen.contains(elemento))
			throw new ElementoYaExisteExcepcion("el producto ya existe en el almacen");
		return almacen.add(elemento);
	}
	
	/**
	 * elimina producto
	 * @param id_producto
	 * @return
	 * @throws ElementoNoExisteExcepcion
	 */
	
	public boolean eliminar (String id_producto) throws ElementoNoExisteExcepcion{
		productos elemento = getProductoPorId(id_producto);
		if(!almacen.contains(elemento))
			throw new ElementoNoExisteExcepcion("No existe el elemnto");
		return almacen.remove(elemento);
	}
	
	/**
	 * devuelve el numero de productos que hay en el almacen
	 * @return numero de productos
	 */
	
	int tamanyo(){
		return almacen.size();	
	}
	
	/**
	 * saca el producto que buscamos
	 * @param id_producto
	 * @return producto
	 * @throws ElementoNoExisteExcepcion
	 */
	
	public productos getProductoPorId (String id_producto) throws ElementoNoExisteExcepcion{
		for (productos elemento: almacen){
			if(((Producto) elemento).getId_producto().equals(id_producto))
				return elemento;
		}
		throw new ElementoNoExisteExcepcion("el elemento no existe");
	}
	
	
	
	
}