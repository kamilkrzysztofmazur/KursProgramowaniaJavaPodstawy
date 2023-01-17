package sekcja3_zmienne;

public class TypyProsteKonwertowanie {
    public static void main(String[] args) {
        int i = 6;
        double d = 2.2;
        System.out.println(i / d);

        double d2 = i;
        byte by = 100;
        int i2 = by;
        // by = i2; brak możliwości przypisania ponieważ zmiennej o mniejszej wartości w pamięci przypisywana jest wartosc zmiennej o wiekszej wartosci w pamieci

        float f = 123.22f;
        d2 = f;

        int zmiennaInt = 123;

        // konwertowanie nie jawne
        long zmiennaLong = zmiennaInt;

        // konwertowanie jawne (rzutowanie)
        zmiennaInt = (int) zmiennaLong;

        zmiennaLong = 12348313835L;

        byte bajt = 102;
        short shor = 10022;
        int in = 123432424;

        in = bajt;
        in = shor;

        shor = bajt;
        bajt = (byte) in;
        System.out.println("bajt:"  + bajt);

        int intObliczenia = 6;
        double doubleObliczenia = 2.9;

        double wynik = intObliczenia / doubleObliczenia;
        int wynik2 = intObliczenia / (int) doubleObliczenia;

        System.out.println(wynik);
        System.out.println(wynik2);
        System.out.println((int) doubleObliczenia);

        char c = 'C';
        int czarowanieInt = c;
        System.out.println("Zakodowany char na INT: " + czarowanieInt);


    }
}
