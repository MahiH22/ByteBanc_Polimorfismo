package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaCuentas;

public class TestGuardaCuenta {
	public static void main(String[] args) {
		GuardaCuentas guardaCuentas = new GuardaCuentas();
		
		Cuenta cc= new CuentaCorriente(11,22);
		guardaCuentas.adicionar(cc);
		guardaCuentas.adicionar(new CuentaCorriente(33,44));
		
		guardaCuentas.obtener(1);

		System.out.println(guardaCuentas.obtener(0));
		System.out.println(guardaCuentas.obtener(1));
		
	}
}
