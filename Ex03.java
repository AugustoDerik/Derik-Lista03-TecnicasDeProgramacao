package lista03;

import java.util.Random;

public class Ex03 {

	public static int[] PosNeg(int array[]) {

		int aux = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}

		return array;
	}

	public static void main(String[] args) {

		Random random1 = new Random();
		Random random2 = new Random();

		int vetor[] = new int[12];

		System.out.println("Vetor inicial:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random1.nextInt(10) - random2.nextInt(10);
			System.out.print(vetor[i] + " ");
		}

		System.out.println();
		System.out.println("Vetor em ordem crescente:");
		for (int i = 0; i < PosNeg(vetor).length; i++) {
			System.out.print(PosNeg(vetor)[i] + "  ");
		}

	}

}
