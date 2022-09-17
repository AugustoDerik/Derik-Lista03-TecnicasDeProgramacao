package lista03;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static int somatorio(int vetor[]) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++)
			soma += vetor[i];
		return soma;
	}

	public static void main(String[] args) {
		Scanner atividade = new Scanner(System.in);

		System.out.println("Qual o tamanho do vetor?");
		int tamanho = atividade.nextInt();

		Random qualquer = new Random();
		int vetor[] = new int[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = qualquer.nextInt(20);
			System.out.println(vetor[i]);
		}

		System.out.println("Soma: " + somatorio(vetor));

		atividade.close();

	}

}
