public class Szyfr {
    static public void main(String[] args) {

        String zdanie = "Szyfr cezara";

        int move = 5;

        char[] wynik = szyfrCezara(zdanie, move);

        System.out.println(wynik);

    }

    public static char[] szyfrCezara(String zdanie, int move) {

        for (int i = 0; i < zdanie.length(); i++) {

            char[] actualValue = zdanie.toCharArray();

            int abc = actualValue[i];

            int wynik = abc + move;

            char newValue = (char) wynik;

            System.out.println(newValue);

        }

        char[] reasult = {};

        return reasult;
    }

}