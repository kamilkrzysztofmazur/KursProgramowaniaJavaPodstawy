package sekcja16_klasy_zadania.zadanie1;

public class Programista {
    private String imie;
    private String nazwisko;
    private String jezyk;
    private int zarobki;

    public Programista(String podajImie, String podajNazwisko, String podajJezyk, int podajZarobki) {
        imie = podajImie;
        nazwisko =podajNazwisko;
        jezyk = podajJezyk;
        zarobki = podajZarobki;
    }

    public String pobierzImie() {
        return imie;
    }

    public String pobierzNazwisko() {
        return nazwisko;
    }

    public String pobierzJezyk() {
        return jezyk;
    }
    public int pobierzZarobki() {
        return zarobki;
    }


}
