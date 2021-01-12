package by.htp.Task02.main;

//Task 02 \\ 2 \\ Вычислить значение выражени по формуле (все переменные принимают действительные значения)

public class Example2 {
	public static void main(String [] args) {
		
		double a;
		double b;
		double c;
		double d;
		
		double rez;
		
		a = 2.4;
		b = 6.4;
		c = 1.2;
		d = 3.4;
		
		if(c == 0 && d == 0 ) {
			System.out.println("Вычисление невозможно");
		}
		
		rez =( a/c - b/d - (a*b - c)/(c*d));
		System.out.println(rez);
	}

}
