package main;

public class Palindromo {

	public static void main(String[] args) {

		String palavraPalindromoSemFormatacao = "Marcos";
		String palavraPalindromo = palavraPalindromoSemFormatacao.toLowerCase();
		String palavraInvertida = "";
		
		for (int i = palavraPalindromo.length() - 1; i >= 0; i--) {
			palavraInvertida += palavraPalindromo.charAt(i);
		}
				
		int sum = 0;
		for (int i = 0; i < palavraPalindromo.length(); i++) {
			if (Character.toString(palavraPalindromo.charAt(i))
					.equals(Character.toString(palavraInvertida.charAt(i)))) {
				sum++;
			}
		}
		


		if (sum == palavraPalindromo.length()) {
			System.out.println("palindromo");
		} else {
			System.out.println("não é um palindromo");
		}
		System.out.println(sum);
		System.out.println(palavraPalindromo.length());

	}

}
