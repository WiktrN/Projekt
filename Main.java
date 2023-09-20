public class Main {
    public static void main(String[] args) {

        int[] tab = new int[] { 20, 15, 10, 30, 35, 25, 40 };

        int temp = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] > (tab[j])) {
                    temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
            System.out.println(tab[i]);

        }

    }

}