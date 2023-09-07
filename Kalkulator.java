public class Kalkulator {

    public int calculate(int a, int b, String c) {
        if (c.equals("+")) {
            return addiction(a, b);
        }
        if (c.equals("-")) {
            return subtraction(a, b);
        }
        if (c.equals("*")) {
            return multiplication(a, b);
        }
        if (c.equals("/")) {
            return division(a, b);
        } 

        return 0;
    }

    public int addiction(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b > 0) {
            return a / b;
        } else {
            System.out.println("You can't divide by 0");
            return 0;
        }
    }
}