package sekcja13_string;

public class StringZadania {
    public static void main(String[] args) {

        String imie = "Kamil";
        String nazwisko = "Mazur";
        String imieINazwisko = "Kamil Mazur";

        System.out.println(imie.length() + " " +  nazwisko.length() + " " +  imieINazwisko.replace(" ","" ).length());
        System.out.println(imie.equals("Alicja"));
        System.out.println(imie.equals("Jan"));
        System.out.println(nazwisko.toUpperCase());
        System.out.println(nazwisko.replace('a','e'));

        String zdanie = "Potrafię coraz więcej z programowania.";

        for (int licznik = 0; licznik < zdanie.length(); licznik ++) {
            System.out.println(zdanie.charAt(licznik));
        }

        for (int licznik = zdanie.length() -1; licznik >= 0; licznik --) {
            System.out.println(zdanie.charAt(licznik));
        }


    }
}
