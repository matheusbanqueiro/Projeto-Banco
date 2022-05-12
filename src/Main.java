public class Main {

    public static void main(String[] args) {
    	
    	Cliente matheus = new Cliente("Matheus", "549.009.298-21", "Desenvolvedor");
		
    	ContaCorrente cc = new ContaCorrente(matheus);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(matheus);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);
        
        Cliente rene = new Cliente("Renê", "123.441.369-24", "Advogado");
        
        ContaCorrente c1 = new ContaCorrente(rene);
        c1.deposita(100.0);

        ContaPoupanca c2 = new ContaPoupanca(rene);
        c2.deposita(300.0);

        c1.transfere(10.0, c2);

        
        System.out.println("***********************");
        System.out.println("===Titular da conta===");
        System.out.println("nome: " + matheus.getNome());
        System.out.println("Cpf: " + matheus.getCpf());
        System.out.println("Profisao: " + matheus.getProfissao());
        System.out.println("***********************");
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
        
        System.out.println("***********************");
        System.out.println("===Extrato da Conta===");
        cc.imprimirInfosComuns();
        System.out.println("***********************");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++");
        
        System.out.println("***********************");
        System.out.println("===Titular da conta===");
        System.out.println("nome: " + rene.getNome());
        System.out.println("Cpf: " + rene.getCpf());
        System.out.println("Profisao: " + rene.getProfissao());
        System.out.println("***********************");
        System.out.println("CC: " + c1.getSaldo());
        System.out.println("CP: " + c2.getSaldo());
        
        System.out.println("***********************");
        System.out.println("===Extrato da Conta===");
        c1.imprimirInfosComuns();
        System.out.println("***********************");
    }

}
