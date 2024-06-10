
public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setNome("Vinicius");
		
		Conta cc = new ContaCorrente(c);
		Conta poupanca = new ContaPoupanca(c);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}