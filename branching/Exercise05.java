package by.jonline.modul01.branching;

import java.util.Scanner;

/*
 * Вычислить значение функции: F(x)  при x>3 � x<=3 
 */

public class Exercise05 {

	public static void main(String[] args) {

		double x;
		double fx;

		x = checkEnter("Введите значение x>>");

		if (x > 3) {
			fx = 1 / (Math.pow(x, 3) + 6);
		} else {
			fx = x * x - 3 * x + 9;
		}

		System.out.println("При х = " + x + ", значение функции будет F(x) = " + fx);
	}

	@SuppressWarnings("resource")
	public static double checkEnter(String message) {

		Scanner scan;
		scan = new Scanner(System.in);

		System.out.print(message);
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.println(message);
		}

		return scan.nextDouble();
	}
}
