package Ordenar;

import java.util.Comparator;

import sqlite.CreateDB;
import sqliteNuevo.GestionBaseDatos;
import utilidades.Producto;

public class PrecioProductos implements Comparator <PrecioProductos>{
	/**
	 * El precio de todos los productos
	 */
	private Producto precio;
	
	/**
	 * El número de productos que hay
	 */
	private int numeroProductos;
	
	/**
	 * Constructor del objeto
	 * @param precio
	 */
	
	public PrecioProductos (Producto precio){
		this.precio=precio;
		CreateDB bd=new CreateDB();
		bd.crearBaseDeDatosTienda("Tienda.db");
		this.numeroProductos=bd.devolverPrecios(precio);
	}

	public Producto getPrecio() {
		return precio;
	}

	public void setPrecio(Producto precio) {
		this.precio = precio;
	}

	public int getNumeroProductos() {
		return numeroProductos;
	}

	public void setNumeroProductos(int numeroProductos) {
		this.numeroProductos = numeroProductos;
	}

	@Override
	public int compare (PrecioProductos pr1, PrecioProductos pr2){
		if(pr1.getNumeroProductos()> pr2.getNumeroProductos()){
			return 0;
		}else {
			return 1;	
			}
	}
}
	
	
	


