package MetodyV2;

public class MetodyV2 {

    public int countWords(String zdanie) {
        String[] slowa = zdanie.split(" ");

        if (zdanie.isEmpty()) {
            return 0;
        }

        return slowa.length;
    }

    public boolean existsHigher(int[] array, int z) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= z) {
                return true;
            }
        }

        return false;
    }

    public String switchString(String imie) {
        String[] imie2 = imie.split(" ");

        if (imie2.length > 2) {
            return "nie ogarniam";
        } else {
            return imie2[1] + " " + imie2[0];
        }
    }
}