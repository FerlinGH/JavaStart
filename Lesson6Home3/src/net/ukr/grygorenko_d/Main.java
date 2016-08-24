/*
 * –еализуйте метод рисующий на экране пр€моугольник из звездочек Ђ*ї
Ч его параметрами будут целые числа которые описывают длину и
ширину такого пр€моугольника.
 */
package net.ukr.grygorenko_d;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of a figure:");
		int length = scan.nextInt();
		System.out.println("Now enter the heigth of a figure:");
		int heigth = scan.nextInt();
		scan.close();
		drawFigure(length,heigth);
	}
	
	static void drawFigure(int length, int heigth){
		for (int i = 0; i < heigth; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
				
	}
			
	}


