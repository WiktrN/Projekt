public class Kalkulator {
    public void addiction(int a, int b) {
        System.out.println(a + b);
    }

    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    public void division(int a, int b) {
        if (b > 0) {
            System.out.println(a / b);
        } else {
            System.out.println("u can't divide by 0");
        }
    }

    public void calculate(int a, int b, String c) {
        if (c == "+") {
            System.out.println("Calling addiction");
            addiction(a, b);
        }
        if (c == "-") {
            subtraction(a, b);
        }
        if (c == "*") {
            multiplication(a, b);
        }
        if (c == "/") {
            division(a, b);
        }
    }
}