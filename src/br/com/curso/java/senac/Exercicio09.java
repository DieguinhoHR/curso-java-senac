package br.com.curso.java.senac;

import java.util.Scanner;

public class Exercicio09 {
	private static Scanner scanner;
	private static double valorDoCreditoOferecido = 0.0;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		double salarioMedioAnual; 
				
		System.out.print("Indique o seu salário médio anual: ");
		salarioMedioAnual = scanner.nextDouble();
		
		if (salarioMedioAnual >= 0 && salarioMedioAnual <= 500) {
			valorDoCreditoOferecido = salarioMedioAnual * 0.05;
		}
		
		if (salarioMedioAnual >= 501 && salarioMedioAnual <= 1000) {
			valorDoCreditoOferecido = salarioMedioAnual * 0.20;
		}
		
		if (salarioMedioAnual >= 1001 && salarioMedioAnual <= 2000) {
			valorDoCreditoOferecido = salarioMedioAnual * 0.30;
		}
		
		if (salarioMedioAnual >= 2001 && salarioMedioAnual <= 3000) {
			valorDoCreditoOferecido = salarioMedioAnual * 0.40;
		}
		
		if (salarioMedioAnual >= 3001 && salarioMedioAnual <= 5000) {
			valorDoCreditoOferecido = salarioMedioAnual * 0.60;
		}
		System.out.printf("valor do crédito oferecido pelo banco: R$%6.2f", valorDoCreditoOferecido);		
	}
}
