package by.htp.less04.main;
/*13. Напишите программу, где пользователь вводит любое целое положительное число.
 *  А программа суммирует все числа от 1 до введенного пользователем числа.*/

import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {

		int iterValue;
		int numb;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите целое положительное число: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		numb = sc.nextInt();

		if (numb >= 0) {

			for (int i = 1; i <= numb; i++) {

				iterValue = sum + i;

				if (iterValue > sum) {

					sum = iterValue;

				} else {

					sum = 0;
					System.out.println("Вы вышли за границу числового диапазона!");
					break;
				}

			}
			System.out.println("Сумма = " + sum);

		} else {

			System.out.println("Вы ввели отрицательное число! ");

		}
	}

}
