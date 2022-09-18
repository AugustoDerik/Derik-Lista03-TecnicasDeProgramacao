package lista03;

import java.util.Scanner;

public class Ex12 {

	public static void criptografar(String frase) {

		String segredo[] = new String[frase.length()];

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a')
				segredo[i] = "%";
			else if (frase.charAt(i) == 'b')
				segredo[i] = "*";
			else if (frase.charAt(i) == 'c')
				segredo[i] = "(";
			else if (frase.charAt(i) == 'd')
				segredo[i] = "-";
			else if (frase.charAt(i) == 'e')
				segredo[i] = "+";
			else if (frase.charAt(i) == 'f')
				segredo[i] = "@";
			else if (frase.charAt(i) == 'g')
				segredo[i] = "#";
			else if (frase.charAt(i) == 'h')
				segredo[i] = "1";
			else if (frase.charAt(i) == 'i')
				segredo[i] = "2";
			else if (frase.charAt(i) == 'j')
				segredo[i] = "3";
			else if (frase.charAt(i) == ' ')
				segredo[i] = "0";
			else if (frase.charAt(i) == 'l')
				segredo[i] = "4";
			else if (frase.charAt(i) == 'm')
				segredo[i] = "5";
			else if (frase.charAt(i) == 'n')
				segredo[i] = "6";
			else if (frase.charAt(i) == 'o')
				segredo[i] = "7";
			else if (frase.charAt(i) == 'p')
				segredo[i] = "8";
			else if (frase.charAt(i) == 'q')
				segredo[i] = "9";
			else if (frase.charAt(i) == 'r')
				segredo[i] = "{";
			else if (frase.charAt(i) == 's')
				segredo[i] = "}";
			else if (frase.charAt(i) == 't')
				segredo[i] = "!";
			else if (frase.charAt(i) == 'u')
				segredo[i] = "&";
			else if (frase.charAt(i) == 'v')
				segredo[i] = "$";
			else if (frase.charAt(i) == 'x')
				segredo[i] = "?";
			else if (frase.charAt(i) == 'z')
				segredo[i] = ":";
		}

		for (int j = 0; j < frase.length(); j++)
			System.out.print(segredo[j]);
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		System.out.println("Digite uma frase a ser criptografada:");
		frase = teclado.nextLine();

		criptografar(frase);

		teclado.close();

	}

}
