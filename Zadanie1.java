public class Zadanie1 {
    public static void main(String[] args) {

        int[] tab = { 40, 30, 50, 10, 20 };

        Zadanie1a lH = new Zadanie1a();

        int difference = lH.lowHigh(tab);

        System.out.println("Róznica miedzy liczba najmniejsza a najwieksza wynosi " + difference);

    }

}
// tablica intow i zwraca róźnice między najwiekszym a najmniejszym