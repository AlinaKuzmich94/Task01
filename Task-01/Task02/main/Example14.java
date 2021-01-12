package by.htp.Task02.main;

import java.util.Scanner;

//Task 02 \\ 14 \\ Требуется определить факториал числа, которое ввел пользователь

public class Example14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kol = 1;
		int f = 1;
		System.out.println("Введите число:");
		
		while(!sc.hasNextInt()) {
			sc.next();
		}
		int n = sc.nextInt();
		
		if(f>=1) {
		   for ( kol = 1;kol<=n;kol++) {
			   f = f * kol;
		   }
		   System.out.println("Фокториал = "+f);
	    }
		else {
			System.out.println("Введите другое чиссло");
		}
	}
}
