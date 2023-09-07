import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int a;
        int b;
        String c;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter calculation type: ");
        c = reader.readLine();
        System.out.print("Enter first number: ");
        a = Integer.parseInt(reader.readLine());
        System.out.print("Enter second number: ");
        b = Integer.parseInt(reader.readLine());

        Kalkulator wynik;
        wynik = new Kalkulator();
        int suma = wynik.calculate(a, b, c);

        System.out.println("Your result is: " + suma);
    }
}