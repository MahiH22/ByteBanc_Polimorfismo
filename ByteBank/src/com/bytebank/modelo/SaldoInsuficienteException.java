package com.bytebank.modelo;
public class SaldoInsuficienteException extends Exception{
	SaldoInsuficienteException(){
		super();
	}
	SaldoInsuficienteException(String mensaje){
		super(mensaje);
	}
}
