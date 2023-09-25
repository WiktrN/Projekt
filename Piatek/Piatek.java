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

    public boolean containsTwo(String example2, char c2) {

        boolean check = false;

        for (int i = 0; i < example2.length() - 1; i++) {
            if (example2.charAt(i) == c2 && example2.charAt(i + 1) != c2) {
                check = false;
            }
            if (example2.charAt(i) == c2 && c2 == example2.charAt(i + 1)) {
                check = true;
            }
        }
        return check;
    }

    public String twoStrings(String example3, String example4) {

        String result = example3.replaceAll(example4, "");

        return result;
    }

    public boolean divideTable(int[] balance) {

        int suma = 0;

        for (int num : balance) {
            suma += num;
        }

        if (suma % 2 != 0) {
            return false;
        }

        int targetSum = suma / 2;
        int currentSum = 0;

        for (int num : balance) {
            currentSum += num;
            if (currentSum == targetSum) {
                return true;
            }
            if (currentSum > targetSum) {
                return false;
            }
        }

        return false;
    }

}