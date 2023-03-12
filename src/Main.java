import sekcja16_klasy_zadania.zadanie1.Programista;
import sekcja16_klasy_zadania.zadanie2.Tablica;
import sekcja16_klasy_zadania.zadanie3.Matma;

public class Main {
    public static void main(String[] args) {
        Programista programista = new Programista("Jan","Kowal", "Java", 5000);
        System.out.println("Imie: " + programista.pobierzImie());
        System.out.println("Nazwisko: "+ programista.pobierzNazwisko());
        System.out.println("Język: " + programista.pobierzJezyk());
        System.out.println("Zarobki: " + programista.pobierzZarobki());

        int[] tablicaPrzykładowa = {10, 50, 99, 101, 55};
        Tablica tablica = new Tablica(tablicaPrzykładowa);
        System.out.println(tablica.sumaElementow());
        System.out.println(tablica.sredniaElementow());
        System.out.println(tablica.maxElementow());
        System.out.println(tablica.minElementow());

        System.out.println(Matma.obwodKola(5));
        System.out.println(Matma.poleKola(5));
        System.out.println(Matma.obwodProstokata(3, 5));
        System.out.println(Matma.poleProstokata(3,5));
        System.out.println(Matma.minElementow(tablicaPrzykładowa));
    }
}