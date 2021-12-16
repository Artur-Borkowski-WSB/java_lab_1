public class Main {

	public static void main(String[] args) {

		/* ćw.4 */

		/* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

		boolean prawda = true, falsz = false;
		int x = 10, y = 5, z = 0;
		System.out.println(!prawda); // false
		System.out.println(prawda && falsz); // false
		System.out.println(prawda || falsz); // true
		System.out.println(x > y); // true
		System.out.println(x >= 10); // true
		System.out.println(x > 10); // false
		System.out.println(x > y && y > z && z >= 0); // true
		System.out.println(((y > x) || !prawda || (z > 0))); // false
		System.out.println(((y > x) || !prawda || (z >= 0 && x * y > 10))); // true
		System.out.println(y % 2 == 0); // false
		System.out.println(x % 2 == 0); // true
		System.out.println((y * y + 4 * x * z) > 0); // true
		System.out.println(true && ((y - 1) % 2 == 0) && !falsz && z == 0 && !(x * x > 100)); // true
	}
}
