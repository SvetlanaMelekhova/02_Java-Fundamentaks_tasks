package by.htp.less04.main;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		double x;
		double Fx;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите x: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}

		x = sc.nextDouble();

		if (x <= 3) {
			Fx = x * x - 3 * x + 9;
		} else {
			Fx = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("F(x) = " + Fx);
	}

}
