package com.NTTData.tomcat;
/**
 * Esta clase crea el metodo para saludar al usuario.
 * @author David César Fernández Aliseda
 * @version 11/11/21/A
 */
public class NTTDataJSP {
	/**
	 * Saluda mediante el JSP
	 * @param name
	 * @return String
	 */
	public static String helloNTTData(final String name) {
		String result = "Bienvenid@ a NTTData "+ name;
		return result;
	}
}
