public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
    @Override
    public boolean saca(double valor) {
        double valorASacar = valor;
        return super.saca(valorASacar);
    }
}
