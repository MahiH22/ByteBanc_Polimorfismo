package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.CuentaAhorros;


public class TestArregloReferencias {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(10,20);
		
		Cuenta[] cuentas = new Cuenta[5];
		cuentas[1]=cc;
		
		
		cuentas[0]=new CuentaCorriente(11, 99);
		
		cuentas[2]= new CuentaAhorros(23,24);
		
		CuentaCorriente cuentaCor = (CuentaCorriente)cuentas[0];
		//System.out.println(cuentaCor);
		
		for (int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
		
		
		Cliente cliente = new Cliente();
		
		//tipos de cast
		int numero1 = 3;
		double valor1 = numero1;//cast implicito
		
		int numero2 = 3;
		double valor2 = (double)numero2;//cat explicito
		
		double valor = 3.56;
		int numero=(int)valor;//cast explicitos es exigido por el compilador
		
		
	}
}
