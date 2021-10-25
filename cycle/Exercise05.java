package by.jonline.modul01.cycle;

import java.util.Scanner;

/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
 * модуль которых больше или равен заданному е. Общий член ряда имеет вид:
 * An=1/2n+1/3n;(2n,3n- два в степени n и три в степени n).
 */

public class Exercise05 {

	public static void main(String[] args) {

		int n;
		double a;
		double e;
		double summ;

		n = checkEnter("Введите количество элементов числового ряда n>>");
		e = 0.151716;
		summ = 0;

		for (int i = 0; i < n; i++) {

			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (Math.abs(a) >= e) {
				summ += a;
			}
		}

		if (summ != 0) {
			System.out.println("Сумма членов ряда модуль которых >=" + e + " равна " + summ);
		} else {
			System.out.println("В ряду нет членов модуль которых >=" + e);
		}
	}

	@SuppressWarnings("resource")
	public static int checkEnter(String message) {

		Scanner scan;
		scan = new Scanner(System.in);

		System.out.print(message);
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}
		return scan.nextInt();
	}
}
