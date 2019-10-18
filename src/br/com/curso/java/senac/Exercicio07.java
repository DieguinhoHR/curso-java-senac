package br.com.curso.java.senac;
import java.util.Scanner;

public class Exercicio07 {
	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int dia, mes, ano;
		int totalDias, totalMeses;
		int anos;
		
		System.out.print("Informe o dia de nascimento: ");
		dia = scanner.nextInt();
		System.out.print("Informe o mes de nascimento: ");
		mes = scanner.nextInt();
		System.out.print("Informe o ano de nascimento: ");
		ano = scanner.nextInt();
		
		anos = 2019 - ano;
		
		if (mes == 10 && ano == 2019) {
			
		} else {
			totalDias = (2019 - ano) * (-1*(10 - mes)) * 30;
		}
		
		System.out.print("Resultado: " + anos);
		
	}
}
