package by.htp.Task02.main;

import java.util.Scanner;

//Task 02 \\ 15 \\ ����� ��� ���� ����� ������������� �����.

public class Example15 {
	public static void main(String [] args) {
		 int a, b, c,d;
		 
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("������� a: "); 
		 while(!sc.hasNextDouble()) {
			 sc.next();
		 }
		 a = sc.nextInt();
		 
		 System.out.println("������� b: ");
		 while(!sc.hasNextDouble()) {
			 sc.next();
		 }
		 b = sc.nextInt();
		 
		 c = a;
		 d = b;
		 
		 while(a!=b) {
			 if(a>b) {
				 a = a - b;
			 }
			 else {
				 b = b - a;
			 }
		 }
		 System.out.println("HOD("+c+","+d+")="+a);
	}

}
