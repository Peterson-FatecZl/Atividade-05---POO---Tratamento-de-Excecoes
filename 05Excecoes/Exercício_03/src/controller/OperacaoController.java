package controller;

public class OperacaoController {

	public OperacaoController() {
		super();
	}

	// Methods
	public int operacaoValor(int integer) throws ArithmeticException {

		if (integer < 0) {
			throw new ArithmeticException("The value cannot be negative");
		}

		if (integer % 2 == 0) {
			return integer *= integer;
		} else {
			return integer *= (integer * integer);
		}

	}
}
