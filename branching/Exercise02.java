package by.jonline.modul01.branching;

import java.util.Scanner;

// ����� max{ min(a,b), min(c,d)}

public class Exercise02 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;
		double tempMin_1;
		double tempMin_2;

		a = checkEnter("������� �������� a>>");
		b = checkEnter("������� �������� b>>");
		c = checkEnter("������� �������� c>>");
		d = checkEnter("������� �������� d>>");

		if (a < b) {
			tempMin_1 = a;
		} else {
			tempMin_1 = b;
		}

		if (c < d) {
			tempMin_2 = c;
		} else {
			tempMin_2 = d;
		}

		if (tempMin_1 > tempMin_2) {
			System.out.println("������������ �� ����������� �������� ����� : " + tempMin_1);
		} else {
			System.out.println("������������ �� ����������� �������� ����� : " + tempMin_2);
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
