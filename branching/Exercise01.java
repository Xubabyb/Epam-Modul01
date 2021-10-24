package by.jonline.modul01.branching;

import java.util.Scanner;

/*
 * ���� ��� ���� ������������ � ��������. ���������� ���������� ��
 * ����� �����������, � ���� ��, �� ����� �� �� �������������. 
 */

public class Exercise01 {

	public static void main(String[] args) {

		double alfa;
		double beta;
		double gamma;

		alfa = checkEnter("������� �������� (� ��������) ���� �>>");
		beta = checkEnter("������� �������� (� ��������) ���� b>>");
		gamma = 180 - alfa - beta;

		if (gamma <= 0) {

			System.out.println("������������ � ������ � = " + alfa + "; b = " + beta + "; �� ����������");

		} else {

			System.out.println("����������� ���������");
			if (alfa == 90 || beta == 90 || gamma == 90) {
				System.out.println("����������� �������������");
			} else {
				System.out.println("����������� �� �������������");
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
