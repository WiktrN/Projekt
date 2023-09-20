package CheckDuplicated;

public class check {
    public static int duplicates(int[] tab) {

        int[] nTab = new int[tab.length];

        int k = 0;

        for (int i = 0; i < tab.length; i++) {

            boolean isDuplicated = secondCode(nTab, tab[i]);

            if (!isDuplicated) {
                nTab[i] = tab[i];
            } else {
                System.out.println(tab[i]);
                k++;
            }

        }
        return k;
    }

    public static boolean secondCode(int[] tab, int sTable) {

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == sTable) {
                return true;
            }

        }
        return false;
    }

}