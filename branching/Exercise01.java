package by.jonline.modul01.branching;

import java.util.Scanner;

/*
 * Даны два угла треугольника в градусах. Определить существует ли
 * такой треугольник, и если да, то будет ли он прямоугольным. 
 */

public class Exercise01 {

	public static void main(String[] args) {

		double alfa;
		double beta;
		double gamma;

		alfa = checkEnter("Введите значение (в градусах) угла а>>");
		beta = checkEnter("Введите значение (в градусах) угла b>>");
		gamma = 180 - alfa - beta;

		if (gamma <= 0) {

			System.out.println("Треугольника с углами а = " + alfa + "; b = " + beta + "; не существует");

		} else {

			System.out.println("Треугольник существут");
			if (alfa == 90 || beta == 90 || gamma == 90) {
				System.out.println("Треугольник прямоугольный");
			} else {
				System.out.println("Треугольник не прямоугольный");
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
