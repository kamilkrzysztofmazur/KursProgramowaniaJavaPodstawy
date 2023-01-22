package sekcja8_instrukcje_warunkowe;

public class InstrukcjaWarunkowa {
    public static void main(String[] args) {
        // conditionalstsments

        int wiek = 15;
        boolean przyszedlTata = false;

        if (wiek >= 18) {
            System.out.println("Warunek został spełniony");
        } else if (przyszedlTata) {                 // w domyśle == true
            System.out.println("Dodatkowy warunek spełniony");
        } else {
            System.out.println("Wykonano sprawdzenie, warunek nie został spełniony");
        }


    }
}
