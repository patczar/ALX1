package kalkulator;

import java.util.Scanner;

public class KalkulatorKonsola {
	
	static int oblicz(int x, int y, String operacja) {
		switch(operacja) {
		case "+": return x + y;
		case "-": return x - y;
		case "*": return x * y;
		case "/": return y == 0 ? 0 : x / y;
		default : return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podawaj działania postaci 12 + 13, a żeby zakończyć napis koniec");
		mainloop:
		while(true) {
			while(!sc.hasNextInt()) {
				if(sc.next().equalsIgnoreCase("koniec")) {
					break mainloop;
				}
			}
			int x = sc.nextInt();
			String op = sc.next();
			int y = sc.nextInt();
			
			int wynik = oblicz(x, y, op);
			System.out.println("Wynik: " + wynik);
		}
		System.out.println("bajo jajo");
	}

}
