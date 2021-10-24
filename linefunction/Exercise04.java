package by.jonline.modul01.linefunction;

/*ƒано действительное число R  вида nnn.ddd (три цифровых разр€да в дробной
* и целой част€х). ѕомен€ть местами дробную целую часть, и вывести
* полученное значение числа.*/

public class Exercise04 {

	public static void main(String[] args) {
		
		double r; 
		double result;
		
		r = 444.456;
		result = (int)r/1000.0 + r*1000%1000;
		
		System.out.println(result);
	}

}
