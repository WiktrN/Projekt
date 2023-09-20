public class Zadanie1a {
    public int lowHigh(int[] tab) {

        int wynik = 0;
        int temp = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }

            }

        }

        wynik = tab[tab.length - 1] - tab[0];

        return wynik;
    }

}
// tablica intow i zwraca róźnice między najwiekszym a najmniejszym