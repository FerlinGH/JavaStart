package net.ukr.hobbit_ferlin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x1 = 0.0;
		double y1 = 0.0;
		double x2 = 4.0;
		double y2 = 4.0;
		double x3 = 6.0;
		double y3 = 1.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X coord of a point:");
		double x4 = scan.nextDouble();
		System.out.println("Enter Y coord of a point:");
		double y4 = scan.nextDouble();
		scan.close();

		double ab = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double ac = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double bc = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double ax = Math.sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2));
		double bx = Math.sqrt(Math.pow(x4 - x2, 2) + Math.pow(y4 - y2, 2));
		double cx = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

		double p = (ab + ac + bc) / 2;
		double s = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
		double p1 = (ab + ax + bx) / 2;
		double s1 = Math.sqrt(p1 * (p1 - ab) * (p1 - ax) * (p1 - bx));
		double p2 = (bx + cx + bc) / 2;
		double s2 = Math.sqrt(p2 * (p2 - bx) * (p2 - cx) * (p2 - bc));
		double p3 = (ax + cx + ac) / 2;
		double s3 = Math.sqrt(p3 * (p3 - ax) * (p3 - cx) * (p3 - ac));

		if (Math.abs(s - (s1 + s2 + s3)) <= Math.pow(10, -6)) {
			System.out.println("Point lies within the triangle");
		} else {
			System.out.println("Point lies otside the triangle");
		}

	}

}
