package lista03;

import java.util.Random;

public class Ex06 {

	public static int[] inverter(int vet[], int x) {

		int aux = 0;

		int j = x - 1;

		for (int i = 0; i < (x / 2); i++, j--) {
			aux = vet[i];
			vet[i] = vet[j];
			vet[j] = aux;
		}

		return vet;
	}

	public static void main(String[] args) {

		int vetor[] = new int[10];

		Random qualquer = new Random();

		System.out.println("Vetor normal:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = qualquer.nextInt(10);
			System.out.print(vetor[i] + "  ");
		}

		System.out.println();

		System.out.println("Vetor invertido:");
		for (int i : inverter(vetor, 10)) {
			System.out.print(i + "  ");
		}
	}

}
