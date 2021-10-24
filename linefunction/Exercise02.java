package by.jonline.modul01.linefunction;

import java.util.Scanner;

// Найти значение выражения 

public class Exercise02 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double result;

		a = checkEnter("Введите значение a>>");
		b = checkEnter("Введите значение b>>");
		c = checkEnter("Введите значение c>>");

		result = Math.sqrt(b * b + 4 * a * c);

		if (result < 0) {
			System.out.println("Значение выражения не действительное число");
		}

		else {
			result = (b + result) / (2 * a) - Math.pow(a, 3) * c + 1 / Math.pow(b, 2);
			System.out.println("Значение выражения  = " + " " + result);
		}

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
