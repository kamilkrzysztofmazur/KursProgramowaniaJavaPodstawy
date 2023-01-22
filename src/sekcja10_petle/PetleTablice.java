package sekcja10_petle;

public class PetleTablice {
    public static void main(String[] args) {

        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {  // mniejsze o jeden od długości tablicy
            tab[i] = i+1;
            System.out.println("Indeks tablicy: " + i + "  Wartość w polu tablicy: " + tab[i] );

        }

    }
}
