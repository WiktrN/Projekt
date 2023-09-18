public class Main {
    public static void main(String[] args) {

        MetodyV2 metody = new MetodyV2();

        // countWords
        String zdanie = "to jest przykladowe zdanie";

        int result1 = metody.countWords(zdanie);

        System.out.println(result1);

        // existsHigher
        int[] z = { 5, 3, 15, 22, 4 };
        int y = 0;

        boolean result2 = metody.existsHigher(z, y);

        System.out.println(result2);

        // switchString
        String imie = "Donald Trump";

        String result3 = metody.switchString(imie);

        System.out.println(result3);

        // checkduplicates
        int[] tabelaIntow = { 3, 2, 3};

        int result4 = metody.checkduplicates(tabelaIntow);

        System.out.println(result4);

    }
}