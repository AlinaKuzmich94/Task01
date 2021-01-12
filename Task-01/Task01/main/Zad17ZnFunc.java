package by.htp.Task01.main;

import java.util.*;

//Task 01 \\ 17 \\ Вычислить значение функции если х <= 3 и если х > 3

public class Zad17ZnFunc {
	public static void main(String[] args) {
		double x;
		double result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ввдите x: ");
		
		while(!sc.hasNextDouble()) {
			sc.next();
			}
		x = sc.nextDouble();
		
		if(x>3) {
			result = 1/(x*x+1);
			System.out.println("Значение функции = "+result);
			}
		else {
			System.out.println("Значение функции = 9");
			}
	}
}
