package by.htp.less04.main;
/*10. С помощью оператора while 
напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.*/

public class Task10 {

	public static void main(String[] args) {

		int number = 0;

		while (number < 100) {

			number = number + 2;
			System.out.println(number);
		}
	}

}
