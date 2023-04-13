package com.bytebank.test;

public class TestWrappers {
	public static void main(String[] args) {
		Double numeroDouble = 33.0;
		Boolean verdadero = true;
		Boolean falso = Boolean.FALSE;
		
		Double numeroDouble2 = Double.valueOf(33);
		String numeroString2= new String("43");
		
		System.out.println(numeroDouble2);
		
		String numeroString="43";
		
		Double stringtoDouble = Double.valueOf(numeroString);
		Integer stringInteger = Integer.valueOf(numeroString);
		
		Number numero = Integer.valueOf(5);
		
		
		
	}
}
