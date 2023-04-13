package com.bytebank.modelo;

public class GuardaCuentas {
	//Objeto Guardar cuentas
	//permitir agregar cuentas con metodo
	//guardaCuentas.adiciona(cuenta);
	//obtener remover etc
	
	Cuenta[] cuenta = new Cuenta[10];
	int indice = 0;

	public void adicionar(Cuenta cc) {
		cuenta[indice]=cc;
		indice++;
	}
	public Cuenta obtener(int indice) {
		return cuenta[indice];
	}
	
}
