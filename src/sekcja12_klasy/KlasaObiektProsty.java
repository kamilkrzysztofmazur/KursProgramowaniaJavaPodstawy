package sekcja12_klasy;

public class KlasaObiektProsty {
    public static void main(String[] args) {
        int typProsty = 100;                        // typ prosty po odwołaniu pokazuje się wartość
        Przyklad przyklad = new Przyklad();         // tworzenie obiektu na podstawie Klasy
        Przyklad przykladDrugi = new Przyklad();    // tworzenie drugiego obiektu na podstawie tej samej Klasy

        przyklad.pole = 123;                        // inicjalizacja wartosci pola obiektu
        przykladDrugi.pole = 321;                   // inicjalizacja wartości pola drugiego obiektu

        System.out.println(przykladDrugi.pole);
        System.out.println(przyklad.pole);

        System.out.println(typProsty);              // wypisanie wartości typu prostego
        System.out.println(przyklad);               // wypisanie adresu obiektu w pamieciu



    }
}
