package by.jonline.modul01.linefunction;

/*���� �������������� ����� R  ���� nnn.ddd (��� �������� ������� � �������
* � ����� ������). �������� ������� ������� ����� �����, � �������
* ���������� �������� �����.*/

public class Exercise04 {

	public static void main(String[] args) {
		
		double r; 
		double result;
		
		r = 444.456;
		result = (int)r/1000.0 + r*1000%1000;
		
		System.out.println(result);
	}

}
