package sekcja12_klasy;

public class KlasaZPolami {
    int liczbaCalkowita;       // deklaracja pola w klasie

    void zwrocWartoscPola() {       // deklaracja metody niezwracajacej void
        System.out.println("Zwrócona wartość pola: " + liczbaCalkowita);
    }
    void ustawWartoscPola(int wartosc){  // deklaracja metody nie zwracajacej void
        liczbaCalkowita = wartosc;
    }
    int zwrocWartoscPolaZMetody() {
        return liczbaCalkowita;
    }
}
