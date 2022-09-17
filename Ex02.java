package lista03;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {

	public static int pesquisaIndice(int n, int vetor[]) {
		if (n < vetor.length) {
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[n] == vetor[i]) {
					return vetor[i - 1];
				}
			}
		}
		return -100;
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

		System.out.println("Informe o indice do valor que deseja mostrar:");
		int indice = atividade.nextInt();

		System.out.println("Valor encontrado: " + pesquisaIndice(indice, vetor));

		atividade.close();
	}

}
