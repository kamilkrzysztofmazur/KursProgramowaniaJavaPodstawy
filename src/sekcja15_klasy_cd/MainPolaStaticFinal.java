package sekcja15_klasy_cd;

public class MainPolaStaticFinal {
    public static void main(String[] args) {
        KlasaStaticFinal obiekt = new KlasaStaticFinal();
        obiekt.pole = 10;

        KlasaStaticFinal.poleStatic = 15;   // pole static jest jedną komórką w pamięci dla wszystkich obiektów w Klasie
        obiekt.poleStatic = 123;

        System.out.println(KlasaStaticFinal.poleStatic);
        KlasaStaticFinal.metodaStatyczna();

        // final
        System.out.println("pole final: " + obiekt.poleFinal);

        //static final
        System.out.println("sttic final: " + KlasaStaticFinal.JAKIS_TEKST);


    }
}
