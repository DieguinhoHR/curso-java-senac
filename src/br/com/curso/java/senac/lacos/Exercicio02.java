package br.com.curso.java.senac.lacos;

import java.util.Scanner;

public class Exercicio02 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int numeros = 0;
		int acum = 1;
				
		System.out.print("Informe o número do fatorial: ");
		numeros = scanner.nextInt();
		
		for (int i = 1; i <= numeros; i++) {
			acum = i * acum;
			System.out.println("Resultado: " + acum);
		}		
	}
}
