package by.htp.Task02.main;

//Task 02 \\ 6 \\ ���� ��� ���� ������������ (� ��������). ����������, ��������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.

public class Example6 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		int tr;
		
		a = 20;
		b = 90;
		c = 70;
		
		tr = a+b+(180-(a+b));
		
		if(tr == 180) {
			System.out.println("������ �������� �������������");
			
			if(a == 90 || b == 90 || c ==90) {
				System.out.println("����������� �������������");
			}
			else {
				System.out.println("����������� �� �������������");
			}
		}
		else {
			System.out.println("������ �� �������� �������������");
		}
		
	}

}
