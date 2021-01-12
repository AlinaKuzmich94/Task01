package by.htp.Task01.main;

/*Task 01 \\ 7 \\ Программа вводит два числа a и b, если a>b, то программа вводит третье число c и находит сумму b+c. 
Если a=b, то программа печатает слово "Конец". Если a<b, то программа вводит третье число c,
находит сумму a+b+c, выводит на экран сумму a+b+c и слова "Новый год!" */

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
				System.out.println("Сумма = "+sum+"; Новый год!");
			}
			else {
				System.out.println("Конец");
			}
		}
	}

}
