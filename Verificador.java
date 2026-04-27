import java.util.Scanner;

public class Verificador {

	// TODO Auto-generated method stub
	static boolean isPrimo(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static boolean isPerfeito(int n) {
		if (n < 2)
			return false;
		int soma = 1;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				soma += i;
		}
		return soma == n;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("=== Verificador de Número ===\nDigite um número inteiro: ");
		int n = teclado.nextInt();

		System.out.println("\n--- Resultados ---");
		System.out.println("É Par ou ímpar : " + (n % 2 == 0 ? "Par" : "Ímpar"));
		System.out.println("É Positivo/Neg : " + (n > 0 ? "Positivo" : n < 0 ? "Negativo" : "Zero"));
		System.out.println("É Primo        : " + (isPrimo(n) ? "Sim" : "Não"));
		System.out.println("É Perfeito     : " + (isPerfeito(n) ? "Sim" : "Não"));
		System.out.println("É Quadrado     : " + (Math.sqrt(Math.abs(n)) % 1 == 0 ? "Sim" : "Não"));

		teclado.close();

	}

}
