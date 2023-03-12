package sekcja16_klasy_zadania.zadanie3;

public class Matma {
    public static final double PI = 3.14;

    public static double obwodKola(double promien) {
        return 2 * PI * promien;
    }
    public static double poleKola(double promien) {
        return PI * promien * promien;
    }
    public static double obwodProstokata(double a, double b) {
        return 2 * (a + b);
    }

    public static double poleProstokata(double a, double b) {
        return a * b;
    }
    public static int sumaElementow(int[] tablica){
        int suma = 0;
        for (int i = 0; i < tablica.length; i++){
            suma = suma + tablica[i];
        }
        return suma;
    }

    public static int sredniaElementow(int[] tablica){
        return sumaElementow(tablica) / tablica.length;
    }

    public static int maxElementow(int[] tablica){
        int max = tablica[0];
        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }

    public static int minElementow(int[] tablica){
        int min = tablica[0];
        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        return min;
    }
}
