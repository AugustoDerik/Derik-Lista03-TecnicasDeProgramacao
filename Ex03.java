package lista03;

import java.util.Scanner;

public class Ex03 {

	

	public static void main(String[] args) {
		Scanner atividade = new Scanner(System.in);

		System.out.println("Informe o tamanho do vetor:");
		int tamanho = atividade.nextInt();

		int vetorTotal[] = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vetorTotal[i] = atividade.nextInt();
			System.out.println(vetorTotal[i]);
		}

	}

}
