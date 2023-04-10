package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestString {
	public static void main(String[] args) {
		String nombre = "mahi";
		String post= "22";
		//No es utilizada pero Existe
		//String nombre = new String("Mahi22");
		
		//String es inmutable
		System.out.println(nombre);
		//Se crea un nuevo String
		nombre=nombre.replace("m", "M");
		System.out.println(nombre);
		nombre=nombre.concat(post);
		System.out.println(nombre);
		nombre=nombre.toUpperCase();
		System.out.println(nombre);
		nombre=nombre.toLowerCase();
		System.out.println(nombre);
		
		System.out.println("Nombre tiene "+nombre.length()+" caracteres");
		System.out.println("En el estacio 2 tiene el caracter '"+nombre.charAt(1)+"'");
		System.out.println("La letra a esta en "+(nombre.indexOf("a")+1));
		
		Object cuenta = new CuentaCorriente(20, 30);
		printLine("imprime de todo");
		printLine(123);
		printLine(cuenta);
		System.out.println(cuenta.toString());
	}
	
	public static void printLine(Object valor) {
		System.out.println(valor);
	}
}
