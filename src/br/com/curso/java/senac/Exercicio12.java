package br.com.curso.java.senac;

import java.util.Scanner;

public class Exercicio12 {		
	public static void main(String[] args) {
		int[] vet = {8, 9, 15};
	    int aux = 0;
	    int i = 0;
		     
	    for(i = 0; i < 3; i++){
	        for(int j = 0; j < 2; j++){
	            if(vet[i] > vet[j]){
	                aux = vet[j];
	                vet[j] = vet[i];
	                vet[i] = aux;
	            }
	        }
	    }
	    System.out.println("Vetor organizado:");
	    for(i = 0; i < 3; i++){
	        System.out.println(" "+vet[i]);
	    }		
	}
}
