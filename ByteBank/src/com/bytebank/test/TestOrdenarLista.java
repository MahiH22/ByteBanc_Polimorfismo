package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {
	public static void main(String[] args) {
		Cuenta cc1 = new CuentaCorriente(2, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Diego");
		cc1.setTitular(clienteCC1);
		cc1.depositar(333.0);
		
		Cuenta cc2 = new CuentaCorriente(5, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Renato");
		cc2.setTitular(clienteCC2);
		cc2.depositar(444.0);
		
		Cuenta cc3 = new CuentaCorriente(8, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Liam");
		cc3.setTitular(clienteCC3);
		cc3.depositar(111.0);
		
		Cuenta cc4 = new CuentaCorriente(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Noel");
		cc4.setTitular(clienteCC4);
		cc4.depositar(333.0);
		
		List<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		System.out.println("Antes de ordenar");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		//ordenar las cuentas
		//Comparator <? extend Cuenta>c
		//Comparator<Cuenta> comparator = new OrdenarPorNumeroCuenta();
		

		//lista.sort(new OrdenarPorNumeroCuenta());		
		
		//con funcion anonima
		lista.sort(new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
		});
		System.out.println("Despues de ordenar");
		

		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		System.out.println("orde por nombres de titulares");
		//Comparator<Cuenta> comparatorTitular  new OrdenadorPorNombreTitular(); 
		
		//lista.sort( new OrdenadorPorNombreTitular());
		lista.sort(new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
		});
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		System.out.println("ordenamiento por orden natural");
		//versiones de aca anteriores a 8
		//Collections.sort(lista,new OrdenadorPorNombreTitular());
		Collections.sort(lista);
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}