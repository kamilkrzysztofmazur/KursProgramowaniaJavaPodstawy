package sekcja16_klasy_zadania.zadanie2;

public class Tablica {

    private int[] tablica;

    public Tablica(int[] podajTablice){
        tablica = podajTablice;
    }
    public int sumaElementow(){
        int suma = 0;
        for (int i = 0; i < tablica.length; i++){
            suma = suma + tablica[i];
        }
        return suma;
    }

    public int sredniaElementow(){
        return sumaElementow() / tablica.length;
    }

    public int maxElementow(){
        int max = tablica[0];
        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }

    public int minElementow(){
        int min = tablica[0];
        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        return min;
    }



}
