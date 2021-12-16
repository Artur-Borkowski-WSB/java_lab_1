import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* ćw.3 */

		/*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
		 *   a) Imię, nazwisko, wiek, nr indeksu,
		 *   dane mają być wprowadzane z klawiatury w konsoli
		 *   b) wyświetlić dane za pomocą println i printf
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj imię ");
		String imie = scan.next();
		System.out.println("Podaj nazwisko ");
		String nazwisko = scan.next();
		System.out.println("Podaj wiek ");
		int wiek = Integer.parseInt(scan.next());
		System.out.println("Podaj numer indeksu ");
		String nrIndeksu = scan.next();

		System.out.println("Student: " + imie + " " + nazwisko + " (" + wiek + ") nr " + nrIndeksu);
		System.out.printf("Student: %s %s (%d) nr %s\n", imie, nazwisko, wiek, nrIndeksu);

		/*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
		 *   wynik wyświetlić w konsoli programu
		 */

		int x = 5, y = 10;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}
}
