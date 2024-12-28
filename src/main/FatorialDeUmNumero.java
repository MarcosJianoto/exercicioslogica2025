package main;

public class FatorialDeUmNumero {

	public static void main(String[] args) {

		// descobrir até o n-ézimo numero.
		Long numberInteger = 33550336L;

		Long numberSum = 0L;

		while (true) {

			for (int i = 1; i < numberInteger; i++) {

				if (numberInteger % i == 0) {
					numberSum += i;
				}

			}

			if (numberSum.equals(numberInteger)) {
				System.out.println(numberInteger + " numero perfeito");
			}

			numberInteger++;
			numberSum = 0L;

		}

	}

}
