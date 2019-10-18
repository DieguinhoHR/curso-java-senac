package br.com.curso.java.senac.lacos;

import java.util.Random;
import java.util.Scanner;

public class Exercicio04 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int num1;
		int num2;
				
        Random numero = new Random();
              
        for (int i = 0; i <= 100; i++) {
        	System.out.print("Informe o valor: ");
        	num1 = scanner.nextInt();
     		num2 = numero.nextInt(100);
     		
     		if (num1 == num2) {
     			System.out.println("Foi");
     		}
     		
            System.out.println(numero.nextInt(100));
        }
	}
}
