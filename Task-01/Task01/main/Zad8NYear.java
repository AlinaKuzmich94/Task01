package by.htp.Task01.main;

/* \\Task 01\\ 8 \\ ��������� ������ ��� ����� a � b, ���� a=b, �� ������� �� ����� ����� "����� ����� ���!", 
 * � ��������� ������ ������ ������ ����� � � ������� �� ����� ��� ������:
 *  - �������� ��������� a+b+c
 *  - ������� ��������� a*a + b*b
 *  - "��� ������� ���������� �������" */

public class Zad8NYear {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		if (a == b){
			System.out.println("����� ����� ���!");
		}
		else {
			int c = 6;
			int z1 = a+b+c;
			int z2 = a*a + b*b;
			System.out.println(z1);
			System.out.println(z2);
			System.out.println("��� ������� ���������� ������� - ������");
		}
		
	}

}
