package by.htp.less04.main;

//7. Подсчитать количество отрицательных среди чисел а, b, с.
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		double numb1;
		double numb2;
		double numb3;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите первое число: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}

		numb1 = sc.nextDouble();

		System.out.print("Введите второе число: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}

		numb2 = sc.nextDouble();

		System.out.print("Введите третье число: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}

		numb3 = sc.nextDouble();

		if (numb1 < 0 && numb2 < 0 && numb3 < 0) {
			System.out.println("Все три числа являются отрицательными.");
		} else if ((numb1 < 0 && numb2 < 0) || (numb1 < 0 && numb3 < 0) || (numb2 < 0 && numb3 < 0)) {
			System.out.println("Два числа являются отрицательными.");
		} else if (numb1 < 0 || numb2 < 0 || numb3 < 0) {
			System.out.println("Одно число является отрицательными.");
		} else {
			System.out.println("Все числа являются положительными.");
		}

	}

}
