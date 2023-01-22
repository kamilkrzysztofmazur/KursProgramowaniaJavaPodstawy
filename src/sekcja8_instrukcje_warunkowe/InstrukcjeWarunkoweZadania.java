package sekcja8_instrukcje_warunkowe;

public class InstrukcjeWarunkoweZadania {
    public static void main(String[] args) {

        int zmienna = 4;

        if (zmienna % 2 == 1) {
            System.out.println("Podana liczba jest nieparzysta");
        } else {
            System.out.println("Podana liczba jest parzysta");
        }

        int dochod = 89000;
        double podatek;

        if (dochod <= 82528) {
            podatek = dochod * 0.17;
        } else {
            podatek = dochod * 0.32;
        }
        System.out.println("Podatek wynosi: " + podatek);

        int pierwszaLiczba = 2;
        int drugaLiczba = 3;
        char dzialanie = '/';
        double wynik;

        switch (dzialanie) {
            case '*':
                wynik = pierwszaLiczba * drugaLiczba;
                System.out.println("Wynik mnożenia wynosi: " + wynik);
                break;
            case '/':
                wynik = pierwszaLiczba / drugaLiczba;
                System.out.println("Wynik dzielenia wynosi: " + wynik);
                break;
            case '+':
                wynik = pierwszaLiczba + drugaLiczba;
                System.out.println("Wynik dodawania wynosi: " + wynik);
                break;
            case '-':
                wynik = pierwszaLiczba - drugaLiczba;
                System.out.println("Wynik odejmowania wynosi: " + wynik);
                break;

        }



    }
}
