package net.ukr.hobbit_ferlin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x1 = 0;
		double y1 = 0;
		double rad = 4.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X coord of a point:");
		double x2 = scan.nextDouble();
		System.out.println("Enter Y coord of a point:");
		double y2 = scan.nextDouble();
		scan.close();
		double dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		if (dist <= rad) {
			System.out.println("This point lies within the circle");
		} else {
			System.out.println("This point lies outside the circle");
		}
	}

}
