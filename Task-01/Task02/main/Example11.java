package by.htp.Task02.main;

//Task 02 \\ 11 \\ ��������� �������� ������� �� ������� [a,b] � ����� h.

import java.util.Scanner;

public class Example11 {
	public static void main(String [] args) {
		 
		 double a, b, h;
		 double x;
		 double result = 0;
		 
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("������� a: "); 
		 while(!sc.hasNextDouble()) {
			 sc.next();
		 }
		 a = sc.nextDouble();
		 
		 System.out.println("������� b: ");
		 while(!sc.hasNextDouble()) {
			 sc.next();
		 }
		 b = sc.nextDouble();
		 
		 System.out.println("������� ��� h: ");
		 while(!sc.hasNextDouble()) {
			 sc.next();
		 }
		 h = sc.nextDouble();
		 
		 System.out.println("���������: ");
		 
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