package by.htp.Task01.main;

/* Task 01 \\ 16\\ ¬ычислить длину окружности и 
 * площадь круга одного и того же заданного радиуса R*/

public class Zad16Okr {
	public static void main(String[] args) {
		double R = 5;
		double c;
		double s;
		
		//длина окружности
		c = 2*Math.PI*R;
		System.out.println("ƒлина окружности = "+c);
		
		//площадь круга
		s = Math.PI*R*R;
		System.out.println("ѕлощадь круга = "+s);
		
	}

}
