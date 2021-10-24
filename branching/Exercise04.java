package by.jonline.modul01.branching;

import java.util.Scanner;

/*
 * ������ ��������� �,� �������������� ���������
 * � ������� x,y,z �������. ���������� ������� ��
 * ������ ����� ���������.
 */

public class Exercise04 {

	public static void main(String[] args) {

		int a;
		int b;
		int x;
		int y;
		int z;

		a = checkNaturalNum("������� �������� a>>");
		b = checkNaturalNum("������� �������� b>>");
		x = checkNaturalNum("������� �������� x>>");
		y = checkNaturalNum("������� �������� y>>");
		z = checkNaturalNum("������� �������� z>>");

		if (a * b == x * y || a * b == x * z || a * b == y * z) {
			System.out.println("������ �������");
		} else {
			System.out.println("������ �� �������");
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