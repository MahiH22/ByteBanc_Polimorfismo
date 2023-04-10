package com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable{
	private AutenticacionUtil util;
	
	public Gerente() {
		super();
	}
	public double getBonificacion(){
		return super.getSalario()+this.getSalario()*0.05;
	}
	@Override
	public void setclave(String clave) {
		this.util.setclave(clave);
	}
	
	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
}
