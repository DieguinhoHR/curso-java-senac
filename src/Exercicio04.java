import java.util.Scanner;

public class Exercicio04 {
	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		double quantidadeDeEleitores = 0;
		double numeroVotosEmBrancos = 0;
		double votosNulos = 0;
		double votosValidos = 0;
		
		System.out.print("Digite a quantidade de eleitores: ");		
		quantidadeDeEleitores = scanner.nextDouble();
		
		System.out.print("Digite o número de votos em branco: ");		
		numeroVotosEmBrancos = scanner.nextDouble();
				
		System.out.print("Digite o número de votos nulos: ");		
		votosNulos = scanner.nextDouble();
		
		System.out.print("Digite o número de votos válidos: ");		
		votosValidos = scanner.nextDouble();
		
		double result = (quantidadeDeEleitores + numeroVotosEmBrancos + votosNulos + votosValidos) / 100;
		
		System.out.print("Result: " + result);
	}

}
