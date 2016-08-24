/*
 * Создать массив случайных чисел (размером 15 элементов). Создайте
второй массив в два раза больше, первые 15 элементов должны быть
равны элементам первого массива, а остальные элементы заполнить
удвоенных значением начальных. Например
Было → {1,4,7,2}
Стало → {1,4,7,2,2,8,14,4}
 */
package net.ukr.grygorenko_d;

public class Main {

	public static void main(String[] args) {
		int[] arrayA = new int[15];
		int[] arrayB = new int[30];

		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) (Math.random() * 100);
		}
		System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length);
		for (int i = arrayA.length; i < arrayB.length; i++) {
			arrayB[i] = arrayA[i - arrayA.length] * 2;
		}
		for (int i : arrayB) {
			System.out.print(i + " ");
		}
	}

}
