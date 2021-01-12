package by.htp.Task01.main;
import java.util.*;

/* \\Task01\\ 15 \\ Составить программу для вычисления значений функции F(x)
 * на отрезке [a,b] с шагом h. Результат пердставить в виде таблицы, 
 * первый столбец которой - значения аргумнта, второй - соответствующие значения функции*/

public class Zad15Func {
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
			 result = 2*Math.tan(x/2)+1;
			 System.out.print("x: "+x+" \\ ");
			 System.out.print("y: "+result);
			 System.out.println();
			 x = x+h;
		 }

	 }
}
