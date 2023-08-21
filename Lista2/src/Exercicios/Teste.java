package Exercicios;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int TAM = 3;
		int[] vet1 = new int[TAM];
		int[] vet2 = new int[TAM];

		int comparacao1 = 0, comparacao2 = 0;
		int numeros_diferentes = 0;
		int numeros_diferentes_vet4 = 0;
		int juncao_vetores = 0;

		System.out.println("Digite os valores do vetor1: ");
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor2: ");
		for (int i = 0; i < vet1.length; i++) {
			vet2[i] = sc.nextInt();
		}

		for (int i = 0; i < TAM; i++) {

			for (int j = 0; j < TAM; j++) {
				if (vet1[i] != vet2[j]) {
					comparacao1++;
				}

				if (vet2[i] != vet1[j]) {
					comparacao2++;
				}

			}

			if (comparacao1 == TAM) {
				numeros_diferentes++;
			}

			if (comparacao2 == TAM) {
				numeros_diferentes_vet4++;
				numeros_diferentes++;
			}
			System.out.println("comparacao1" + comparacao1);
			System.out.println("comparacao2" + comparacao2);

			comparacao1 = 0;
			comparacao2 = 0;
		}
		
		System.out.println("numeros_diferentes " + numeros_diferentes );
		System.out.println("numeros_diferentes_vet4" + numeros_diferentes_vet4);
		System.out.println("comparacao1" + comparacao1);
		System.out.println("comparacao2" + comparacao2);

	}

}