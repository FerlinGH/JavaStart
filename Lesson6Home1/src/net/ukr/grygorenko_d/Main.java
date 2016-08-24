/*
 * Напишите метод который вернет максимальное число из массива целых
чисел.
 */
package net.ukr.grygorenko_d;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println("Initial array is:");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Max number is " + getMax(array));
	}

	static int getMax(int[] array) {
		int max = 0;
		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

}
