package com.bytebank.modelo;

public interface Autenticable{
	
	public void setclave (String clave) ;
	
	public boolean iniciarSesion(String clave);
	
	
}
