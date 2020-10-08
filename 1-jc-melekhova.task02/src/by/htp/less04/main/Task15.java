package by.htp.less04.main;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		int numb1;
		int numb2;
		int i;
		int nod;
		int numb3;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите первое число:");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		numb1 = sc.nextInt();

		System.out.print("Введите второе число:");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		numb2 = sc.nextInt();

		if (numb1 > numb2) {

			nod = numb2;

			while (!(numb1 % nod == 0 && numb2 % nod == 0)) {

				nod = nod - 1;

			}
			System.out.println(nod);
		}
	}

}
