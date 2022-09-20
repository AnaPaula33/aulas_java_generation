package aulas_java;

import java.util.Scanner;


public class LaçosDeRepetiçãoEx1For {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;

		for (i = 1000; i < 2000; i++) {
			if (i % 11 == 5) {
				System.out.println("numeros: " + i);
			}
		}
	}

}


