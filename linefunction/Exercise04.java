package by.jonline.modul01.linefunction;

/*Дано действительное число   R вида nnn.ddd (три цифровых разряда в 
 * дробной и целой частях). Поменять местами дробную и целую часть 
 */

public class Exercise04 {

	public static void main(String[] args) {
		
		double r; 
		double result;
		
		r = 444.456;
		result = (int)r/1000.0 + r*1000%1000;
		
		System.out.println(result);
	}

}
