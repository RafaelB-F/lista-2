package Exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] lista = new int[1000];

		int i = 0, num;

		double raiz;
		int cubo;

		do {
			System.out.println("DIgite um numero inteiro positivo: ");
			num = sc.nextInt();
			if (num > 0) {
				lista[i] = num;
				i++;
			}

		} while (num > 0);

		int cabeçalho_reset = 0;
		System.out.println("VALORES RESULTANTES: ");

		for (int j = 0; j < i; j++) {
			raiz = Math.sqrt(lista[j]);
			cubo = (int) Math.pow(lista[j], 2);

			System.out.printf("%-10d %-10d %-10.2f \n", lista[j], cubo, raiz);
			cabeçalho_reset++;

			if (cabeçalho_reset == 20) {
				System.out.println(" ");
				System.out.println("VALORES RESULTANTES: ");
				System.out.println(" ");
				cabeçalho_reset = 0;
			}

		}
	}

}


