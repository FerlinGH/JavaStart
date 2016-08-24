/*
 * Напишите метод который вернет количество слов в строке текста.
 */
package net.ukr.grygorenko_d;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the line of text:");
		String text = scan.nextLine();
		scan.close();
		countWords(text);
	}
	
	static void countWords(String text){
		String[] textArray = text.split("[ ]");
		System.out.println("There are " + textArray.length + " words in this line.");
	}
}
