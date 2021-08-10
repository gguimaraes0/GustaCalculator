package Calculator;

public class Main {

	public static void main(String[] args) {

		Methods methods = new Methods();
		int result;
		do {

			result = methods.Menu();		
			
			if (result == 0)
				break;
			double fim = methods.Operacao(result);

			System.out.println("A soma dos valores digitados deu " + fim);
		} while (result != 0);
		
		System.out.println("CLOSED");
		System.out.flush();
	}
}

