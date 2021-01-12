package by.htp.Task02.main;

//Task 02 \\ 11 \\ Вычислить значения функции на отрезке [a,b] с шагом h.

import java.util.Scanner;

public class Example11 {
	public static void main(String [] args) {
		 
		 double a, b, h;
		 double x;
		 double result = 0;
		 
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Введите a: "); 
		 while(!sc.hasNextDouble()) {
			 sc.next();
		 }
		 a = sc.nextDouble();
		 
		 System.out.println("Введите b: ");
		 while(!sc.hasNextDouble()) {
			 sc.next();
		 }
		 b = sc.nextDouble();
		 
		 System.out.println("Введите шаг h: ");
		 while(!sc.hasNextDouble()) {
			 sc.next();
		 }
		 h = sc.nextDouble();
		 
		 System.out.println("Результат: ");
		 
		 x = a;
		 while(x<=b) {
			 if(x>2) {
				 result = x;
				 System.out.print("x: "+x+" \\ "); 
				 System.out.print("y: "+result);
				 System.out.println();
			 }
			 else {
				 result = -x;
				 System.out.print("x: "+x+" \\ "); 
				 System.out.print("y: "+result);
				 System.out.println();
			 }
			 x = x+h;
		 }

	 }

}