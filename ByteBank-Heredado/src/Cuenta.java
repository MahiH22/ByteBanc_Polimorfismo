
public abstract class Cuenta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	
	public Cuenta(int agencia,int numero) {
		total++;
		
		if(agencia <= 0) {
			System.out.println("no se permite menores que 1");
			this.agencia = 1;
		}else {
			this.agencia=agencia;
		}
		System.out.println(total);
	}
	
	public abstract void depositar(double valorDeposito);
	
	public boolean retirar(double valorRetiro) {
		if(this.saldo >= valorRetiro) {
			this.saldo-=valorRetiro;
			return true;
		}
		return false;
	}
	
	public boolean trasferir(double valor,Cuenta Cuenta){
		if (this.saldo>=valor) {
			retirar(valor);
			Cuenta.depositar(valor);
			return true;
		}
		return false;
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
	
}
