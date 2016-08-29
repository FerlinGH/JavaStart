/*
 * Существует массив {1,2,3,4,5} — размер массива может быть
произвольным. Напишите программу которая выведет на экран все
возможные комбинации из этих цифр. Внимание повторений быть не
должно.
 */
package net.ukr.grygorenko_d;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of your sequence:");
		int size = scan.nextInt();
		int[] array = new int[size];
		array = setSequence(array, size, scan);

		long t1 = System.currentTimeMillis();

		Arrays.sort(array);
		int lowLimit = setBoundaries(array, 0);
		int highLimit = setBoundaries(array, 1);
		
		int total = 0;
		char[] ref = String.valueOf(highLimit).toCharArray();
		char[] refCopy = new char[size];
		char[] checkCopy = new char[size];
		
		for (int i = lowLimit; i <= highLimit; i++) {
			char[] check = validateNumber(size, i);
			System.arraycopy(ref, 0, refCopy, 0, ref.length);
			System.arraycopy(check, 0, checkCopy, 0, check.length);
			boolean isCombination = checkNumber(refCopy, checkCopy);
			if (isCombination) {
				for (char c : check) {
					System.out.print(c + " ");
				}
				System.out.println();
				total++;
			}
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Calculations took " + (t2 - t1) + " ms.");
		System.out.println("Total " + total + " combinations found.");
	}

	static int[] setSequence(int[] array, int size, Scanner scan) {
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element of the sequence (" + (i + 1) + " out of " + size + "):");
			array[i] = scan.nextInt();
		}
		scan.close();
		return array;
	}

	static int setBoundaries(int[] array, int revert) {
		if (revert == 0) {
			String toReturn = "";
			for (int i = 0; i < array.length; i++) {
				toReturn += array[i];
			}
			return (Integer.parseInt(toReturn));
		} else {
			for (int i = 0; i < array.length / 2; i++) {
				array[i] = array[i] + array[(array.length) - i - 1];
				array[(array.length) - i - 1] = array[i] - array[(array.length) - i - 1];
				array[i] = array[i] - array[(array.length) - i - 1];
			}
			String toReturn = "";
			for (int i = 0; i < array.length; i++) {
				toReturn += array[i];
			}
			return (Integer.parseInt(toReturn));
		}
	}

	static char[] validateNumber(int size, int number) {
		char[] first = new char[size];
		char[] second = String.valueOf(number).toCharArray();
		if (first.length > second.length) {
			for (int i = 0; i < first.length; i++) {
				first[i] = '0';
			}
			System.arraycopy(second, 0, first, first.length - second.length, second.length);
		} else {
			System.arraycopy(second, 0, first, 0, second.length);
		}
		return first;
	}

	static boolean checkNumber(char[] ref, char[] check) {
		boolean isCombination = true;
		for (int i = 0; i < check.length; i++) {
			for (int j = 0; j < ref.length; j++) {
				if (ref[i] == check[j]) {
					ref[i] = '*';
					check[j] = '*';
					break;
				} else {
					continue;
				}
			}
			if (ref[i] != '*') {
				isCombination = false;
				break;
			} else {
				continue;
			}
		}
		return isCombination;

	}

}
