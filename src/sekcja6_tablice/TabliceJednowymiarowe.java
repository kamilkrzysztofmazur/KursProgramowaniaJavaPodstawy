package sekcja6_tablice;

public class TabliceJednowymiarowe {
    public  static void main(String[] args) {
        // arrays

        int[] tablica;
        tablica = new int[10];
        // tablica[index]
        tablica[0] = 5;
        tablica[1] = 10;
        tablica[2] = 15;
        tablica[3] = 155;

        System.out.println(tablica[3]);

        double[] tablicaDouble = new double[5];
        tablicaDouble[0] = 12.5;
        tablicaDouble[1] = 55.5;
        tablicaDouble[2] = 111.11;
        System.out.println(tablicaDouble[0]);

        char[] tablicaChar = new char[100];
        System.out.println(tablicaChar[99]);

        int[] nowaTablica = new int[] {10, 50, 99, 101, 55};
        System.out.println(nowaTablica[4]);

        System.out.println("tablica rozmiar: " + tablica.length);
        System.out.println("tabliaDoubli rozmiwar: " + tablicaDouble.length);
        System.out.println("tablicaChra rozmiar: " + tablicaChar.length);
        System.out.println("nowaTablica rozmiar: " + nowaTablica.length);









    }
}
