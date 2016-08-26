/*
 * Существуют такие последовательности чисел
0,2,4,6,8,10,12
1,4,7,10,13
1,2,4,8,16,32
1,3,9,27
1,4,9,16,25
1,8,27,64,125
Реализуйте программу которая выведет следующий член этой
последовательности (либо подобной им). Например пользователь вводит
строку 0,2,4,6,8,10,12 ответом программы должно быть число 14.
 */
package net.ukr.grygorenko_d;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		array = setSequence(array, scan);
		int checkLaw = 0;
		int lawValue = 0;
		lawValue = detectLaw(array, lawValue, checkLaw);
		switch (lawValue){
		case 1:
			runLaw1(array);
			break;
		case 2:
			runLaw2(array);
			break;
		case 3:
			runLaw3(array);
			break;
		default:
			System.out.println("Wrong sequence!");
			break;
		}
			
	}

	static int[] setSequence(int[] array, Scanner scan) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter element of the sequence (" + (i + 1) + " out of 5):");
			array[i] = scan.nextInt();
		}
		scan.close();
		return array;
	}

	static void showSequence(int[] array) {
		System.out.println("This is your sequence: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(array[i] + " ");
		}
	}

	static int detectLaw(int[] array, int lawValue, int checkLaw) {
		if ((array[1] - array[0] == array[2] - array[1]) && (array[2] - array[1] == array[3] - array[2])) {
			checkLaw=array[3] + (array[1] - array[0]);
			if (checkLaw == array[4]){
				return 1;
			}else{
				return 0;
			}
		} else if ((array[1] / array[0] == array[2] / array[1]) && (array[2] / array[1] == array[3] / array[2])) {
			checkLaw=array[3] * (array[1] / array[0]);
			if (checkLaw == array[4]){
				return 2;
			}else{
				return 0;
			}
		} else {
			double pow = (Math.log(array[1])/Math.log(2));
			if ((Math.pow(3, pow) == array[2]) && (Math.pow(4, pow)== array[3])){
				if ((array[0]==1) && (Math.pow(5, pow) == array[4])){
					return 3;
				} else {
					return 0;
				}
			}else {
				return 0;
			}
		}
	}
	
	static void runLaw1(int[] array){
		int argument = array[1] - array[0];
		showSequence(array);
		System.out.print( "   - next element is " + (array[4] + argument));
	}
	
	static void runLaw2(int[] array){
		int argument = array[1] / array[0];
		showSequence(array);
		System.out.print( "   - next element is " + (array[4] * argument));
	}
	
	static void runLaw3(int[] array){
		double argument = Math.log(array[1])/Math.log(2);
		showSequence(array);
		System.out.print( "   - next element is " + Math.pow(6, argument));
	}

}
