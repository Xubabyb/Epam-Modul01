package by.jonline.modul01.linefunction;

import java.util.Scanner;

//Найти значение выражения (sinx+cosy)/(cosx-siny)*tgxy

public class Exercise03 {

	public static void main(String[] args) {

		double x;
		double y;
		double result;

		x = checkEnter("Введите значение x>>");
		y = checkEnter("Введите значение y>>");
		result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

		System.out.println("Значение выражения = " + result);

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
