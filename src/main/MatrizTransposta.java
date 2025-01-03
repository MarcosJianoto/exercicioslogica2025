package main;

public class MatrizTransposta {

	public static void main(String[] args) {

		Integer aInteger = 2;
		Integer bInteger = 3;
		Integer tamanhoInteger = aInteger * bInteger;

		Integer[][] matriz1 = new Integer[aInteger][bInteger];
		Integer[][] matriz2 = new Integer[bInteger][aInteger];

		Integer tempInteger = 1;
		for (int i = 0; i < aInteger; i++) {
			for (int j = 0; j < bInteger; j++) {
				matriz1[i][j] = tempInteger;
				tempInteger++;
			}
		}

		for (int i = 0; i < aInteger; i++) {
			for (int j = 0; j < bInteger; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < bInteger; i++) {
			for (int j = 0; j < aInteger; j++) {
				System.out.print(matriz1[j][i] + " ");
			}
			System.out.println();
		}

		int[][] matrizValores = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	}

}
