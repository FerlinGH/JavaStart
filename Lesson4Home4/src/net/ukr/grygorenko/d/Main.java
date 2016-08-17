package net.ukr.grygorenko.d;

public class Main {

	public static void main(String[] args) {
		boolean isSimple;
		System.out.print(1 + "  ");
		for (int i = 2; i <= 100; i++) {
			isSimple = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isSimple = false;
					break;
				}

			}
			if (isSimple == true) {
				System.out.print(i + "  ");
			}
		}
	}
}
