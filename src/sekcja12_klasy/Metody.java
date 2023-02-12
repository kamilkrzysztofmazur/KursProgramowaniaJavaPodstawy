package sekcja12_klasy;

public class Metody {
    public static void main(String[] args) {
        KlasaDlaMetod nazwaObiektu = new KlasaDlaMetod();     // tworzenie obiektu po klasie KlasaDlaMetod
        nazwaObiektu.metodaKtoraNicNieZwraca();                 // wywołanie metody która nic nie zwraca
        nazwaObiektu.metodaKtoraPrzyjmujeArgument(5, 'm'); // wywołanie metody z przekazaniem argumentu
        nazwaObiektu.nazewnictwoDowolneAleKolejnaMetoda(false, 100);  // to samo co powyzej

        int wynikDodawania = nazwaObiektu.dodawanie(10, 5);  // deklaracja i inicjalizacja zmiennej wartości z metody z przekazaniem argumentów
        System.out.println("wynikDodawania: " + wynikDodawania);

        double wynikKolejnejMetody = nazwaObiektu.dodajCosPoPrzecinku(10.1); // deklaracja i inicjalizacja zmiennej double z metody z przekazaniem argumentów
        System.out.println("Double: " + wynikKolejnejMetody);

        nazwaObiektu.voidKtoryMialbyCosZwracac(true);  // wywołanie metody void na obiekcie

    }


}
