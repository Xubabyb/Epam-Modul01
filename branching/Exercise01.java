package by.jonline.modul01.branching;

import java.util.Scanner;

/*
 Даны два угла (в градусах) треугольника Определить, существует ли такой треугольник, 
 и если да, то будет ли он прямоугольным.
 */

public class Exercise01 {

	public static void main(String[] args) {

		double alfa;
		double beta;
		double gamma;

		alfa = checkEnter("Введите первое значение угла в градусах а>>");
		beta = checkEnter("Введите второе значение угла в градусах  b>>");
		gamma = 180 - alfa - beta;

		if (gamma <= 0) {

			System.out.println("С углами а = " + alfa + "; b = " + beta + 
					"; треугольник не существует");

		} else {

			System.out.println("Треугольник существует");
			if (alfa == 90 || beta == 90 || gamma == 90) {
				System.out.println("Он прямоугольный");
			} else {
				System.out.println("Он не прямоугольный");
			}

		}

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
