package lista03;

import java.util.Random;

public class Ex10 {
	
	public static int [] contadorZeroUm(int vetor[]) {
		
		int saida[] = new int [vetor.length *2];
		
		saida[0]=vetor[0];
		
		
		
		return saida;
		
		
	}

	public static void main(String[] args) {
		
		Random qualquer = new Random();
		int vetor[] = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = qualquer.nextInt(2);
			System.out.println(vetor[i]);
		}
		
		for (int numero : vetor) {
			System.out.println(numero);
		}
		
	}

}
