/* Дан массив {0,5,2,4,7,1,3,19} - написать программу для подсчёта 
 * нечётных чисел в нём.
 */

package net.ukr.grygorenko_d;

public class Main {

	public static void main(String[] args) {
		int total = 0;
		int[] array = {0,5,2,4,7,1,3,19};
		for (int i: array){
			if (i%2>0){
				total++;
			}
		}
		System.out.println("Total count is " + total);
	}

}
