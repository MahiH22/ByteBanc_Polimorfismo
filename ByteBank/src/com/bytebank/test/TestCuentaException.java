package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;

public class TestCuentaException {
	public static void main(String[] args) {
		System.out.println("new");
		
		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.depositar(200);
		
		try {
			cuenta.retirar(201);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println(cuenta.getSaldo());
	}
}
