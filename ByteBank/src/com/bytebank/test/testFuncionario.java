package com.bytebank.test;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.Funcionario;

public class testFuncionario {
	public static void main(String[] args) {
		Funcionario mahi = new Contador();
		mahi.setNombre("Mahi");
		mahi.setDocumento("Mahi123");
		mahi.setSalario(20000);
		
		System.out.println(mahi.getSalario());
		
	}
}
