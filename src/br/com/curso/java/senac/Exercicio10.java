package br.com.curso.java.senac;

import java.util.Scanner;

public class Exercicio10 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int diaDaSemana;
		
		do {		
			System.out.println("Informe o dia da semana: ");
			diaDaSemana = scanner.nextInt();
		} while (diaDaSemana < 1 || diaDaSemana > 7);
		
		switch (diaDaSemana) {
			case 1: System.out.printf("O dia da semana é segunda-feira"); break;
			case 2: System.out.printf("O dia da semana é terça-feira"); break;
			case 3: System.out.printf("O dia da semana é quarta-feira"); break;
			case 4: System.out.printf("O dia da semana é quinta-feira"); break;
			case 5: System.out.printf("O dia da semana é sexta-feira"); break;
			case 6: System.out.printf("O dia da semana é sábado"); break;
			case 7: System.out.printf("O dia da semana é domingo"); break;			
		}
	}
}
