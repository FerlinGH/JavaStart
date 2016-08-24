/*
 * Напишите метод который реализует линейный поиск элемента в массиве
целых чисел. Если такой элемент в массиве есть то верните его индекс,
если нет то метод должен возвращать число - «-1»
 */
package net.ukr.grygorenko_d;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Creating an array... ");
		int[] array = new int[50];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println("done!");
		System.out.println("What number should we look for? (enter number from 0 to 100)");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		System.out.print("Searching through the array... ");
		int index = getIndex(array, num);
		if (index == -1) {
			System.out.println("error! Element not found (-1)");
			displayArray(array);
		} else {
			System.out.println("done! Element was found in cell " + (index + 1));
			displayArray(array);
		}
	}

	static int getIndex(int[] array, int num) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				index = i;
			}
		}
		return index;
	}

	static void displayArray(int[] array) {
		System.out.println("This is your array:");
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
