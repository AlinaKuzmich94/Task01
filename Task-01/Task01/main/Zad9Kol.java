package by.htp.Task01.main;
import java.util.*;

/*Task 01 \\ 9 \\ ��������� ����������� ���������� �����, ����� ������ ����� ����� � ������������ � ��������� �����������. 
 * ���������� ���������� ������, ����� ������� 3-� � ���������� �����, ������ ������� <3. */

public class Zad9Kol {
	public static void main(String[] args) {
		Scanner kol = new Scanner(System.in);
		int kl = 0;
		int sum3 = 0;
		int klAbs = 0;
		
		System.out.println("������� ���������� ����� �����:");
		
		while(!kol.hasNextInt()) {
			kol.next();
		}
		int n = kol.nextInt();
		
		Random rd = new Random();
		int[] arr = new int[n];
		for (int i = 0; i< arr.length; i++) {
			arr[i] = rd.nextInt(10);
			System.out.println(arr[i]);
		}
		
		for (int i = 0; i< arr.length; i++) {
			if((arr[i]%2) ==0) {
				kl=kl+1;
				}
		}
			System.out.println("���������� ������ ����� ������� = "+kl);
			
		for (int j = 0; j< arr.length; j++) {
				if((arr[j] != 0)&&(arr[j] != 1) &&(((arr[j]/10)+(arr[j]%10)) % 3) ==0) {
					sum3++ ;
				}
			}
				System.out.println("���������� �����, ������� 3 = "+sum3);
				
		for (int k = 0; k< arr.length; k++) {
					if((Math.abs(arr[k])<3)) {
						klAbs = klAbs +1 ;
			}
		}
		
		System.out.println("���������� �����, ������ ������� < 3 = "+klAbs);
	}

}