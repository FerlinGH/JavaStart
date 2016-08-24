/*Ќаписать код дл€ возможности создани€ массива целых чисел (размер
вводитьс€ с клавиатуры) и возможности заполнени€ каждого его элемента
вручную. ¬ыведите этот массив на экран. 
 */
package net.ukr.grygoreko_d;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = scan.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter  element of aray (" + (i + 1) + " out of " + size + "):");
			array[i] = scan.nextInt();
		}
		System.out.println("This is your array:");
		for (int i : array) {
			System.out.print(i + "  ");
		}
		scan.close();
	}
}
