package by.htp.Task02.main;

//Task 02 \\ 1 \\ Вычислить знчение выражения по формуле (все переменные принимают действительные значения)

public class Example1 {
		public static void main(String[] args) {
			
			double a;
			double b;
			double c;

			double rez;
			
			a = 5.6;
			b = 1.2;
			c = 4.5;
			
		    if(a == 0.0) {
		    	System.out.println("Вычисление невозможно");
		    	return;
		    }	
		    
		    rez = (b + Math.sqrt(b*b+4*a*c))/(2*a) - Math.pow(a,3)*b + Math.pow(b, -2);
		    System.out.println(rez);
		}

}
