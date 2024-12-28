package main;

public class NumeroPerfeitoNvalue {

	public static void main(String[] args) {

		Integer number = 10;
		Integer numberAlter = number;
		Integer soma = 0;
		Integer valueInteger = 0;

		for (int i = number; i > 1; i--) {

			soma = i - 1;

			if (i == number) {
				valueInteger += numberAlter * soma;
			} else {
				valueInteger += valueInteger * (soma - 1);
			}
		}

		System.out.println(valueInteger);

	}

}
