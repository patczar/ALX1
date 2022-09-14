package klasy;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(1990, 1, 1));
		System.out.println(ala);
		
		Osoba ola = new Osoba("Ola", "Malinowska", "2001-02-03");
		System.out.println(ola);
	}

}
