package beecrowd_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("*** DIGITE O CÓDIGO DE UM ITEM ABAIXO PARA FAZER O PEDIDO :");
		System.out.println("(1) - Cachorro Quente | R$ 4.00");
		System.out.println("(2) - X-Salada | R$ 4.50");
		System.out.println("(3) - X-Bacon | R$ 5.00");
		System.out.println("(4) - Torrada Simples | R$  2.00");
		System.out.println("(5) - Refrigerante | R$ 1.50");

		int item = sc.nextInt();

		System.out.println("INFORME A QUANTIDADE DO ITEM :");

		int quantidade = sc.nextInt();
		double total = 0;

		if (item == 1) {
			total = quantidade * 4.0;
		} else if (item == 2) {
			total = quantidade * 4.5;
		} else if (item == 3) {
			total = quantidade * 5.0;
		} else if (item == 4) {
			total = quantidade * 2.0;
		} else if (item == 5) {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();

	}
}
