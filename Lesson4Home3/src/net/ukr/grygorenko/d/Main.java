package net.ukr.grygorenko.d;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height of a figure:");
		int height = scan.nextInt();
		scan.close();
		boolean isComplete = false;
		int row = 1;
		int pos = 1;

		while (!isComplete) {
			if (row <= height) {
				if (pos <= row) {
					System.out.print("* ");
					pos++;
					continue;
				} else {
					System.out.println();
					pos = 1;
					row++;
					continue;
					}
			} else if (row <= 2 * height - 1) {
				if (pos <= 2 * height - row) {
					System.out.print("* ");
					pos++;
					continue;
				} else {
					System.out.println();
					pos = 1;
					row++;
				}
			} else {
				isComplete = true;
			}
		}
	}
}
