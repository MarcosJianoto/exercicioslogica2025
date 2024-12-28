package main;

public class SequenciaDeFibonacci {

	public static void main(String[] args) {

		Integer nInteger = 11;
		Integer fibonacc = 0;
		Integer fibo0 = 0;
		Integer fibo1 = 1;

		for (int i = 1; i < nInteger; i++) {

			if (i == 1) {
				System.out.println(fibo0);
			} else if (i == 2) {
				System.out.println(fibo1);
			} else {
				fibonacc = fibo0 + fibo1;
				fibo0 = fibo1;
				fibo1 = fibonacc;
				System.out.println(fibonacc);

			}

		}

	}

}
