package by.htp.Task01.main;
import java.util.*;

/* \\Task01\\ 15 \\ ��������� ��������� ��� ���������� �������� ������� F(x)
 * �� ������� [a,b] � ����� h. ��������� ����������� � ���� �������, 
 * ������ ������� ������� - �������� ��������, ������ - ��������������� �������� �������*/

public class Zad15Func {
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
			 result = 2*Math.tan(x/2)+1;
			 System.out.print("x: "+x+" \\ ");
			 System.out.print("y: "+result);
			 System.out.println();
			 x = x+h;
		 }

	 }
}
