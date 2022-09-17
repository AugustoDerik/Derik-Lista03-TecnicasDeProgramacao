package lista03;

import java.util.Random;
import java.util.Scanner;

public class Ex20 {

	public static int[] diferençaA(int A[], int B[]) {

		int indice = 0;
		int aux = 0;

		for (int i = 0; i < B.length; i++) {
			if (A[i] != B[i]) {
				aux++;
			}
		}

		int size = aux;

		int diferença[] = new int[size];

		for (int i = 0; i < B.length; i++) {
			if (A[i] != B[i]) {
				diferença[indice] = A[i];
				indice++;
			}
		}

		return diferença;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random qualquer = new Random();

		int vetA[] = new int[10];
		int vetB[] = new int[10];

		System.out.println("Vetor A:");
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = qualquer.nextInt(10);
			System.out.print(vetA[i] + "  ");
		}

		System.out.println();

		System.out.println("Vetor B:");
		for (int i = 0; i < vetB.length; i++) {
			vetB[i] = qualquer.nextInt(10);
			System.out.print(vetB[i] + "  ");
		}

		System.out.println();
		System.out.println("Vetor diferença:");
		for (int i = 0; i < diferençaA(vetA, vetB).length; i++) {
			System.out.print(diferençaA(vetA, vetB)[i] + "  ");
		}

		scan.close();

	}

}
