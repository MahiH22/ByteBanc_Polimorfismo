package com.bytebank.modelo; 

public class SistemaInterno {
	private String clave= "1234" ;
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSecion = gerente.iniciarSesion(clave);
		if(puedeIniciarSecion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Revisa credenciales");
			return false;
		}
	}
}
