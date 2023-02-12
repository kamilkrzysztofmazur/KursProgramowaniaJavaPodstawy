package sekcja12_klasy;

public class Pola {
    public static void main(String[] args) {
        // fields

        KlasaZPolami obiekt = new KlasaZPolami();   // tworzenie obiektu na podstawie  KlasaZPolami
        obiekt.liczbaCalkowita = 15;                // inicjalizacja wartości pola
        System.out.println(obiekt.liczbaCalkowita);

        obiekt.ustawWartoscPola(101);                   // wywołanie metody na obiekcie z przekazaniem argumentu

        obiekt.zwrocWartoscPola();                      // wywołanie metodu zwracającej wartość

        obiekt.ustawWartoscPola(202);                   // ponowne wywołanie metody powodujace nadpisanie warości pola

        int zmienn = obiekt.zwrocWartoscPolaZMetody();  // deklaracja i inicjalizacja zmiennej wartości pola obiektu za pomocą metody
        System.out.println("Zmiaenna: " + zmienn);

    }

}
