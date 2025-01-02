package main;

public class SomaImparesDe1a1000 {

	public static void main(String[] args) {

		String numberString = "555";
		Integer[] arraynumero = new Integer[numberString.length()];

		for (int i = 0; i < numberString.length(); i++) {
			arraynumero[i] = Character.getNumericValue(numberString.charAt(i));
		}

		
		Integer sum = 0;

		for (Integer numInteger : arraynumero) {
			sum+= numInteger;
		}
		
		System.out.println(sum);
		

	}
}
