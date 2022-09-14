package hello;

import java.time.LocalDate;
import java.time.LocalTime;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println("Druga linia");
		System.out.println("Data " + LocalDate.now());
		System.out.println("Godzina " + LocalTime.now());
	}

}
