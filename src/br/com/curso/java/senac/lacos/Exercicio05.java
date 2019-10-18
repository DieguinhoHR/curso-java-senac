package br.com.curso.java.senac.lacos;

import java.util.Scanner;

public class Exercicio05 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int op;
		double valor1;
		double valor2;
		double result = 1;
		int cont = 1;
					
		do {
			System.out.println("Digite o valor 1: ");
			valor1 = scanner.nextDouble();
			
			System.out.println("Digite o valor 2: ");
			valor2 = scanner.nextDouble();
			
			System.out.println("Digite o calculo desejado: ");
			op = scanner.nextInt();
			
			if (op == 1) {
				result = valor1 + valor2;
				
				System.out.println("Resultado: " + result);
			}
			
			if (op == 2) {
				result = valor1 - valor2;
				
				System.out.println("Resultado: " + result);
			}
			
			if (op == 3) {
				result = valor1 * valor2;
				
				System.out.println("Resultado: " + result);
			}
			
			if (op == 4) {
				result = valor1 / valor2;
				
				System.out.println("Resultado: " + result);
			}
			
			if (op == 5) {			
				for(int i = 1; i <= valor2; i++) {
					result *= valor1;
					
					System.out.println("Resultado: " + result);
				}
			}		
			
			if (op == 6) {			
				for(int i = 1; i <= valor2; i++) {
					result *= valor1;
					
					System.out.println("Resultado: " + result);
				}
			}
		} while (op != 0);		
	}
}
