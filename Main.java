import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String x;
        do {
            String c;
            int b;
            int a;
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.print("Enter calculation type: ");
            c = reader.readLine();
            System.out.print("Enter first number: ");
            a = Integer.parseInt(reader.readLine());
            System.out.print("Enter second number: ");
            b = Integer.parseInt(reader.readLine());

            Kalkulator wynik = new Kalkulator();
            int suma = wynik.calculate(a, b, c);

            System.out.println("Your result is: " + suma + '\n');

            System.out.print("Do you want to continue Y/n ");
            x = reader.readLine();

        } while (x.equals("y"));
    }
}