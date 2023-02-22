package sekcja13_string;

public class StringMetody {
    public static void main(String[] args) {
        String tekst = "Jakiś tekst";
        System.out.println("Length: " +tekst.length());

        System.out.println(tekst.isEmpty());

        char pojedyczyZnak = tekst.charAt(3);
        System.out.println(pojedyczyZnak);

        System.out.println(tekst.substring(1, 3));

        String nowyString = "  sjvkjnaskvnkas aslkdf       ";
        System.out.println("." + nowyString + ".");
        System.out.println("." + nowyString.trim() + ".");

        String rozneWielkosciLiter = "Rożne litery małe i Duże";
        System.out.println(rozneWielkosciLiter.toLowerCase());
        System.out.println(rozneWielkosciLiter.toUpperCase());

        String czyZawiera = "Czy zawiera";
        String czyZawieraMaleZnaki = czyZawiera.toLowerCase();
        System.out.println(("StartsWith: " + czyZawieraMaleZnaki.startsWith("czy")));

        String czyZawieraKoncowke = "Jakis teksta koncowka";
        System.out.println("endWith: " + czyZawieraKoncowke.endsWith("koncowka"));

        System.out.println("contains: " + czyZawiera.contains("Czy"));

        System.out.println("Zamiana: " + czyZawiera.replace('a','b'));


    }
}
