package by.htp.less04.main;
/*Составить программу сравнения двух чисел 1 и 2.
Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.*/

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		int numb1;
		int numb2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите первое число: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		numb1 = sc.nextInt();

		System.out.print("Введите второе число: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		numb2 = sc.nextInt();

		if (numb1 > numb2) {

			System.out.println("7");
		} else {

			System.out.println("8");
		}

	}
}
