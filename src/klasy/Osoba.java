package klasy;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba {
	private String imie;
	private String nazwisko;
	private LocalDate dataUrodzenia;
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public LocalDate getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(LocalDate dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUrodzenia = dataUrodzenia;
	}

	public Osoba(String imie, String nazwisko, String dataUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
	}

	@Override
	public String toString() {
		return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", dataUrodzenia=" + dataUrodzenia + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataUrodzenia, imie, nazwisko);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		return Objects.equals(dataUrodzenia, other.dataUrodzenia) && Objects.equals(imie, other.imie)
				&& Objects.equals(nazwisko, other.nazwisko);
	}
	
}
