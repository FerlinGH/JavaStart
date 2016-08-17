package net.ukr.hobbit_ferlin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many columns?");
		int number = scan.nextInt();
		scan.close();
		for (int rows = 1; rows <= 5; rows++) {
			for (int column = 1; column <= number; column++) {
				int marker = column%2;				// чётный или нечётный рулон?
				switch(marker){
					case 0:
						if(column != number){		// не последний рулон?
							System.out.print("+++");
						} else{
							System.out.println("+++");
						}
						break;
					case 1:
						if(column != number){		//не последний рулон?
							System.out.print("***");
						} else{
							System.out.println("***");
						}
						break;
				}
			}
		}

	}
}