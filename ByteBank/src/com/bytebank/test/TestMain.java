package com.bytebank.test;

public class TestMain {
	public static void main(String[] args) {
		/*
		 * int edad1=10;
		 * int edad2=20;
		 * int edad3=30;
		 */
		
		//agrupadas en una sola referencia
		int[] edades = new int[3];
		edades[0]=10;
		
		System.out.println(edades[0]);
		System.out.println(edades[1]);
		
		int tamanioArray = edades.length;
		try {
			System.out.println(edades[3]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("no se puede imprimir el tamaño es de: "+tamanioArray+" pero el ultimo lugar es: "+(tamanioArray-1)+" empieza en 0");
			ex.printStackTrace();
		}
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println("La edad en el lugar "+i+" es de: "+edades[i]);
		}
		}
}
