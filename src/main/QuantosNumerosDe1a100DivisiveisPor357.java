package main;

public class QuantosNumerosDe1a100DivisiveisPor357 {

	public static void main(String[] args) {

		System.out.println("divisível por 3");
		Integer numberDivisivelPor3 = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
				numberDivisivelPor3++;
			}
		}
		System.out.println();
		System.out.println("Quantidade numeros divisivel por 3: " + numberDivisivelPor3);

		System.out.println();
		System.out.println();

		System.out.println("divisível por 5");
		Integer numberDivisivelPor5 = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
				numberDivisivelPor5++;
			}
		}
		System.out.println();
		System.out.println("Quantidade numeros divisivel por 5: " + numberDivisivelPor5);

		System.out.println();
		System.out.println();

		System.out.println("divisível por 7");

		Integer numberDivisivelPor7 = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
				numberDivisivelPor7++;
			}
		}
		System.out.println();
		System.out.println("Quantidade numeros divisivel por 7: " + numberDivisivelPor7);
	}

}
