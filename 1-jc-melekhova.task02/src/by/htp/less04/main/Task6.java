package by.htp.less04.main;

//Даны два угла треугольника (в градусах). 
//Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		int angle1;
		int angle2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите значение первого угла (в градусах): ");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		angle1 = sc.nextInt();

		System.out.print("Введите значение второго угла (в градусах):");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		angle2 = sc.nextInt();

		if ((180 - angle1 - angle2) > 0) {

			System.out.println("Данный треугольник существует.");

			if ((angle1 + angle2) == 90 || angle1 == 90 || angle2 == 90) {

				System.out.println("Треугольник является прямоугольным.");
			}

		} else {

			System.out.println("Существование такого треугольника не возможно!");
		}
	}

}
