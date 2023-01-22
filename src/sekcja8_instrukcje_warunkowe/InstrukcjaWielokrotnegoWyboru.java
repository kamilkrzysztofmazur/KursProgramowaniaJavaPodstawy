package sekcja8_instrukcje_warunkowe;

public class InstrukcjaWielokrotnegoWyboru {
    public static void main(String[] args){
        // switch

        int zmienna = 5;

        switch (zmienna) {
            case 1:
                System.out.println("jeden");
                break;                          // karze przerwać switcha
            case 2:
                System.out.println("dwa");
                break;
            case 3:
                System.out.println("trzy");
                break;
            default:
                System.out.println("niespełniono przypadków SWITCH");
        }

        char pojedynczyZnak = 'b';
        switch (pojedynczyZnak) {
            case 'a':
                System.out.println("Podałeś małe a");
                break;
            case 'A':
                System.out.println("Podałeś duże A");
                break;
            default:
                System.out.println("Nie znam tego znaku");
                break;

        }

        System.out.println("Będzie wykonywany if");
        if (zmienna == 1) {
            System.out.println("jeden");
        } else if (zmienna == 2) {
            System.out.println("dwa");
        } else if (zmienna == 3) {
            System.out.println("trzy");
        } else if (zmienna == 5 ) {
            System.out.println("pięć");
        } else {
            System.out.println("Nie znam tej liczby");
        }
        System.out.println("Kalendarz:");
        int miesiac = 3;
        switch (miesiac) {              // zliczenie ile miesięcy pozostało do końca roku
            case 1:
                System.out.println("styczen");
            case 2:
                System.out.println("luty");
            case 3:
                System.out.println("marzec");
            case 4:
                System.out.println("kwiecien");
            case 5:
                System.out.println("maj");
            case 6:
                System.out.println("czerwiec");
        }

    }
}
