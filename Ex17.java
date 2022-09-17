package lista03;

import java.util.Scanner;

public class Ex17 {

	public static int[] explosao(int vetor[]) {

		int size = 0;
		int auxiliar = 0;
		int indice = 0;

		for (int i = 0; i < vetor.length; i++) {
			size += vetor[i];
		}

		int resultado[] = new int[size];

		for (int i = 0; i < vetor.length; i++) {
			for (auxiliar = 0; auxiliar < vetor[i]; auxiliar++, indice++) {
				resultado[indice] = vetor[i];
			}
		}

		return resultado;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Preencha o vetor:");

		int vetor[] = new int[5];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Posição " + i + ": ");
			vetor[i] = entrada.nextInt();
		}

		System.out.println("Vetor resultante:");

		for (int i = 0; i < explosao(vetor).length; i++) {
			System.out.println(explosao(vetor)[i]);
		}

		entrada.close();

	}

}
