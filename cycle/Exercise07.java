package by.jonline.modul01.cycle;

import java.util.Scanner;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, 
 * кроме единицы и самого числа.m и n вводятся с клавиатуры.
 */
public class Exercise07 {

	public static void main(String[] args) {

		int m;
		int n;

		m = checkNaturalNum("Введите значение m>>");
		n = checkNaturalNum("Введите значение n>>");

		for (int i = m; i <= n; i++) {

			System.out.print("\n Делители числа " + i + " : ");
			for (int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					System.out.print(j + ";");
				}
			}

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
