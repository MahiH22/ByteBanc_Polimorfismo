package com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
	public static void main(String[] args) {
		
		List<Cliente> listaClientes = new LinkedList<Cliente>();
		
		ArrayList<Cuenta> lista = new ArrayList();
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(22, 30);
		lista.add(cc);
		lista.add(cc2);
		
		//Cliente cliente = new Cliente();
		//lista.add(cliente);
		
		System.out.println("for normal");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(0));
		}
		System.out.println("for each");
		
		for(Cuenta cuenta : lista) {
		System.out.println(cuenta);
		}
		
		Cuenta cc3 = new CuentaCorriente(22, 30);
		
		if(lista.contains(cc3)) {
			System.out.println("Lo tiene");
		}else {
			System.out.println("No lo tiene");
		}//Comparacion por referencia
		
		if(cc2.esIgual(cc3)) {
			System.out.println("Si, son iguales");
		}else {
			System.out.println("No son iguales");
		}//comparacion por valores
		
		if(cc2.equals(cc3)) {
			System.out.println("Si, son iguales");
		}else {
			System.out.println("No son iguales");
		}//comparacion por valores
		
	}
}
