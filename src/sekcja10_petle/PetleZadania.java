package sekcja10_petle;

public class PetleZadania {
    public static void main(String[] args) {

        for (int liczba = 1; liczba <30; liczba++) {
            System.out.println("Liczba: " + liczba);
        }

        for (int liczba = 30; liczba > 0; liczba--) {
            System.out.println("Liczba: " + liczba);
        }

        for (int liczba2 = 2; liczba2 <= 30; liczba2 = liczba2 + 2) {
            System.out.println("Liczba: " + liczba2);

        }
        int a = 3;
        int b = 8;

        for(int i = a+1; i < b; i++) {
            System.out.println("Liczba: " + i);
        }
        int[] tab = new int[10];

        for(int i = 0; i <= 9; i++) {
            tab[i] = i + 2;
            System.out.println("Element tablicy nr: " + i + " wynosi: " + tab[i]);
        }
        for(int i = 9; i >= 0; i--) {
            System.out.println("Element tablicy nr: " + i + " wynosi: " + tab[i]);
        }

        int suma = 0;

        for(int i = 9; i >= 0; i--) {
            suma = suma + tab[i];
        }
        System.out.println("Suma wynosi: " + suma);

        int silnia = 5;
        int silniaLiczby = 1;

        for(int i = 1; i <= silnia; i++) {
            silniaLiczby = silniaLiczby * i;
            System.out.println("Silnia liczby: " + silniaLiczby);
        }

        int n = 6;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= 1; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int wysokoscChoinki = 30;

        for (int i = 1; i <= wysokoscChoinki; i++) {
            for (int j = (2 * wysokoscChoinki) - 1; j >= 1; j--) {
                if (j <= (2*i) -1) {
                    System.out.print("*");
                } else if (j >= wysokoscChoinki + i) {
                    System.out.print(" ");
                } else {

                }

            }
            System.out.println();
        }
    }
}
