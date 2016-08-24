/*
 * ¬ведите строку текста с клавиатуры Ч реализуйте программу дл€
возможности подсчета количества символа Ч 'b' в этой строке, с выводом
результат на экран.
 */
package net.ukr.grygorenko_d;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text;
		int count = 0;
		System.out.println("Enter the line of text and press ENTER.");
		text = scan.nextLine();
		scan.close();
		text.toLowerCase();
		char[] line = text.toCharArray();
		for (char b : line) {
			if (b == 'b') {
				count++;
			}
		}
		System.out.println("Character 'b' : " + count + " time(s)");
	}

}
