package by.htp.Task02.main;

import java.util.Scanner;

//Task 02 \\ 9 \\ ��������� �������� �������

public class Example9 {
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
			if (x*x*x +6 != 0) {
				result = 1/(x*x+1);
				System.out.println("�������� ������� = "+result);
			}
			else {
				System.out.println("����������� ����� ����");
				result = Double.NaN;	
			}
		}
		else {
			result = x*x-3*x+9;
			System.out.println("�������� ������� = "+result);
		}
	}

}
