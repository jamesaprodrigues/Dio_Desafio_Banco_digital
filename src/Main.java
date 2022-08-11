
public class Main {

	public static void main(String[] args) {
		Cliente james = new Cliente();
		james.setNome("James");
		
		Conta corrente = new ContaCorrente(james);
		Conta poupanca = new ContaPoupanca(james); 
		
		corrente.deposito(100);
		corrente.transferencia(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
