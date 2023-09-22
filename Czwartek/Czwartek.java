package Czwartek;
public class Czwartek {
    public String Addiction(String a, String b) throws NumberFormatException {

        int num1 = Integer.parseInt(a);

        int num2 = Integer.parseInt(b);

        int suma = num1 + num2;

        String suma1 = Integer.toString(suma);

        return suma1;
    }

    public boolean PalindromChecker(String text) {

        int left = 0;

        text = text.replaceAll("\\s+", "").toLowerCase();

        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public boolean potatoes(int min, int max, int goal) {

        boolean[] potato = new boolean[goal + 1];
        potato[0] = true;

        for (int i = 1; i <= goal; i++) {

            if (i >= min && potato[i - min]) {
                potato[i] = true;
            }

            if (i >= max && potato[i - max]) {
                potato[i] = true;
            }
        }

        return potato[goal];
    }

}