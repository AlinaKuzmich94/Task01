package by.htp.Task01.main;
import java.util.*;

//Task 01 \\ 4 \\ Напишите программу нахождения гипотенузы и площади прямоугольного треугольника по двум катетам. 

public class Zad4Tr {
	public static void main(String[] args) {
		int x;
		int y;
		
		double g;
		int s;
		
		Scanner stor = new Scanner(System.in);
		System.out.println("Введите значение первого катета:");
		while(!stor.hasNextInt()) {
			stor.next();
		}
		x = stor.nextInt();
		
		System.out.println("Введите значение второго катета:");
		while(!stor.hasNextInt()) {
			stor.next();
		}
		y = stor.nextInt();
		
		g = Math.sqrt(x*x+y*y);
		s = (x*y)/2;
		System.out.println("Гипотенуза = "+g+"; Площадь = "+s);
	}

}
