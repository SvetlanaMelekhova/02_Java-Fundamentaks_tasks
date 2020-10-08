package by.htp.less04.main;

import java.util.Scanner;

//14. Требуется определить факториал числа, которое ввел пользователь.
public class Task14 {

	public static void main(String[] args) {
		long iterValue = 1;
		long numb;
		long multi = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите целое положительное число: ");
		while (!sc.hasNextLong()) {
			sc.next();
		}

		numb = sc.nextLong();

		for (long i = 1; i <= numb; i++) {

			iterValue = multi * i;

			if (iterValue >= multi) {
				multi = iterValue;
				
			} else {
				
				System.out.println("Вы вышли за границу числового диапазона!");
				return;
			}
			
		}
		System.out.println("Факториал числа  = " + multi);
		
	}

}
