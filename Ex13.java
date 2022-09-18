package lista03;

import java.util.Scanner;

public class Ex13 {

	public static void descriptografar(String frase) {

		String segredo[] = new String[frase.length()];

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == '%')
				segredo[i] = "a";
			else if (frase.charAt(i) == '*')
				segredo[i] = "b";
			else if (frase.charAt(i) == '(')
				segredo[i] = "c";
			else if (frase.charAt(i) == '-')
				segredo[i] = "d";
			else if (frase.charAt(i) == '+')
				segredo[i] = "e";
			else if (frase.charAt(i) == '@')
				segredo[i] = "f";
			else if (frase.charAt(i) == '#')
				segredo[i] = "g";
			else if (frase.charAt(i) == '1')
				segredo[i] = "h";
			else if (frase.charAt(i) == '2')
				segredo[i] = "i";
			else if (frase.charAt(i) == '3')
				segredo[i] = "j";
			else if (frase.charAt(i) == '0')
				segredo[i] = " ";
			else if (frase.charAt(i) == '4')
				segredo[i] = "l";
			else if (frase.charAt(i) == '5')
				segredo[i] = "m";
			else if (frase.charAt(i) == '6')
				segredo[i] = "n";
			else if (frase.charAt(i) == '7')
				segredo[i] = "o";
			else if (frase.charAt(i) == '8')
				segredo[i] = "p";
			else if (frase.charAt(i) == '9')
				segredo[i] = "q";
			else if (frase.charAt(i) == '{')
				segredo[i] = "r";
			else if (frase.charAt(i) == '}')
				segredo[i] = "s";
			else if (frase.charAt(i) == '!')
				segredo[i] = "t";
			else if (frase.charAt(i) == '&')
				segredo[i] = "u";
			else if (frase.charAt(i) == '$')
				segredo[i] = "v";
			else if (frase.charAt(i) == '?')
				segredo[i] = "x";
			else if (frase.charAt(i) == ':')
				segredo[i] = "z";
		}

		for (int j = 0; j < frase.length(); j++)
			System.out.print(segredo[j]);
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		System.out.println("Digite uma frase a ser descriptografada:");
		frase = teclado.nextLine();

		descriptografar(frase);

		teclado.close();

	}

}
