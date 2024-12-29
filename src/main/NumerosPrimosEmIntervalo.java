package main;

public class NumerosPrimosEmIntervalo {

	public static void main(String[] args) {

		Integer number1 = 1;
		Integer number2 = 10000000;

		for (int i = number1; i < number2; i++) {

			if (i == 2 || i == 3 || i == 5 || i == 7) {
				System.out.println(i);
			} else if (i != 1 && i > 5) {

				if (i % 2 != 0) {

					if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {

						System.out.println(i);

					}
				}

			}
		}

	}

}
