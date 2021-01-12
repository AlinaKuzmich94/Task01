package by.htp.Task01.main;
import java.util.*;

//Task 01 \\ 5 \\ Напишите программу вычисления суммы четырех слагаемых.

public class Zad5Summ {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		
		int sum;
		
		Scanner slag = new Scanner(System.in);
		System.out.println("Введите значение числа:");
		while(!slag.hasNextInt()) {
			slag.next();
		}
		a = slag.nextInt();
		
		System.out.println("Введите значение числа:");
		while(!slag.hasNextInt()) {
			slag.next();
		}
		b = slag.nextInt();
		
		System.out.println("Введите значение числа:");
		while(!slag.hasNextInt()) {
			slag.next();
		}
		c = slag.nextInt();
		
		System.out.println("Введите значение числа:");
		while(!slag.hasNextInt()) {
			slag.next();
		}
		d = slag.nextInt();
		
		sum = a+b+c+d;
		System.out.println("Сумма введенных чисел = "+sum);
	}

}
