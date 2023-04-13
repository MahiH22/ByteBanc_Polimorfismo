package com.bytebank.test;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
	public static void main(String[] args) {
		int[] arreglo = new int[10];
		List<Integer> lista = new ArrayList<>();
		int numero = 40;
		//Integer numeroObjeto = new Integer(40);//deprecation
		
		Integer numeroObjeto = Integer.valueOf(40);
		
		int valorPrimitivo = numeroObjeto; //unboxing
		//int valorPrimitivo= numeroObjeto.intValue();
		
		lista.add(numero);//autoboxing 
		
		lista.add(numeroObjeto);
		
		numeroObjeto.byteValue();
		numeroObjeto.doubleValue();
		numeroObjeto.floatValue();
		
		byte byteInteger =numeroObjeto.byteValue();
		System.out.println(byteInteger);
		double doubleInteger = numeroObjeto.doubleValue();
		float dloatInteger = numeroObjeto.floatValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
	}
}
