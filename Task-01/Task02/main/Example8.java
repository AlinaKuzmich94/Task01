package by.htp.Task02.main;

import java.util.*;

// Task 02 \\ 8 \\ ������ ������� A, B �������������� ��������� � ������� x, y, z �������. ����������, ������� �� ������ ����� ���������.

public class Example8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = 0, b = 0, x = 0, y = 0, z = 0;
		
		System.out.print("������� a:");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}

		System.out.print("������� b:");
		if (sc.hasNextInt()) {
			b = sc.nextInt();
		}
		
		System.out.print("������� x:");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		}
		
		System.out.print("������� y:");
		if (sc.hasNextInt()) {
			y = sc.nextInt();
		}
		
		System.out.print("������� z:");
		if (sc.hasNextInt()) {
			z = sc.nextInt();
		}
		
		if((a>x) && (b>y)) {
			System.out.println("�������.");
		}
		else {
			if ((a>y) && (b>x)) {
				System.out.println("�������.");
			}
			else {
				if ((a>x) && (b>z)) {
					System.out.println("�������.");
				}
				else {
					if((a>z) && (b>x)) {
						System.out.println("�������.");
					}
					else {
						if ((a>y) && (b>z)) {
							System.out.println("�������.");
						}
						else {
							if((a>z)&&(b>y)) {
								System.out.println("�������.");
							}
							else {
								System.out.println("�� �������.");
							}
						}
					}
				}
			}
		}
	}

}
