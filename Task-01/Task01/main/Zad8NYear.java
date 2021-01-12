package by.htp.Task01.main;

/* \\Task 01\\ 8 \\ Программа вводит два числа a и b, если a=b, то вывести на экран слова "скоро Новый Год!", 
 * в противном случае ввести третье число с и вывести на экран три строки:
 *  - значение выражения a+b+c
 *  - знаение выражения a*a + b*b
 *  - "моя любимая футбольная команда" */

public class Zad8NYear {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		if (a == b){
			System.out.println("Скоро Новый Год!");
		}
		else {
			int c = 6;
			int z1 = a+b+c;
			int z2 = a*a + b*b;
			System.out.println(z1);
			System.out.println(z2);
			System.out.println("Моя любимая футбольная команда - Динамо");
		}
		
	}

}
