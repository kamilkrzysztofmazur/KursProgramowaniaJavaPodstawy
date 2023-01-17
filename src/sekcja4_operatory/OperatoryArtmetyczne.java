package sekcja4_operatory;

public class OperatoryArtmetyczne {
    public static void main(String[] args) {
        // aritmetic operators

        System.out.println(3 + 5);
        System.out.println(3 - 5);
        System.out.println(3 * 5);
        System.out.println(3 / 5);
        // reszta dzielenia
        System.out.println(10 % 3);

        int a = 20;
        int b = 2;

        int suma = a +b;
        System.out.println("Suma: " + suma);
        int różnica = a - b;
        System.out.println("Różnica: " + różnica);
        int iloczyn = a * b;
        System.out.println("Iloczyn; " + iloczyn);
        double iloraz = a/ b;
        System.out.println("Iloraz: " + iloraz);
        int reszta = a % b;
        System.out.println("Reszta dzielenia: "+ reszta);

        // skróty artmetyczne
        a +=b;
        System.out.println("a = a + b: " + a);

        a -=b;
        System.out.println("a = a - b: " + a);

        a *= b;
        System.out.println("a = a * b: " + a);

        a /= b;
        System.out.println("a = a / b: " + a);

        a %= b;
        System.out.println("a = a % b: " + a);

        a += 1;
        System.out.println("a = a + 1: " + a);

        // inkrementacja
        a++;
        System.out.println("a++ : " + a);

        // dekrementacja
        a--;
        System.out.println("a-- : " + a);


    }
}
