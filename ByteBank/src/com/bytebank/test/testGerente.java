package com.bytebank.test;

import com.bytebank.modelo.Gerente;

public class testGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(10000);
		System.out.println(gerente.getBonificacion());
		
		
	}
}
