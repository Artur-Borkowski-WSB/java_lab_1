import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* ćw.5 */

		/* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
		 * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
		 * */

		if (21 % 3 == 0) {
			System.out.println("Podzielny przez 3");
		} else {
			System.out.println("Niepodzielny przez 3");
		}


		/* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

		System.out.println("Numer albumu " + (57647 % 2 == 0 ? "jest parzysty" : "jest nieparzysty"));

		/* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
		 * i stwórz konstrukcję else if z dowolnymi komunikatami */

		System.out.println("Podaj liczbę:");
		Scanner scan = new Scanner(System.in);
		double liczba = Double.parseDouble(scan.next());
		if (liczba < 0) {
			System.out.println("Liczba jest mniejsza od 0");
		} else if (liczba == 3.14) {
			System.out.println("Podano liczbę Pi");
		} else if (liczba >= 10) {
			System.out.println("Liczba jest większa lub równa 10");
		} else {
			System.out.println("Podano liczbę: " + liczba);
		}
	}
}
