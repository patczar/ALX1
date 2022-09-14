package kalkulator;

import java.util.Scanner;

public class KalkulatorKonsola {
	
	static int oblicz(int x, int y, String operacja) {
		switch(operacja) {
		case "+": return x + y;
		case "-": return x - y;
		case "*": return x * y;
		case "/": return x / y;
		default : return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podawaj działania postaci 12 + 13, a żeby zakończyć napis koniec");
		while(true) {
			if(! sc.hasNextInt()) {
				break; // FIXME - powinienem spr czy to jest "koniec"
			}
			int x = sc.nextInt();
			String op = sc.next();
			int y = sc.nextInt();
			
			int wynik = oblicz(x, y, op);
			System.out.println("Wynik: " + wynik);
		}

	}

}
