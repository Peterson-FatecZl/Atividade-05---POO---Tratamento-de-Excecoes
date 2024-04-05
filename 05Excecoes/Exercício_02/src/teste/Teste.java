package teste;

import model.Conta;

public class Teste {

	public static void main(String[] args) {
		Conta conta = new Conta();
				
		try {
		conta.setSaldo(1000);
		conta.setLimite(500);

			conta.saca(2000);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
