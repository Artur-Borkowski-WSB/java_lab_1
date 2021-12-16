public class Main {

	public static void main(String[] args) {

		int zmiennaInt = 7;
		System.out.println("zmienna int = " + zmiennaInt);
		/* ćw.2 */

		/*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

		int liczba = 1234;
		double liczba2 = 12.34;
		String teskt = "Lorem ipsum dolor";
		boolean bool = true;
		char literka = 'X';
		System.out.println("zad1");
		System.out.println("zmienna int = " + liczba);
		System.out.println("zmienna double = " + liczba2);
		System.out.println("zmienna String = " + teskt);
		System.out.println("zmienna boolean = " + bool);
		System.out.println("zmienna char = " + literka);

		/*
		 *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
		 *    mnożenia, dziealenia i modulo na zmiennych:
		 *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
		 *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
		 *  */

		int liczbaA = 39;
		int liczbaB = 11;
		double liczbaX = 3.14;
		double liczbaZ = 1.5;

		System.out.println("zad2\na)");
		System.out.println(liczbaA + liczbaB);
		System.out.println(liczbaA - liczbaB);
		System.out.println(liczbaA * liczbaB);
		System.out.println(liczbaA / liczbaB);
		System.out.println(liczbaA % liczbaB);
		System.out.println("b)");
		System.out.println(liczbaX + liczbaZ);
		System.out.println(liczbaX - liczbaZ);
		System.out.println(liczbaX * liczbaZ);
		System.out.println(liczbaX / liczbaZ);
		System.out.println(liczbaX % liczbaZ);
	}
}
