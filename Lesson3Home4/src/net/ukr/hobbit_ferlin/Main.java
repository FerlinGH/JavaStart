package net.ukr.hobbit_ferlin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean isCorrect = false;
		int number = 0;
		Scanner scan = new Scanner(System.in);
		while (!isCorrect){
			System.out.println("Enter the number between 4 and 16:");
			number = scan.nextInt();
			if (number > 4 && number < 16){
				isCorrect= true;
			} else {
				System.out.println("Out of boundaries, enter the correct number!");
			}
		}
		scan.close();
		long fact=1;
		for (int i=2;i<=number; i++){
			fact=fact*i;
		}
		System.out.println("Factorial of this number is "+ fact);
	}
}
