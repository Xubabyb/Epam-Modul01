package by.jonline.modul01.cycle;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Exercise01 {

	public static void main(String[] args) {

		long a;
		long summ;

		a = checkNaturalNum("Введите целое положительное число А>>");
		summ = 0;

		for (long i = 1; i < a; i++) {

			summ += i;
		}

		// Проверка переполнения значения

		if (summ > Integer.MAX_VALUE) {
			System.out.println("Переполнение памяти результат не корректен");
		} else {
			System.out.println("Сумма чисел от 1 до " + a + " = " + summ);
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
