package Piatek;

public class MainPiatek {
    public static void main(String[] args) {

        Piatek name = new Piatek();

        // Char amount

        String example1 = "JakaśNazwa";
        char c1 = 'a';

        int wynik1 = name.charAmount(example1, c1);

        System.out.println(wynik1);

        // Contains two

        String example2 = "arrarrarrarr";
        char c2 = 'r';

        boolean wynik2 = name.containsTwo(example2, c2);

        System.out.println(wynik2);

        // Two strings

        String example3 = "Hello there";
        String example4 = "llo";

        String wynik3 = name.twoStrings(example3, example4);

        System.out.println(wynik3);

        // divide table

        int[] balance = { 1, 1, 1, 2, 1 };
        // int[] balance = { 2, 1, 1, 2, 1};
        // int[] balance = { 10, 10};

        boolean wynik4 = name.divideTable(balance);

        System.out.println(wynik4);

    }

}