package by.jonline.modul01.cycle;

//Найти сумму квадратов первых ста чисел.

public class Exercise03 {

	public static void main(String[] args) {

		int summ;

		summ = 0;

		for (int i = 1; i <= 100; i++) {

			summ = summ + i * i;

		}
		System.out.println(summ);
	}

}
