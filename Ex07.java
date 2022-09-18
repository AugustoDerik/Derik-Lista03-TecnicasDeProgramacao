package lista03;

import java.util.Random;

public class Ex07 {

	public static void troca(int A[], int B[]) {

		int aux = 0;

		for (int i = 0; i < B.length; i++) {
			aux = A[i];
			A[i] = B[i];
			B[i] = aux;
		}
		System.out.println();
		System.out.println("Novo vetor A:");
		for (int i = 0; i < B.length; i++) {
			System.out.print(A[i] + "  ");
		}
		System.out.println();
		System.out.println("Novo vetor B:");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + "  ");
		}
	}

	public static void main(String[] args) {

		int A[] = new int[5];
		int B[] = new int[5];

		Random qualquer = new Random();

		System.out.println("Vetor A:");
		for (int i = 0; i < B.length; i++) {
			A[i] = qualquer.nextInt(10);
			System.out.print(A[i] + "  ");
		}

		System.out.println();

		System.out.println("Vetor B:");
		for (int i = 0; i < B.length; i++) {
			B[i] = qualquer.nextInt(10);
			System.out.print(B[i] + "  ");
		}

		troca(A, B);

	}

}
