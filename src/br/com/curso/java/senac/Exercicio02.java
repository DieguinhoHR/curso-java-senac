package br.com.curso.java.senac;
import java.util.Scanner;

public class Exercicio02 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");		
		String name = scanner.next();
		
		System.out.print("Digite sua idade: ");		
		int idade = scanner.nextInt();
		
		if (idade >= 18) {
			System.out.print("Nome" + name + " De maior: " + idade);	
		} else {
			System.out.print("De menor: ");	
		}
	}
}
