/*
 * Реализуйте метод параметрами которого являются - целое число,
вещественное число и строка. Возвращает он конкатенацию строки с
суммой вещественного и целого числа.
 */
package net.ukr.grygorenko_d;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the line of text:");
		String text = scan.nextLine();
		System.out.println("Now enter the int number:");
		int intNum = scan.nextInt();
		System.out.println("Now enter the float point number:");
		double doubleNum = scan.nextDouble();
		scan.close();
		System.out.println("Your result is:");
		System.out.println(makeLine(text, intNum, doubleNum));

	}
	
	static String makeLine(String text, int intNum, double doubleNum){
		return (text + " " + (intNum + doubleNum));
	}
	
}
