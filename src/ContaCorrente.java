public class ContaCorrente extends Conta {
	//new ContaCorrente()
		public ContaCorrente(Cliente cliente) {
	        super(cliente);
	    }

	    @Override
	    public boolean saca(double valor) {
	        double valorASacar = valor;
	        return super.saca(valorASacar);
	    }

	    @Override
	    public void deposita(double valor) {
	        super.saldo += valor;
	    }
}
