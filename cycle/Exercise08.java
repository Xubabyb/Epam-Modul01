package by.jonline.modul01.cycle;

import java.util.Scanner;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 

public class Exercise08 {

	public static void main(String[] args) {

		int a;
		int b;
		String aStr;
		String bStr;
		String new_aStr;
		String new_bStr;

		a = checkEnter("Введите первое число a>>");
		b = checkEnter("Введите первое число b>>");

		aStr = String.valueOf(a);
		bStr = String.valueOf(b);

		new_aStr = "";
		new_bStr = "";

		// Убираем из каждой строки повторяющиеся элементы

		for (int i = 0; i < aStr.length(); i++) {
			if (!new_aStr.contains(aStr.charAt(i) + "")) {
				new_aStr += aStr.charAt(i);
			}
		}

		for (int i = 0; i < bStr.length(); i++) {
			if (!new_bStr.contains(bStr.charAt(i) + "")) {
				new_bStr += bStr.charAt(i);
			}
		}

		// Сравниваем элементы каждой строки

		System.out.print("Цифры входящие в оба числа - ");

		for (int i = 0; i < new_aStr.length(); i++) {

			for (int j = 0; j < new_bStr.length(); j++) {

				if (new_aStr.charAt(i) == new_bStr.charAt(j)) {

					System.out.print(new_aStr.charAt(i) + ";");
				}
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
			System.out.print(message);
		}

		return scan.nextInt();
	}
}
