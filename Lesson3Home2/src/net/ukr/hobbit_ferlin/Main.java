package net.ukr.hobbit_ferlin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean isCorrect = false;
		int number = 0;
		Scanner scan = new Scanner(System.in);
		while (!isCorrect) {
			System.out.println("Enter the appartament's number between 1 and 144 (including):");
			number = scan.nextInt();
			if (number <= 144 && number > 0) {
				isCorrect = true;
			} else
				System.out.println("Out of boundaries, enter the correct number!");
		}
		int section = 0;
		if (number % 36 == 0) { // последн€€ квартира в подъезде?
			section = number / 36;
		} else {
			section = 1 + number / 36;
		}

		int level = 0;
		if (number % 4 == 0) { // последн€€ квартира на этаже?
			level = (number - (section - 1) * 36) / 4;
		} else {
			level = 1 + (number - (section - 1) * 36) / 4;
		}
		System.out.println("Section " + section + ", Level " + level);
		scan.close();
	}
}
