package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int TAM = 2;
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

			if (comparacao1 == TAM ) {
				numeros_diferentes++;
			}

			if (comparacao2 == TAM) {
				numeros_diferentes_vet4++;
				numeros_diferentes++;
			}

			comparacao1 = 0;
			comparacao2 = 0;
		}

		int[] vet3 = new int[numeros_diferentes];
		int[] vet4 = new int[numeros_diferentes_vet4];

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
				vet3[i] = vet1[i];
				juncao_vetores++;

			}

			if (comparacao2 == TAM) {
				vet4[i] = vet2[i];
			}
			comparacao1 = 0;
			comparacao2 = 0;
		}

		int count = 0;
		for (int i = juncao_vetores; i < vet3.length; i++) {
			vet3[i] = vet4[count];
			count++;
		}

		System.out.println("ESTES SÃO OS VALORES QUE NÃO SE REPETEM ENTRE OS VETORES:");
		for (int i = 0; i < vet3.length; i++) {
			System.out.println(vet3[i]);
		}

	}

}

