package by.htp.Task01.main;

import java.util.*;

//Task 01 \\ 17 \\ ��������� �������� ������� ���� � <= 3 � ���� � > 3

public class Zad17ZnFunc {
	public static void main(String[] args) {
		double x;
		double result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ x: ");
		
		while(!sc.hasNextDouble()) {
			sc.next();
			}
		x = sc.nextDouble();
		
		if(x>3) {
			result = 1/(x*x+1);
			System.out.println("�������� ������� = "+result);
			}
		else {
			System.out.println("�������� ������� = 9");
			}
	}
}
