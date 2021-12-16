public class Main {

	public static void main(String[] args) {
		// ćw.1 napisać po kilka przykładów wypisywania tekstu w konsoli,
		// Użyć każdej z opcji
		System.out.print("Lorem ");
		System.out.print("ipsum ");
		System.out.print("dolor ");
		System.out.println("sit amet");
		System.out.println("nowa linia");
		System.out.println("\ttab\nnowa lina");
		System.out.printf("%d + %d = %d", 2, 3, 2 + 3);
		System.out.println();
		System.out.printf("%s ma %s", "Ala", "Kota");
		System.out.printf("\n%S", "to zostanie napisane dużymi literami");
		System.out.println();
		System.out.printf("liczba będzie miała zera wiodące %03d", 4);
		System.out.printf("\nliczba zostanie zaokrąglona do 2 miejsc po przecinku %.2f", 1.236);
	}
}
