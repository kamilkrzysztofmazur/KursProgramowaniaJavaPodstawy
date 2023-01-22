package sekcja6_tablice;

public class TabliceZadania {
    public static void main(String[] args) {

        int[] tablica = {1, 2, 2, 3, 4};
        int suma = tablica[0] + tablica[1] + tablica[2] + tablica[3] + tablica[4];
        System.out.println("Suma elementów tablicy: " + suma);

        double[][] tablicDwuwymiarowa= {{1.2, 2.2, 3.2, 4.2, 5.2}, {1.2, 2.2, 3.2, 4.2, 5.2}, {1.2, 2.2, 3.2, 4.2, 5.2}};

        double suma1 = tablicDwuwymiarowa[0][0] + tablicDwuwymiarowa[0][1] + tablicDwuwymiarowa[0][2] + tablicDwuwymiarowa[0][3] + tablicDwuwymiarowa[0][4];
        double suma2 = tablicDwuwymiarowa[1][0] + tablicDwuwymiarowa[1][1] + tablicDwuwymiarowa[1][2] + tablicDwuwymiarowa[1][3] + tablicDwuwymiarowa[1][4];
        double suma3 = tablicDwuwymiarowa[2][0] + tablicDwuwymiarowa[2][1] + tablicDwuwymiarowa[2][2] + tablicDwuwymiarowa[2][3] + tablicDwuwymiarowa[2][4];

        System.out.println("Kolejne sumy wierszy: " + suma1 + ", " + suma2 + ", " + suma3);
    }
}
