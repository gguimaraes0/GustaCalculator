package Calculator;

public class Main {

	public static void main(String[] args) {

		Methods methods = new Methods();
		int result;
		do {

			methods.Menu();
			result = methods.ValidaMenu();

			if (result == 0)
				break;
			if (result == 7) {
				continue;
			}
			double fim = methods.Operacao(result);

			System.out.println("A soma dos valores digitados deu " + fim);
		} while (result != 0);

		System.out.println("Aplicação Finalizada");
	}

}
