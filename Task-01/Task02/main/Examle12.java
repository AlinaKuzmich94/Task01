package by.htp.Task02.main;

//Task 02 \\ 12 \\ ������� �� ����� ������������ ����� ��������� � �� ���������� ������������� � ������ ���������� (������� ASCII).

public class Examle12 {
	public static void main(String [] args) {
			int x=0;
			char c;
			while(x<256){
			c=(char) x;
			System.out.println(c+" | " + x);
			x++;
			}
	}
}
