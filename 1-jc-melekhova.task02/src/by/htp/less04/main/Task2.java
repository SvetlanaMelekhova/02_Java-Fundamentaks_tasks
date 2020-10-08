package by.htp.less04.main;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;
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

		System.out.print("Введите d: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}

		d = sc.nextDouble();

		if (c == 0 || d == 0) {
			System.out.println("Решение задачи с заданными параметрами не возможно!");
		} else {
			answer = ((a / c) * (b / d)) - ((a * b - c) / c / d);
			System.out.println("answer= " + answer);
		}
	}
}
