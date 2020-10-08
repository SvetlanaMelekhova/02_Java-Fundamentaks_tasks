package by.htp.less04.main;

/*11. Вычислить значения функции на отрезке [а,b] c шагом h:*/
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		int a;
		int b;
		int h;
		int x;
		int y;
		int i;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите значение a:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		a = sc.nextInt();

		System.out.print("Введите значение b:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		b = sc.nextInt();

		System.out.print("Введите значение h:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		h = sc.nextInt();

		for (x = a; x <= b; x = x + h) {

			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.println("Значение x= " + x + "; Значение y= " + y);

		}
	}

}
