package by.jonline.modul01.cycle;

import java.util.Scanner;

/* Вычислить значения функции на отрезке [а,b] c шагом h:
 * y=x при x>2 и y=-x при x<=2
 */

public class Exercise02 {

	public static void main(String[] args) {

		int a;
		int b;
		int h;
		int y;

		a = checkEnter("Введите точку начала отрезка a>>");
		b = checkEnter("Введите точку начала отрезка b>>");
		h = checkEnter("Введите шаг h>>");

		for (int i = a; i <= b; i = i + h) {

			if (i <= 2) {
				y = -i;
				System.out.println("Значение функции при х = " + i + "; y = " + y);

			} else {
				y = i;
				System.out.println("Значение функции при х = " + i + "; y = " + y);
			}

		}
	}

	@SuppressWarnings("resource")
	public static int checkEnter(String message) {

		Scanner scan;

		scan = new Scanner(System.in);

		System.out.print(message);
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println(message);
		}

		return scan.nextInt();
	}

}
