package by.htp.Task01.main;

import java.util.Scanner;

/* Task01/ 14/ Даны три действительных числа. 
 * Возвести в квадрат те их них, значения которых неотрицательны, 
 * и в четвертую степень - отрицательные.
  */

public class Zad14Tr {	
	public static void main (String[] args) {
		double x = 0, y = 0, z = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите первое число:");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}
		
		System.out.print("Введите второе число:");
		if (sc.hasNextDouble()) {
			y = sc.nextDouble();
		}
		
		System.out.print("Введите третье число:");
		if (sc.hasNextDouble()) {
			z = sc.nextDouble();
		}
		
		System.out.println("Исходные числа "+x+" "+y+" "+z);
		if (x >0) {
			x = x*x;
			if(y>0) {
				y = y*y;
				if (z>0) {
					z=z*z;
				}
				else {
					z = Math.pow(z, 4);
				}
			}
			else {
				y = Math.pow(y, 4);
			}
		}
		else {
			x = Math.pow(x, 4);
		}
		System.out.print(" Преобразованные числа "+x+" "+y+" "+z);
	}

}
