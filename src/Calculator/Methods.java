package Calculator;

import java.util.Scanner;
import java.util.*;

public class Methods {

	public Scanner teclado = new Scanner(System.in);

	public int ValidaMenu() {

		int result;
		try {
			teclado = new Scanner(System.in);
			result = teclado.nextInt();
		} catch (Exception ex) {
			result = 7;
		}

		if (result == 7) {
			System.out.println("Digite um número válido");
			return 7;
		}
		switch (result) {

		case 1: {
			return result;
		}
		case 2: {
			return result;
		}
		case 3: {
			return result;
		}
		case 4: {
			return result;
		}
		case 5: {
			return result;
		}
		case 6: {
			return result;
		}
		case 0: {
			return result;
		}
		case 7: {
			System.out.println("Digite um número válido");
			return 7;
		}
		default: {
			return 7;
		}
		}
	}

	public void Menu() {
		System.out.println("Calculadora\n");
		System.out.println("1- Soma");
		System.out.println("2- Substração");
		System.out.println("3- Divisão");
		System.out.println("4- Multiplicação");
		System.out.println("5- Potência");
		System.out.println("6- Raiz Quadrada");
		System.out.println("0- Sair\n");
	}

	public static Integer TryParseInt(String someText) {
		try {
			return Integer.parseInt(someText);
		}

		catch (NumberFormatException ex) {
			return null;
		}
	}

	public double Operacao(int operacao) {

		try {

			switch (operacao) {
			case 1: {
				List<Double> listValores = new ArrayList<Double>();
				System.out.println("Você escolheu a opção Soma\n");
				int qntValores = QuantidadeDeValores();

				for (int i = 0; i < qntValores; i++) {
					double valor = DigiteValor();
					listValores.add(valor);
				}

				double resposta = 0;
				for (Double item : listValores) {
					resposta += item;
				}

				return resposta;
			}
			case 2: {
				List<Double> listValores = new ArrayList<Double>();
				System.out.println("Você escolheu a opção Subtração\n");
				int qntValores = QuantidadeDeValores();

				for (int i = 0; i < qntValores; i++) {
					double valor = DigiteValor();
					listValores.add(valor);
				}
				double aux = listValores.get(0);
				listValores.remove(aux);
				for (Double item : listValores) {
					aux = aux - item;
				}

				return aux;
			}
			case 3: {
				List<Double> listValores = new ArrayList<Double>();
				System.out.println("Você escolheu a opção Divisão\n");
				int qntValores = 2;

				for (int i = 0; i < qntValores; i++) {
					double valor = DigiteValor();
					listValores.add(valor);
				}
				double resposta = 0;
				resposta = (listValores.get(0) / listValores.get(1));

				return resposta;
			}
			case 4: {
				List<Double> listValores = new ArrayList<Double>();
				System.out.println("Você escolheu a opção Multiplicação\n");
				int qntValores = QuantidadeDeValores();

				for (int i = 0; i < qntValores; i++) {
					double valor = DigiteValor();
					listValores.add(valor);
				}
				double resposta = 0;
				resposta = (listValores.get(0) * listValores.get(1));
				return resposta;
			}
			case 5: {
				List<Double> listValores = new ArrayList<Double>();
				System.out.println("Você escolheu a opção Potência\n");
				int qntValores = 2;

				for (int i = 0; i < qntValores; i++) {
					double valor = DigiteValor();
					listValores.add(valor);
				}
				System.out.println();
				double resposta = 0;
				resposta = Math.pow(listValores.get(0), listValores.get(1));
				return resposta;
			}
			case 6: {
				System.out.println("Você escolheu a opção Raiz Quadrada\n");
				double valor = DigiteValor();
				return java.lang.Math.sqrt(valor);
			}
			case 0: {
				return 0;
			}
			}
			return 0;
		} catch (Exception e) {
			System.out.println("Erro na Operacao" + e);
			return 0;
		}

	}

	public double DigiteValor() {
		try {
			System.out.println("Digite um valor");

			double result = teclado.nextDouble();
			return result;
		} catch (Exception e) {
			System.out.println("Erro no DigiteValor" + e);
			return 0;
		}
	}

	public int QuantidadeDeValores()

	{
		try {

			System.out.println("Digite a quantidade de valores que irá utilizar");
			int result = teclado.nextInt();
			return result;
		} catch (Exception e) {
			System.out.println("Erro no QuantidadeDeValores" + e);
			return 0;
		}
	}

}