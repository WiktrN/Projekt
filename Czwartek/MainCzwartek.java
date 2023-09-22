package Czwartek;
public class MainCzwartek {
    public static void main(String[] args) {

        Czwartek name = new Czwartek();

        // Addiction
        String a = "20";
        String b = "30";

        String wynik1 = name.Addiction(a, b);

        System.out.println(wynik1);

        // Palindrom checker
        String text = "oktttko";

        boolean wynik2 = name.PalindromChecker(text);

        System.out.println(wynik2);

        // Potatoes
        int min = 3;
        int max = 12;
        int goal = 12;

        boolean wynik3 = name.potatoes(min, max, goal);

        System.out.println(wynik3);
    }

}