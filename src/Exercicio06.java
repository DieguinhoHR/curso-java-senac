import java.util.Scanner;

public class Exercicio06 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		try {
			System.out.print("Entre com o nome da equipe 1: ");
			String equipe1 = scanner.next();

			System.out.print("Digite os pontos: ");
			int pontos1 = scanner.nextInt();

			System.out.print("Entre com o nome da equipe 2: ");
			String equipe2 = scanner.next();

			System.out.print("Digite os pontos: ");
			int pontos2 = scanner.nextInt();

			if (pontos1 > pontos2)
				System.out.print("Equipe 1 venceu: " + equipe1);

			if (pontos2 > pontos1)
				System.out.print("Equipe 2 venceu " + equipe2);

			if (pontos1 == pontos2)
				System.out.print("Empatou");
		} catch (Exception e) {
			System.out.print("Deu ruim " + e.getMessage());
		}
	}
}
