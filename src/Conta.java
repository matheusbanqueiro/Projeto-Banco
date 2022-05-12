public abstract class Conta {
	
	private static final int agenciaPadrao = 110;
	private static int sequencial = 1;
	
    protected double saldo;
    protected Cliente cliente;
    protected int agencia;
	protected int numero;     
    
   
    public Conta(Cliente cliente){
        this.agencia = Conta.agenciaPadrao;
        this.numero = sequencial++;
        this.cliente = cliente;
    }
    

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
                destino.deposita(valor);
                return true;
        } else {
                return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return numero;
    }
    public int getAgencia(){
        return agencia;
    }
    public void setTitular(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getTitular(){
        return this.cliente;
    }
    protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Numero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}

