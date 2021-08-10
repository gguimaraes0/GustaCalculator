package Calculator;

import java.util.Scanner;
import java.util.*;

public class Methods {

	public Scanner teclado = new Scanner(System.in);

	public int Menu() {
		System.out.println("Calculadora\n");
		System.out.println("1- Soma");
		System.out.println("2- Substra��o");
		System.out.println("3- Divis�o");
		System.out.println("4- Multiplica��o");
		System.out.println("5- Pot�ncia");
		System.out.println("6- Raiz Quadrada");
		System.out.println("0- Sair\n");

		int result = teclado.nextInt();
		return result;
	}

	public double Operacao(int operacao) {

		try {

			if (operacao == 1) {
				List<Double> listValores = new ArrayList<Double>();
				System.out.println("Voc� escolheu a op��o Soma\n");
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
			} else if (operacao == 2) {
				List<Double> listValores = new ArrayList<Double>();
				System.out.println("Voc� escolheu a op��o Subtra��o\n");
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
			} else if (operacao == 3) {
				List<Double> listValores = new ArrayList<Double>();
				System.out.println("Voc� escolheu a op��o Divis�o\n");
				int qntValores = 2;

				for (int i = 0; i < qntValores; i++) {
					double valor = DigiteValor();
					listValores.add(valor);
				}
				double resposta = 0;
				resposta = (listValores.get(0) / listValores.get(1));

				return resposta;
			} else if (operacao == 4) {
				List<Double> listValores = new ArrayList<Double>();
				System.out.println("Voc� escolheu a op��o Multiplica��o\n");
				int qntValores = QuantidadeDeValores();

				for (int i = 0; i < qntValores; i++) {
					double valor = DigiteValor();
					listValores.add(valor);
				}
				double resposta = 0;
				resposta = (listValores.get(0) * listValores.get(1));
				return resposta;
			} else if (operacao == 5) {
				List<Double> listValores = new ArrayList<Double>();
				System.out.println("Voc� escolheu a op��o Pot�ncia\n");
				int qntValores = 2;

				for (int i = 0; i < qntValores; i++) {
					double valor = DigiteValor();
					listValores.add(valor);
				}
				double resposta = 0;
				resposta = Math.pow(listValores.get(0), listValores.get(1));
				return resposta;
			} else if (operacao == 6) {
				System.out.println("Voc� escolheu a op��o Raiz Quadrada\n");
				double valor = DigiteValor();
				return java.lang.Math.sqrt(valor);
			} else if (operacao == 0) {
				return 0;
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

			System.out.println("Digite a quantidade de valores que ir� utilizar");
			int result = teclado.nextInt();
			return result;
		} catch (Exception e) {
			System.out.println("Erro no QuantidadeDeValores" + e);
			return 0;
		}
	}

}