public class CuentaAhorros extends Cuenta implements Tributacion{

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
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
