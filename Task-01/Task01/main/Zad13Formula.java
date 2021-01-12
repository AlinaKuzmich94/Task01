package by.htp.Task01.main;

/* Task01/ 13/ Вычислить значения выражения по формуле
 *  (все переменные принимают дейсвительные знчения): а) и b)
  */

public class Zad13Formula {	
	public static void main (String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		
		//Первое выражение
		a=2; b=4; c=2.2;
		double first = 0;
		if ((a != 0)&&((b*b + 4*a*c)>=0)) {
			first = ((b + Math.sqrt(b*b + 4*a*c))/2*a)-a*a*a*c+b;
		}
		else {
			a = Double.NaN;
		}
		System.out.println("Результат первого выражения: "+first);
		
		//Второе выражение
		a=5; b=1; c=4; d=10;
		double second = 0;
		if ((c !=0)&& (d != 0)) {
			second = (a/c)*(b/d)-((a*b-c)/c*d);
		}
		else {
			System.out.println("Знаменатель равен нулю.");
			c = Double.NaN;
			d = Double.NaN;
		}
		System.out.println("Результат второго выражения: "+second);
		
	}

}
