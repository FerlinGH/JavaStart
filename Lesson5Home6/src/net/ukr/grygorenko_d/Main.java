/*
 * Написать код для зеркального переворота массива (7,2,9,4) -> (4,9,2,7). -
массив может быть произвольной длинны. (При выполнении задания
использовать дополнительный массив нельзя)(1 час)
 */
package net.ukr.grygorenko_d;

public class Main {

	public static void main(String[] args) {
		int[] array = { 7, 2, 9, 4 };
		for (int i = 0; i < array.length / 2; i++) {
			array[i] = array[i] + array[(array.length) - i - 1];
			array[(array.length) - i - 1] = array[i] - array[(array.length) - i - 1];
			array[i] = array[i] - array[(array.length) - i - 1];
		}
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}
