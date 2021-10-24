package by.jonline.modul01.linefunction;

import java.util.Scanner;

/*
 * ƒл€ области составить пргорамму, котора€ печатает  true если точка
 * с координатами (x,y) принадлежит закрашенной области или
 * false в противном случае
 */
public class Exercise06 {

	public static void main(String[] args) {

		double x;
		double y;
		boolean check;

		x = checkEnter("¬ведите значение x>>");
		y = checkEnter("¬ведите значение y>>");
		check = y > 0 & x > 0 & x < 2 & y < 4 || y > 0 & x < 0 & y < 4 & x > -2 || y < 0 & x < 0 & x > -4 & y > -2
				|| x > 0 & y < 0 & x < 4 & y > -2;

		System.out.println(check);

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
