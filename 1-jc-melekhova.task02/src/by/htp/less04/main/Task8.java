package by.htp.less04.main;
//8. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 

//Определить, пройдет ли кирпич через отверстие.


import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double x = 0;
		double y = 0;
		double z = 0;

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

		System.out.print("Введите x: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}

		x = sc.nextDouble();

		System.out.print("Введите y: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}

		y = sc.nextDouble();

		System.out.print("Введите z: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}

		z = sc.nextDouble();

		if ((a > x) && (b > y))
			System.out.println("Пройдет.");
		else if ((a > y) && (b > x))
			System.out.println("Пройдет.");
		else if ((a > x) && (b > z))
			System.out.println("Пройдет.");
		else if ((a > z) && (b > x))
			System.out.println("Пройдет.");
		else if ((a > y) && (b > z))
			System.out.println("Пройдет.");
		else if ((a > z) && (b > y))
			System.out.println("Пройдет.");
		else
			System.out.println("Не пройдет.");
	}
}
