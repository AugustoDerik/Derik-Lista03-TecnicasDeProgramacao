package lista03;

import java.util.Scanner;

public class Ex01 {

	public static int pesquisar(int n, int vetor[]) {

		for (int i = 0; i < 10; i++) {
			if (n == vetor[i]) {
				return i + 1;
			}
		}
		return -100;
	}

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[10];

		System.out.println("Informe o vetor:");

		for (int i = 0; i < 10; i++) {
			vetor[i] = ler.nextInt();
		}

		System.out.println("Diga o numero que quer procurar:");
		int numero = ler.nextInt();

		System.out.println("encontrou na posição " + pesquisar(numero, vetor));
		
		ler.close();
	}

}
