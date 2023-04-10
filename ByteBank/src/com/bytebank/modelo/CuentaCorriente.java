package com.bytebank.modelo;

public class CuentaCorriente extends Cuenta implements Tributacion{
	
	public CuentaCorriente(int agencia,int numero) {
		super(agencia,numero);
	}
	@Override
	public void retirar(double valorRetiro) {
		double comision = 0.2;
		try {
			super.retirar(valorRetiro+comision);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void depositar(double valorDeposito) {
		this.saldo+=valorDeposito;
	}
	@Override
	public double getValorImpuesto() {
		return super.saldo*0.1;
	}
	
	
}
