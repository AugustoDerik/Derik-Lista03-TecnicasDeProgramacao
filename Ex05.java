package lista03;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {

	public static int[] unir(int vet1[], int vet2[]) {
		System.arraycopy(vet1, 0, vet2, 0, 0);
		return vet2;
	}

	public static void main(String[] args) {
		Scanner atividade = new Scanner(System.in);

		System.out.println("Qual o tamanho do vetor?");
		int tamanho = atividade.nextInt();

		Random qualquer = new Random();
		int vetorA[] = new int[tamanho];
		int vetorB[] = new int[tamanho];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = qualquer.nextInt(20);
			System.out.println(vetorA[i]);
		}
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = qualquer.nextInt(20);
			System.out.println(vetorB[i]);
		}

		unir(vetorA, vetorB);

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i]);
		}

		atividade.close();

	}

}
