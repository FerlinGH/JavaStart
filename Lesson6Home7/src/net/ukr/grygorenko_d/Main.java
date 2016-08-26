/*
 * Число-палиндром с обеих сторон (справа налево и слева направо)
читается одинаково. Самое большое число-палиндром, полученное
умножением двух двузначных чисел – 9009 = 91 × 99.
Найдите самый большой палиндром, полученный умножением двух
трехзначных чисел.
 */
package net.ukr.grygorenko_d;

public class Main {

	public static void main(String[] args) {
		int maxPalindrome = 1;
		int palNum1 = 1;
		int palNum2 = 1;
		int totalPal = 0;
		boolean isPalindrome = false;
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				isPalindrome = checkPalindrome(i, j);
				if (isPalindrome) {
					totalPal++;
					if (i * j > maxPalindrome) {
						maxPalindrome = i * j;
						palNum1 = i;
						palNum2 = j;
					}
					isPalindrome = false;
				}
			}
		}
		System.out.println("Total " + totalPal + " palindroms were found. Max palindrome is:");
		System.out.println(palNum1 + " X " + palNum2 + " = " + palNum1 * palNum2);
	}

	static boolean checkPalindrome(int i, int j) {
		char[] chars = String.valueOf(i * j).toCharArray();
		boolean isPalindrome = true;
		for (int k = 0; k <= (chars.length) / 2; k++) {
			if (chars[k] == chars[chars.length - 1 - k]) {
				continue;
			} else {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

}
