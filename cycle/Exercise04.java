package by.jonline.modul01.cycle;

import java.math.BigInteger;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Exercise04 {

	public static void main(String[] args) {

		BigInteger result;
		int i;

		result = BigInteger.valueOf(1);
		i = 1;

		while (i <= 200) {

			result = result.multiply(BigInteger.valueOf(i * i));
			i++;
		}
		System.out.println(result);
	}

}
