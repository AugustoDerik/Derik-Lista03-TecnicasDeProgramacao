package lista03;

import java.util.Random;

public class Ex16 {

	public static int[] polarizar(int array[]) {

		int aux = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] % 2 == 0) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}

		return array;
	}

	public static void main(String[] args) {

		System.out.println("Vetor inicial:");

		Random qualquer = new Random();
		int vetor[] = new int[12];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = qualquer.nextInt(10);
			System.out.print(vetor[i] + "  ");
		}
		System.out.println();
		System.out.println("Vetor polarizado:");
		for (int i = 0; i < polarizar(vetor).length; i++) {
			System.out.print(polarizar(vetor)[i] + "  ");
		}

	}

}
