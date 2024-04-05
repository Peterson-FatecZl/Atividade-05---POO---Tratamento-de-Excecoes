package test;

import controller.OperacaoController;

public class Test {

	public static void main(String[] args) {
		
		try {
			
			OperacaoController operationController = new OperacaoController();
			
			operationController.operacaoValor(-5);			
		}catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		
		

	}

}
