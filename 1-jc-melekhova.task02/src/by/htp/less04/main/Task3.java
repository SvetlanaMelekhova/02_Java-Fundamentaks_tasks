package by.htp.less04.main;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		long B;
		long kB;
		long MB;
		long GB;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите количество байт: ");
		while (!sc.hasNextLong()) {
			sc.next();
		}

		B = sc.nextLong();

		kB = B / 1024;
		MB = kB / 1024;
		GB = MB / 1024;

		System.out.println(B + " = " + kB + " кбайт");
		System.out.println(B + " = " + MB + " Мбайт");
		System.out.println(B + " = " + GB + " Гбайт");

	}

}
