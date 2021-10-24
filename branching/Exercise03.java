package by.jonline.modul01.branching;

import java.util.Scanner;

/*
Даны три точки A(x1,y1),B(x2,y2),C(x3,y3). Определить будут ли они лежать на одной прямой.
 */

public class Exercise03 {

	public static void main(String[] args) {

		int x1, y1;
		int x2, y2;
		int x3, y3;
		double lAB;
		double lAC;
		double lBC;

		x1 = checkEnter("Введите абсциссу точки А x1>>");
		y1 = checkEnter("Введите ординату точки А y1>>");
		x2 = checkEnter("Введите абсциссу точки В x2>>");
		y2 = checkEnter("Введите ординату точки В y2>>");
		x3 = checkEnter("Введите абсциссу точки С x3>>");
		y3 = checkEnter("Введите ординату точки С y3>>");
		lAB = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
		lAC = Math.sqrt(Math.pow(Math.abs(x1 - x3), 2) + Math.pow(Math.abs(y1 - y3), 2));
		lBC = Math.sqrt(Math.pow(Math.abs(x2 - x3), 2) + Math.pow(Math.abs(y2 - y3), 2));

		if (lAB + lAC == lBC || lAC + lBC == lAB || lAB + lBC == lAC) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки не лежат на одной прямой");

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
