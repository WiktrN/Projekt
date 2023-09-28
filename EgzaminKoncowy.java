public class EgzaminKoncowy {
    public static void main(String[] args) {

        EgzaminMetods em = new EgzaminMetods();

        // 1 xyz boolean
        // ------------------------------------------------------------------------------

        String xyzThere = "abcxyz";
        // String xyzThere = "abc.xyz";
        // String xyzThere = "xyz.abc";

        boolean wynik1 = em.xyz(xyzThere);

        System.out.println(wynik1);

        // 2 chocolate string
        // ------------------------------------------------------------------------------

        String repeatFront = "Chocolate";
        int num = 4;

        String wynik2 = em.chocolate(repeatFront, num);

        System.out.println(wynik2);

        // 3 zip zap

        String zipZap = "zipXzap";

        String wynik3 = em.zipAndZap(zipZap);

        System.out.println(wynik3);

        // 4 evenlySpaced
        // ------------------------------------------------------------------------------

        int a1 = 2;
        int b1 = 4;
        int c1 = 6;

        boolean wynik4 = em.evenlySpaced(a1, b1, c1);

        System.out.println(wynik4);

        // 5 makeChocolate
        // ------------------------------------------------------------------------------

        int a2 = 4;
        int b2 = 1;
        int c2 = 7;

        int wynik5 = em.makeChocolate(a2, b2, c2);

        System.out.println(wynik5);

        // 6 luckySum
        // ------------------------------------------------------------------------------

        int a3 = 1;
        int b3 = 2;
        int c3 = 3;

        int wynik6 = em.luckySum(a3, b3, c3);

        System.out.println(wynik6);

        // 7 mirrorEnds
        // ------------------------------------------------------------------------------

        String text = "abXYZba";
        // String text = "abca";
        // String text = "aba";

        String wynik7 = em.mirrorEnds(text);

        System.out.println(wynik7);

        // 8 fix34
        // ------------------------------------------------------------------------------

        int[] nums = { 1, 3, 1, 4 };

        int[] wynik8 = em.fix34(nums);

        System.out.println(wynik8);

        // 9 countClups
        // ------------------------------------------------------------------------------

        int[] clump = { 1, 2, 2, 3, 4, 4 };

        int wynik9 = em.countClumps(clump);

        System.out.println(wynik9);

    }

}