package by.htp.Task02.main;

import java.util.*;

// Task 02 \\ 8 \\ Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич через отверстие.

public class Example8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = 0, b = 0, x = 0, y = 0, z = 0;
		
		System.out.print("Введите a:");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}

		System.out.print("Введите b:");
		if (sc.hasNextInt()) {
			b = sc.nextInt();
		}
		
		System.out.print("Введите x:");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		}
		
		System.out.print("Введите y:");
		if (sc.hasNextInt()) {
			y = sc.nextInt();
		}
		
		System.out.print("Введите z:");
		if (sc.hasNextInt()) {
			z = sc.nextInt();
		}
		
		if((a>x) && (b>y)) {
			System.out.println("Пройдет.");
		}
		else {
			if ((a>y) && (b>x)) {
				System.out.println("Пройдет.");
			}
			else {
				if ((a>x) && (b>z)) {
					System.out.println("Пройдет.");
				}
				else {
					if((a>z) && (b>x)) {
						System.out.println("Пройдет.");
					}
					else {
						if ((a>y) && (b>z)) {
							System.out.println("Пройдет.");
						}
						else {
							if((a>z)&&(b>y)) {
								System.out.println("Пройдет.");
							}
							else {
								System.out.println("Не пройдет.");
							}
						}
					}
				}
			}
		}
	}

}
