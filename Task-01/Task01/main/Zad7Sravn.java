package by.htp.Task01.main;

/*Task 01 \\ 7 \\ ��������� ������ ��� ����� a � b, ���� a>b, �� ��������� ������ ������ ����� c � ������� ����� b+c. 
���� a=b, �� ��������� �������� ����� "�����". ���� a<b, �� ��������� ������ ������ ����� c,
������� ����� a+b+c, ������� �� ����� ����� a+b+c � ����� "����� ���!" */

public class Zad7Sravn {
	public static void main(String[] args) {
		int a;
		int b;
		
		a = 9;
		b = 5;
		
		if (a>b) {
			int c = 8;
			int sum = b+c;
			
		}
		
		else {
			if (a<b) {
				int c = 9;
				int sum = a+b+c;
				System.out.println("����� = "+sum+"; ����� ���!");
			}
			else {
				System.out.println("�����");
			}
		}
	}

}
