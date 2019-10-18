package br.com.curso.java.senac;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		double nota1 = 0;
		double nota2 = 0;
		double media = 0.0;
		
		System.out.print("Digite seu nome: ");		
		name = scanner.next();
		
		System.out.print("Digite a primeira nota: ");
		nota1 = scanner.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = scanner.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.print("M�dia: " + media);
	}

}
