package br.com.curso.java.senac.lacos;

import java.util.Scanner;

public class Exercicio01 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		double valor = 0;
		double media = 0;
		int op = 0;
		int cont = 0;

		do {
			System.out.print("Informe um valor ou mais: ");
			valor += scanner.nextDouble();

			cont++;
			
			System.out.print("Informe zero pra sair: ");
			op = scanner.nextInt();
		} while (op != 0);

		media = (valor / cont);

		System.out.print("Média: " + media);
	}
}
