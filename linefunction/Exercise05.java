package by.jonline.modul01.linefunction;

import java.util.Scanner;

/*
 * ���� ����������� ����� �, ������� ������������ ������������ 
 * ���������� ������� � ��������. ������� ������ �������� ������������
 * � �����, �������, �������� � ��������� ����� ��������SS���
 */

public class Exercise05 {

	public static void main(String[] args) {

		int time;
		int hour;
		int minute;
		int second;

		time = checkNaturalNum("������� �������� ������� T>>");
		hour = time / 3600;
		minute = time % 3600 / 60;
		second = time % 3600 % 60;

		System.out.println(hour + "�" + minute + "���" + second + "���");

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
