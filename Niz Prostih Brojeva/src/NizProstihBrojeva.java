/* Napraviti funkciju koja za zadati ceo broj ispituje da li je prost ili ne.
   U glavnom delu programa (MAIN) ucitati niz celih brojeva, pa potom od njega
   kreirajte novi niz od elemenata koji su prosti.
   Ispisati novodobijeni niz. */

import java.util.Scanner;

public class NizProstihBrojeva {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj clanova niza: ");
        int n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Unesite clanove niza:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            a[i] = input.nextInt();
        }
        stampajNiz(a, n);

        int b[] = new int[100];
        int m = 0;
        for (int i = 0; i < n; i++)
            if (prostBroj(a[i]))
                b[m++] = a[i];
        System.out.print("Prosti clanovi niza su: ");
        stampajNiz(b, m);
    }

    public static boolean prostBroj(int x) {

        int b = 2;

		for(int i = 2; i <= x/2; i++)
			if(x % i == 0)
				b++;

		if(b == 2)
			return true;
		else
			return false;
    }

    public static void stampajNiz(int a[], int n) {
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

		System.out.println();
	}
}
