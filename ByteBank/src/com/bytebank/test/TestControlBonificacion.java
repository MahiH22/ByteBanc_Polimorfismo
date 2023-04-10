package com.bytebank.test;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.ControlBonificacion;
import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;

//import com.bytebank.modelo.*;

public class TestControlBonificacion {
	public static void main(String[] args) {
		//com.bytebank.modelo.Funcionario diego 
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		Gerente jimena =new Gerente();
		jimena.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		ControlBonificacion control = new ControlBonificacion();
		
		control.registrarSalario(diego);
		control.registrarSalario(jimena);
		control.registrarSalario(alexis);
	}
}
