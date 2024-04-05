package teste;

public class Teste {
	public static void main(String[] args) {

		try {

			System.out.println("Inicio do main");
			metodo1();
			System.out.println("Fim do main");

		} catch (IndexOutOfBoundsException outBound) {
			System.out.println(outBound.getMessage());

		} catch (ArithmeticException ArithmeticError) {
			System.out.println(ArithmeticError.getMessage());
		}

	}

	public static void metodo1() {
		System.out.println("Inicio do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}

	public static void metodo2() throws ArithmeticException, IndexOutOfBoundsException {
		System.out.println("Inicio do método 2");
		int[] vetor = new int[10];
		for (int i = 0; i <= 15; i++) {
			vetor[i] = i;
			System.out.println(i);
			if (i == 9) {
				int vlr = vetor[i] / vetor[1];
				System.out.println(vlr);
			}
		}
		System.out.println("Fim do método 2");
	}
}