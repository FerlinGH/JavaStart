package net.ukr.hobbit_ferlin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please enter four nubmers:");
		Scanner scan = new Scanner(System.in);
		double max = scan.nextDouble();
		for(int i =1; i<4; i++){
			double newNumber = scan.nextDouble();
			if (newNumber > max){
				max = newNumber;
			}
		}
		scan.close();
		System.out.println("Max number is " + max);
	}
}
