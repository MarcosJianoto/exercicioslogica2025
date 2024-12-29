package main;

public class SomaImparesDe1a1000 {

	public static void main(String[] args) {

		Integer sumInteger = 0;

		for (int i = 0; i < 1000; i++) {
			if (i % 2 != 0) {
				sumInteger += i;
			}
		}
		System.out.println(sumInteger);

	}

}
