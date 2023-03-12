package sekcja15_klasy_cd;

public class NazwaKlasy {
    // najpierw wypisać pola statyczne później final a potem metody
    // pole obkt takie samo dla wszystkich obiektów i nie może się zmieniać
    public static final String NAZWA_STRING = "nazwa string";
    // pole prywatne
    private String polePrywatneString = "jakiś prywatny tekst";


    //metoda niezwracajaca void
    public void nazwaMetodyVoid() {
        System.out.println(("Wypisałem z metody void"));
    }

    private int metodaZwracaInta(int a) {
        return a;
    }
}
