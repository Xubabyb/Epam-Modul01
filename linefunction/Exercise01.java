package by.jonline.modul01.linefunction;

import java.util.Scanner;

// Найдите значение выражения z=((a-3)*b/2)+c

public class Exercise01 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double z;

		a = checkEnter("Введите значение a>>");
		b = checkEnter("Введите значение b>>");
		c = checkEnter("Введите значение c>>");
		z = ((a - 3) * b / 2) + c;

		System.out.println("Значение функции z = " + z);

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
