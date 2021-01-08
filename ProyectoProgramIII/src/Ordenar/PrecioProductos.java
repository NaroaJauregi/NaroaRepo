package Ordenar;

import java.util.Comparator;

import sqliteNuevo.GestionBaseDatos;
import utilidades.Producto;

public class PrecioProductos implements Comparator <PrecioProductos>{
	
	private Producto precio;
	private int numeroProductos;
	
	public PrecioProductos (Producto precio){
		this.precio=precio;
		GestionBaseDatos gbd=new GestionBaseDatos ("Tienda.db");
		this.numeroProductos=gbd.devolverPrecios(precio);
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
	
	
	


