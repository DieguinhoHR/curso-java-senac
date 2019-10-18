package br.com.curso.java.senac;

import java.util.Scanner;

public class Exercicio08 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int peso;
		double altura, imc;
		
		System.out.print("Indique o seu peso: ");
		peso = scanner.nextInt();
		
		System.out.print("Indique a sua altura: ");
		altura = scanner.nextDouble();
		
		imc = peso / ((altura)*(altura));
		
		if (imc < 20) {
			System.out.printf("Abaixo do peso %6.2f", imc);		
		}
		
		if (imc >= 20 && imc < 25) {			
			System.out.printf("Peso normal %6.2f", imc);
		}
		
		if (imc >= 25 && imc < 30) {
			System.out.printf("Sobre peso %6.2f", imc);
		}
		
		if (imc >= 30 && imc < 40) {
			System.out.printf("Obeso %6.2f", imc);			
		}
		
		if (imc > 40) {			
			System.out.printf("Obeso Mórbido %6.2f", imc);		
		}
	}
}
