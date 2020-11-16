package utilidades;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Clase fichero
 * @author Alumno
 * @version 1.0
 *
 */

public class Fichero {
	
	/**
	 * Abre el fichero y devuelve lo que haya en él
	 * @param file
	 * @return tienda
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	
	public static Tienda <Producto> leerFichero (File file)throws FileNotFoundException, IOException, ClassNotFoundException{
		file=comprobarExtension(file);
		try(ObjectInputStream in=new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){
		return (Tienda<Producto>)in.readObject();
		}
	}
	
	/**
	 * Escribir la tienda en el fichero
	 * @param file
	 * @param tienda
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	
	public static void escribirFichero(File file, Tienda<Producto> tienda) throws FileNotFoundException, IOException{
		file=comprobarExtension(file);
		try(ObjectOutputStream out=new ObjectOutputStream (new BufferedOutputStream(new FileOutputStream(file)))){
			out.writeObject (tienda);
		}		
	}
	
	/**
	 * Comprueba si el fichero existe
	 * @param ruta
	 * @return true si existe y false si no existe
	 */
	
	public static boolean existe(File file){
		file=comprobarExtension(file);
		return file.exists();	
	}
	
	static File comprobarExtension (File file){
		String ruta=file.getPath();
		if(!ruta.endsWith(".obj"))
			return new File(ruta+".obj");
		return file;
		
	}

}
