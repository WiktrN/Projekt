public class Kalkulator {

    public int calculate(int a, int b, String c) {
        switch (c){
            case"+": {
                return addiction(a, b);
            }
            case"-": {
                return subtraction(a, b);
            }
            case"*": {
                return multiplication(a, b);
            }
            case"/": {
                return division(a, b);
            }
            default: {
                System.out.println("Error");
                return 0;
            }

        }
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