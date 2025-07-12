package beecrowd_exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("*** CALCULADORA DE INTERVALOS ***");
		System.out.println("Digite um número e o computador dirá o intervalo  ([0,25], (25,50], (50,75], (75,100]) :");
		
		numero = sc.nextInt();
		
		if(numero >= 0 && numero <= 25) {
			System.out.println("O número digitado está entre 0 e 25.");
		}
		else if
		  (numero > 25 && numero <= 50) {
			System.out.println("O número digitado está entre 25 e 50.");
		}
		else if
		  (numero > 50 && numero <= 75) {
			System.out.println("O número digitado está entre 50 e 75.");
		}
		else if
		   (numero > 75 && numero <= 100) {
			System.out.println("O número digitado está entre 75 e 100.");
		}
		else
			System.out.println("Fora de intervalo.");
		
		sc.close();
	}
}
