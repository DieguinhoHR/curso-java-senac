import java.util.Scanner;

public class Exercicio05 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		double salarioTotal;
		double salarioFixo = 0.0;
		double acumulado = 0;
		int quantidadeDeVendas;
				
		System.out.print("Informe o salário do vendedor: ");		
		salarioFixo = scanner.nextDouble();
		
		System.out.print("Informe a quantidade de vendas: ");		
		quantidadeDeVendas = scanner.nextInt();
		
		for (int i = 0; i < quantidadeDeVendas; i++) {
			System.out.print("Informe o valor da venda: ");		
			acumulado += scanner.nextDouble();
		}			

		salarioTotal = salarioFixo + (acumulado / 10);
		
		System.out.print("Salario total: " + salarioTotal);
	}

}
