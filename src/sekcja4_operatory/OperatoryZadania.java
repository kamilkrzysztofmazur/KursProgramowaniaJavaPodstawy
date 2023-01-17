package sekcja4_operatory;

public class OperatoryZadania {
    public static void main(String[] args) {
        double wiek = 37;
        double wzrost = 1.85;
        double waga = 88;
        System.out.println("Mój wiek, wzrost, waga to odpowiedio: " + wiek + " lat, " + wzrost + " m, " + waga + " kg" );

        double BMI = waga / (wzrost * wzrost);
        System.out.println("Mój BMI wynosi: " + BMI);

        int BMIInt = (int) BMI;
        System.out.println("Mój BMI po konwersji na Int wynosi: " + BMIInt);

        int dowolnaLiczba = 11;
        int a = 2;
        int b = 3;
        int c = 11;

        System.out.println("Wynik dzielenia wynosi: " + dowolnaLiczba / a);
        System.out.println("Reszta dzielenia wynosi: "+ dowolnaLiczba % a);

        System.out.println("Wynik dzielenia wynosi: " + dowolnaLiczba / b);
        System.out.println("Reszta dzielenia wynosi: "+ dowolnaLiczba % b);

        System.out.println("Wynik dzielenia wynosi: " + dowolnaLiczba / c);
        System.out.println("Reszta dzielenia wynosi: "+ dowolnaLiczba % c);

        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi = x < 10 && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);

    }
}
