package com.bytebank.modelo;
/**
 * Cuenta va a crear nuevas instacias de CuentaCorriente
 * @version 1.0
 * @param valor
 * @param cuenta
 * @return
 */

public abstract class Cuenta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 *Instancia una nueva cuenta con parametros Agencia y numero 
	 * 
	 */
	public Cuenta(int agencia,int numero) {
		total++;
		
		if(agencia <= 0) {
			System.out.println("no se permite menores que 1");
			this.agencia = 1;
		}else {
			this.agencia=agencia;
			this.numero=numero;
		}
	}
	
	public abstract void depositar(double valorDeposito);
	/**
	 * Este metodo retira dinero de la cuenta y si ocurre un error, devuelve una excepcion.
	 * @param valorRetiro
	 * @throws SaldoInsuficienteException
	 */
	public void retirar(double valorRetiro) throws SaldoInsuficienteException {
		if(this.saldo<valorRetiro) {
			throw new SaldoInsuficienteException("no tienes saldo suficiente");
		}
		this.saldo-=valorRetiro;
	}
	
	public boolean trasferir(double valor,Cuenta cuenta){
		if(this.saldo>= valor ) {
			try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
			return true;
		}else {
			return false;
		}
	}
	public double getSaldo() {
		return this.saldo;
	}
	/*
	public void setSaldo(double Valor) {
		this.saldo = Valor;
	}*/
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia){
		if(agencia > 0) {
			this.agencia = agencia;
		}
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal(){
		return total;
	}
	@Override
	public String toString() {
		String cuenta = "Numero: "+ this.numero + " Agencia: "+ this.agencia;
		return cuenta;
		
	}
}
