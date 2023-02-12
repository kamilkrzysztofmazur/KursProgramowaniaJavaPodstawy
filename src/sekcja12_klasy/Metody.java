package sekcja12_klasy;

public class Metody {
    public static void main(String[] args) {
        KlasaDlaMetod nazwaObiektu = new KlasaDlaMetod();
        nazwaObiektu.metodaKtoraNicNieZwraca();
        nazwaObiektu.metodaKtoraPrzyjmujeArgument(5, 'm');
        nazwaObiektu.nazewnictwoDowolneAleKolejnaMetoda(false, 100);

        int wynikDodawania = nazwaObiektu.dodawanie(10, 5);
        System.out.println("wynikDodawania: " + wynikDodawania);

        double wynikKolejnejMetody = nazwaObiektu.dodajCosPoPrzecinku(10.1);
        System.out.println("Double: " + wynikKolejnejMetody);

        nazwaObiektu.voidKtoryMialbyCosZwracac(true);

    }


}
