package by.jonline.modul01.cycle;

/*
 * Вывести на экран соответствий между символами и их численными 
 *  обозначениями в памяти компьютера.
 */

public class Exercise06 {

	public static void main(String[] args) {

		for (int i = 32; i < 127; i++) {
			System.out.println((char) i + " - " + i);
		}

	}

}
