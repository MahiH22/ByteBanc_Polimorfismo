public class TestTributacion {
	public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(222, 333);
        cc.depositar(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculoImpuesto calc = new CalculoImpuesto();

        calc.registra(cc);
        calc.registra(seguro);
        
        System.out.println(calc.getTotalImpuesto());
	}
}
