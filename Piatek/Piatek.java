package Piatek;

public class Piatek {
    public int charAmount(String example1, char c1) {

        int suma = 0;

        for (int i = 0; i < example1.length(); i++) {
            if (example1.charAt(i) == c1) {
                suma++;
            }
        }

        return suma;
    }

    public boolean containsTwo(String example2, CharSequence c2) {

        String check = c2.toString() + c2.toString();

        for (int i = 0; i < example2.length(); i++) {
            if (example2.contains(check)) {
                return true;
            }
        }

        return false;
    }

    public String twoStrings(String example3, String example4) {

        String result = example3.replaceAll(example4, "");

        return result;
    }

    public boolean divideTable(int[] balance) {

        int suma = 0;

        for (int i = 0; i < balance.length; i++) {
            suma += balance[i];
            if (suma % 2 == 0) {
                return true;
            }
        }

        return false;
    }

}