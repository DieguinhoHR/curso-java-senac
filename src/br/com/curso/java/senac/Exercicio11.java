package br.com.curso.java.senac;

import java.util.Scanner;

public class Exercicio11 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Informe um número: ");
		numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.print("Par: " + numero);			
		} else {
			System.out.print("impar: " + numero);
		}
	}
}
