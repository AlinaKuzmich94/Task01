package by.htp.Task02.main;
import java.util.*;

// Task 02 \\ 7 \\ ���������� ���������� ������������� ����� a,b,c.

public class Example7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x =0;
		int y = 0;
		int z = 0;
		int kol = 0;
		
		System.out.print("������� �:");
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
		
		if (x <0) {
			kol = kol +1;
			if(y<0) {
				kol = kol +1;
				if (z<0) {
					kol = kol +1;
				}
			}
			else {	
				if( z<0) {
					kol = kol +1;
				}
					}
		}
		else {
			if (y<0) {
				kol = kol+1;
				if (z<0) {
					kol=kol+1;
				}
			}
			else {
				if (z<0) {
					kol = kol +1;
				}
			}
				
		}
		System.out.println("���������� ������������� ����� = "+kol);

	}

}
