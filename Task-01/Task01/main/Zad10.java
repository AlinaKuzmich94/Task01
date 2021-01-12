package by.htp.Task01.main;

import java.util.*;
/*Task01/ 10 / Программа вводит количество чисел N, а затем N вещественных чисел. 
 * Программа усекает вещественные числа и определят, сколько среди усеченных чисел четных и >15 */
public class Zad10 {
	public static void main (String [] args) {
	Scanner scan = new Scanner(System.in);

	int countEven = 0;
	int count15 =0;

	System.out.println("Введите количество чисел N:");
	int n = scan.nextInt();
	
	
	double[] inputDouble = new double[n];
	for (int i = 0; i < n; i++){
	inputDouble[i] = scan.nextDouble();
	}

	for (int j= 0; j < n; j++){
	if ((int) inputDouble[j] > 15) count15++;
	System.out.println((int) inputDouble[j] % 2 == 0);
	if ((int) inputDouble[j] % 2 == 0) countEven++;
	}
	System.out.println("count15 =" + count15);
	System.out.println("countEven =" + countEven );
	}
 }
