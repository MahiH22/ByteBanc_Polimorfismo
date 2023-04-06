public class CuentaCorriente extends Cuenta implements Tributacion{
	
	public CuentaCorriente(int agencia,int numero) {
		super(agencia,numero);
	}
	@Override
	public boolean retirar(double valorRetiro) {
		double comision = 0.2;
		return super.retirar(valorRetiro+comision);
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
