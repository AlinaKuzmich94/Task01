package by.htp.Task02.main;

import java.util.Scanner;

/*Task 02 \\ 13 \\ �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. 
 * � ��������� ��������� ��� ����� �� 1 �� ��������� ������������� ����� */

public class Example13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kol;
		int sum = 0;
		System.out.println("������� �����:");
		
		while(!sc.hasNextInt()) {
			sc.next();
		}
		int n = sc.nextInt();
		
		for ( kol = 0;kol<=n;kol++) {
			   sum = sum + kol;
		   }
		System.out.println("����� ����� = "+sum);
	}

}
