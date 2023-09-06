import java.util.*;

public class Main {
    public static void main(String[] args) {
        String c;
        int a;
        int b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter calculation type: ");
            c = sc.nextLine();
            System.out.print("Enter first number: ");
            a = sc.nextInt();
            System.out.print("Enter second number: ");
            b = sc.nextInt();
        }
        System.out.println("[" + c + "]");
        Kalkulator wynik = new Kalkulator();
        wynik.calculate(a, b, c);
    }
}