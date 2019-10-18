package br.com.curso.java.senac;
import java.util.Scanner;

public class Exercicio03 {
	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String name;
		float nota1 = 0;
		float nota2 = 0;
		float nota3 = 0;
		
		System.out.print("Digite seu nome: ");		
		name = scanner.next();
		
		System.out.print("Digite a primeira nota: ");
		nota1 = scanner.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = scanner.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = scanner.nextFloat();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 7) {
			System.out.print("Aprovado: " + media);					
		} else if (media > 4 && media < 7) {
			System.out.print("Exame " + media);	
		} else {
			System.out.print("Reprovado" + media);
		}	
	}
}
