package by.htp.Task02.main;

//Task 02 \\ 3 \\ ���� �������� �, ���������� ����� ��������� � ������. ��������� � � ����� ������� ������� �������� ����������

public class Example3 {
	public static void main(String[] args) {
		
		long A;
		long rez;
		
		A = 1;
		rez = A;
		
		for(int i=0; i<5; i++ ) {
			System.out.println(rez);
			rez= (A*1_024);
			A = rez;
		}
		
		
	}

}
