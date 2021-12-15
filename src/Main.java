import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        double[] tab = new double[5];
        tab[0] = 3.14;
        tab[1] = 2.5;
        tab[2] = 7.5;
        tab[3] = 1.2345;
        tab[4] = 5;
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
