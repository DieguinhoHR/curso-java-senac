package br.com.curso.java.senac.lacos;

import java.util.Scanner;

public class Exercicio03 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int numeros = 0;
					
		System.out.print("Informe o número: ");
		numeros = scanner.nextInt();
		
		for (int i = 0; i <= numeros; i++) {
			if (i % 2 == 0) {
				System.out.println("Númerso pares: " + i);
			}
		}
	}
}
