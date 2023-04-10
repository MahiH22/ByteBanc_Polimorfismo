package com.bytebank.test;

import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;

public class testReferencias {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		funcionario.setSalario(2000);
		
		
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Mahi");
		gerente.setSalario(10000);
	}
}
