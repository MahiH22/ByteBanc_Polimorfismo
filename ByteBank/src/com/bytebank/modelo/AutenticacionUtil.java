package com.bytebank.modelo;

public class AutenticacionUtil {
	private String clave;
	
	public void setclave(String clave) {
		this.clave=clave;
	}
	
	public boolean iniciarSesion(String clave) {
		if(this.clave==clave) {
			return true;
		}else {
			return false;
		}
	}
}
