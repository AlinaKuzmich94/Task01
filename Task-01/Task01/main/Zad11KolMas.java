package by.htp.Task01.main;

/*Task01/ 11 / ��������� ����������� ���������� �����, ������ ����� ����� � ������������ � ���������� �����������, 
 * ����������, ������� ����� ������ 15 ��� < 2, ���� ����� ����� �����,
 * ������� ������� �� 5 � �������� 4. ��������� ������� �� �����. */

import java.util.Random;
import java.util.Scanner;

public class Zad11KolMas {
	public static void main(String[] args) {
		Scanner kol = new Scanner(System.in);
		int kl = 0;
		int sum = 0;
		
		System.out.println("������� ���������� �����:");
		
		while(!kol.hasNextInt()) {
			kol.next();
		}
		int n = kol.nextInt();
		
		Random rd = new Random();
		int[] arr = new int[n];
		for (int i = 0; i< arr.length; i++) {
			arr[i] = rd.nextInt(100);
			System.out.println(arr[i]);
		}
		
		for (int i = 0; i< arr.length; i++) {
			if((arr[i] >15) || (arr[i]<2)) {
				kl=kl+1;
				}
		}
			System.out.println("���������� ����� > 15 ��� < 2 = "+kl);
			
		for (int j = 0; j< arr.length; j++) {
				if(arr[j] % 5 ==4) {
					sum = sum +arr[j];
				}
			}
		System.out.println(" ����� �����, ������� 5 c �������� 4 = "+sum);

	}

}
