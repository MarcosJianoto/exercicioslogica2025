package main;

public class ProdutoEscalarVetores {

	public static void main(String[] args) {

		int sizeVects = 3;

		Integer[] vect1 = new Integer[sizeVects];
		Integer[] vect2 = new Integer[sizeVects];

		for (int i = 0; i < sizeVects; i++) {
			vect1[0] = 1;
			vect1[1] = 2;
			vect1[2] = 3;
			vect2[0] = 4;
			vect2[1] = 5;
			vect2[2] = 6;
		}

		Integer sumInteger = 0;

		for (int i = 0; i < sizeVects; i++) {
			Integer tempInteger = vect1[i] * vect2[i];
			sumInteger += tempInteger;
		}

		System.out.println(sumInteger);

	}

}
