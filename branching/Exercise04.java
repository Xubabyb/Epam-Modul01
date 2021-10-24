package by.jonline.modul01.branching;

import java.util.Scanner;

/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 *  Определить, пройдет ли кирпич через отверстие.
 */

public class Exercise04 {

	public static void main(String[] args) {

		int a;
		int b;
		int x;
		int y;
		int z;

		a = checkNaturalNum("Введите значение a>>");
		b = checkNaturalNum("Введите значение b>>");
		x = checkNaturalNum("Введите значение x>>");
		y = checkNaturalNum("Введите значение y>>");
		z = checkNaturalNum("Введите значение z>>");

		if (a * b == x * y || a * b == x * z || a * b == y * z) {
			System.out.println("Будет проходить");
		} else {
			System.out.println("Не будет проходить");
		}

	}

	@SuppressWarnings("resource")
	public static int checkNaturalNum(String message) {

		int num;
		Scanner scan;
		scan = new Scanner(System.in);

		do {
			System.out.print(message);
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.println("not an integer");
				System.out.print(message);
			}
			num = scan.nextInt();
			if (num <= 0)
				System.out.println("enter number not a natural");
		} while (num <= 0);

		return num;

	}

}