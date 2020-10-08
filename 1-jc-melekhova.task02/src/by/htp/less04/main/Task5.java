package by.htp.less04.main;

//Составить программу: определения наименьшего из двух чисел а и b.


import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		int a;
		int b;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите первое число: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		a = sc.nextInt();

		System.out.print("Введите второе число: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		b = sc.nextInt();

		if (a > b) {
			System.out.println("Число " + a + " больше, чем число " + b + ".");
		} else {
			System.out.println("Число " + b + " больше, чем число " + a + ".");
		}
	}

}
