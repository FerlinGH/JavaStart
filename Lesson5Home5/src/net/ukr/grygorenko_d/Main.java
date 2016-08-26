/*
 * «Перевернуть массив» (При выполнении задания использовать
дополнительный массив нельзя) - (3 часа)
 */
package net.ukr.grygorenko_d;

public class Main {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				array[i][j] = array[i][j] + array[j][i];
				array[j][i] = array[i][j] - array[j][i];
				array[i][j] = array[i][j] - array[j][i];
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
