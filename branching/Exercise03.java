package by.jonline.modul01.branching;

import java.util.Scanner;

/*
 * Даны три точки А(),В() и С(). Определить
 * будут ли они расположена на одной прямой
 */

public class Exercise03 {

	public static void main(String[] args) {

		int x1, y1;
		int x2, y2;
		int x3, y3;
		double lAB;
		double lAC;
		double lBC;

		x1 = checkEnter("Введите значение абсциссы точки А x1>>");
		y1 = checkEnter("Введите значение ординаты точки А y1>>");
		x2 = checkEnter("Введите значение абсциссы точки В x2>>");
		y2 = checkEnter("Введите значение ординаты точки В y2>>");
		x3 = checkEnter("Введите значение абсциссы точки С x3>>");
		y3 = checkEnter("Введите значение ординаты точки С y3>>");
		lAB = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
		lAC = Math.sqrt(Math.pow(Math.abs(x1 - x3), 2) + Math.pow(Math.abs(y1 - y3), 2));
		lBC = Math.sqrt(Math.pow(Math.abs(x2 - x3), 2) + Math.pow(Math.abs(y2 - y3), 2));

		if (lAB + lAC == lBC || lAC + lBC == lAB || lAB + lBC == lAC) {
			System.out.println("Точки А,В и С лежат на одной прямой");
		} else {
			System.out.println("Точки А,В и С не лежат на одной прямой");

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
