package by.htp.Task01.main;
import java.util.*;

//Task 01 \\ 6 \\ ��������� ����������� � ������������ a, b, c, ��������� ������� ���������.

public class Zad6Form {
	public static void main(String[] args) {
		int a;
		int b;
		int c = 0;
		
		double rez;
		
		Scanner chis = new Scanner(System.in);
		
		System.out.println("������� ����� �:");
		while(!chis.hasNextInt()) {
			chis.next();
		}
		a = chis.nextInt();
		
		System.out.println("������� ����� b:");
		while(!chis.hasNextInt()) {
			chis.next();
		}
		b = chis.nextInt();
		
		System.out.println("������� ����� c:");
		while(!chis.hasNextInt()) {
			chis.next();
		}
		a = chis.nextInt();
		
		int z = b-c;
		double h = b*b+1;
		rez = a*a - Math.pow( z,2) + Math.exp(h);
		System.out.println("�������� ��������� = "+rez);
	}

}
