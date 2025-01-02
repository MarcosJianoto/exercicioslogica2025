package main;

public class MDCDeDoisNumeros {

	public static void main(String[] args) {

		Integer N = 1000;
		Integer sumTotal = 0;

		for (int i = 1; i < N; i++) {
			if (i % 3 == 0) {
				sumTotal += i;
				System.out.println(i);
			}
			if (i % 5 == 0 && i % 3 != 0) {
				sumTotal += i;
				System.out.println(i);
			}
		}

		System.out.println(sumTotal);

	}

}
