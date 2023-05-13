
public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco("itau", "rua dos bancos", "São Paulo", "SP");


		Cliente venilton = new Cliente("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		Conta cc2 = new ContaCorrente(new Cliente("Joaquina"));
		cc2.depositar(800);

		banco.addConta(poupanca);
		banco.addConta(cc);
		banco.addConta(cc2);
		
		cc.depositar(100);
		cc.transferir(70, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.imprimirTotalNoCofre();


	}

}
