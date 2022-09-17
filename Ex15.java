package lista03;

import java.util.Random;
import java.util.Scanner;

public class Ex15 {

	public static int[] complemento(int vetA[], int vetB[], int n) {
		int vetComplemento[] = new int[n];
		for (int i = 0; i < vetComplemento.length; i++) {
			vetComplemento[i] = 10 - (vetA[i] + vetB[i]);
		}
		return vetComplemento;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o tamanho dos vetores:");
		int size = teclado.nextInt();

		Random qualquer = new Random();
		int vetorA[] = new int[size];
		int vetorB[] = new int[size];

		System.out.println("Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = qualquer.nextInt(5);
			System.out.println(vetorA[i]);
		}

		System.out.println("Vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = qualquer.nextInt(5);
			System.out.println(vetorB[i]);
		}

		System.out.println("Vetor complemento:");
		for (int i = 0; i < size; i++) {
			System.out.println(complemento(vetorA, vetorB, size)[i]);
		}

		teclado.close();
	}

}
