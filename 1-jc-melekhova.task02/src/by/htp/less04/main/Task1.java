package by.htp.less04.main;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double answer;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите a: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}

		a = sc.nextDouble();

		System.out.print("Введите b: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}

		b = sc.nextDouble();

		System.out.print("Введите c: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}

		c = sc.nextDouble();

		if (a == 0 || ((4 * a * c) + (b * b)) <= 0) {

			System.out.print("Решение задачи с заданными параметрами не возможно!");
		} else {
			answer = (b + Math.sqrt((b * b) + (4 * a * c))) / 2 / a - (a * a * a * c) + Math.pow(b, -2.0);

			System.out.println("x = " + answer);
		}
	}

}
