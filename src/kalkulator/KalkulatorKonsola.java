package kalkulator;

import java.util.Scanner;

public class KalkulatorKonsola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj działanie postaci 12 + 13:");
		int x = sc.nextInt();
		String op = sc.next();
		int y = sc.nextInt();
		
		int wynik = x + y;
		System.out.println("Wynik: " + wynik);

	}

}
