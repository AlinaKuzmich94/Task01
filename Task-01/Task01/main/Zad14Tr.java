package by.htp.Task01.main;

import java.util.Scanner;

/* Task01/ 14/ ���� ��� �������������� �����. 
 * �������� � ������� �� �� ���, �������� ������� ��������������, 
 * � � ��������� ������� - �������������.
  */

public class Zad14Tr {	
	public static void main (String[] args) {
		double x = 0, y = 0, z = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������� ������ �����:");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}
		
		System.out.print("������� ������ �����:");
		if (sc.hasNextDouble()) {
			y = sc.nextDouble();
		}
		
		System.out.print("������� ������ �����:");
		if (sc.hasNextDouble()) {
			z = sc.nextDouble();
		}
		
		System.out.println("�������� ����� "+x+" "+y+" "+z);
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
		System.out.print(" ��������������� ����� "+x+" "+y+" "+z);
	}

}
