package aulas_java;

import java.util.Scanner;

public class LaçosDeRepetiçãoExWhileDo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, soma = 0, num;

		do {
			System.out.println("\nDigite o número: ");
			num = sc.nextInt();
			soma += num;

		} while (num != 0);

		System.out.println("\nA soma dos números é " + soma);
	}

}

