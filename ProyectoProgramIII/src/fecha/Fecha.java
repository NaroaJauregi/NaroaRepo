package fecha;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Pattern;

import javax.swing.GroupLayout.SequentialGroup;

/**
 * Clase fecha. Realizaremos las operaciones mas comunes con fechas.
 *
 * @author Naroa_Jauregi
 * @version 1.0
 *
 */

public class Fecha implements Serializable{
	private static final long serialVersionUID=1L;
	
	public GregorianCalendar calendar;
	
	private static final Locale locale = new Locale ("Es", "es");

	
	/**
	 * Constructor
	 */

	public Fecha() {
		calendar = new GregorianCalendar (locale);
	}
	
	/**
	 * Constructor 
	 * @param dia
	 * @param mes
	 * @param anyo
	 * @throws FechaNoValidaException
	 */
	
	public Fecha(int dia, int mes, int anyo) throws FechaNoValidaException{
		if(!esValida(dia,mes-1,anyo))
			throw new FechaNoValidaException("Fecha no valida");
	}
	
	/**
	 * 
	 * @param cadena
	 * @throws FormatoNoValidoException
	 * @throws NumberFormatException
	 * @throws FechaNoValidaException
	 */
	
	public Fecha (String cadena) throws FormatoNoValidoException, NumberFormatException, FechaNoValidaException{
		if(!esValidoFormato (cadena))
			throw new FormatoNoValidoException("Formato no valido");
		if(!esValida (cadena))
			throw new FechaNoValidaException("Fecha no valida");
	}
	
	/**
	 * comprueba si el formato de la fecha es el adecuado
	 * @param cadena
	 * @return true si la fecha cumple el patron indicado
	 */
	
	private boolean esValidoFormato (String cadena){
		Pattern patron=Pattern.compile("(0?[1-9]|[12][0-9]|3[01])[-/](0?[0-9]|1[012])[-/](19|20\\d\\d");
				return patron.matcher(cadena).matches();
		
	}
	
	/**
	 * Obtenemos un array dividido en 3 partes a partir de una cadena
	 * @param cadena
	 * @return array
	 */
	
	private String [] ArrayDiaMesAnyo (String cadena){
		return cadena.split("[-/]");
	}
	
	/**
	 * comprueba que la fecha sea valida (enteros)
	 * @param dia
	 * @param mes
	 * @param anyo
	 * @return true si es valida, y false si no es valida
	 */
	
	private boolean esValida (int dia, int mes, int anyo){
		try{
			setGregorianCalendar (dia, mes, anyo);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	/**
	 * Comprueba si la fecha es valida (cadena)
	 * @param cadena
	 * @return true si es valida, y false si no es valida
	 */
	
	private boolean esValida (String cadena){
		String [] arrayFecha=ArrayDiaMesAnyo(cadena);
		try{
			return (esValida(Integer.parseInt(arrayFecha[0]),Integer.parseInt(arrayFecha[1])-1, Integer.parseInt(arrayFecha[2])));
		}catch (NumberFormatException e){
			return false;
		}
	}
	
	/**
	 * Devuelve el dia de la semana
	 * @return cadena con el dia
	 */
	
	public String getDia(){
		return calendar.getDisplayName(calendar.DAY_OF_WEEK, calendar.LONG, locale);
	}
	
	/**
	 * Devuelve el mes
	 * @return cadena con el mes
	 */
	
	public String getMes(){
		return calendar.getDisplayName(calendar.MONTH, calendar.LONG, locale);	
	}
	
	/**
	 * crea una fecha si es valida
	 * @param dia
	 * @param mes
	 * @param anyo
	 * @throws FechaNoValidaException
	 */
	
	void setGregorianCalendar (int dia, int mes, int anyo) throws FechaNoValidaException{
		try{
			calendar = new GregorianCalendar(locale);
			calendar.set(anyo, mes, dia);
			calendar.setLenient(false);
			calendar.getTime();
		}catch (Exception e){
			throw new FechaNoValidaException("fecha no valida");
		}
	}
	
	/**
	 * obtiene la fecha
	 * @return fecha
	 */
	
	public GregorianCalendar getFecha(){
		return calendar;
	}

	@Override
	public String toString() {
		return calendar.get(GregorianCalendar.DAY_OF_MONTH)+
				"/"+
				(calendar.get(GregorianCalendar.MONTH)+1)+
				"/"+
				(calendar.get(GregorianCalendar.YEAR));
	
	
	}
}
