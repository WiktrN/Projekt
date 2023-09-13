public class MainString {
    public static void main(String[] args) {
        SpringMethods test = new SpringMethods();

        String a = test.toUpperCaseTest();
        System.out.println('\n' + "1. toUpperCaseTest: " + a);

        String b = test.toLowerCaseTest();
        System.out.println("2. toLowerCaseTest: " + b);

        boolean c = test.isEmptyTest();
        System.out.println("3. isEmptyTest: " + c);

        int d = test.lengthTest();
        System.out.println("4. lengthTest: " + d);

        char e = test.charAtTest();
        System.out.println("5. charAtTest: " + e);

        String[] f = test.splitTest();
        System.out.println("6. splitTest: " + f[2]);

        String g = test.replaceTest();
        System.out.println("7. replaceTest: " + g);

        boolean h = test.equalsTest();
        System.out.println("8. equalsTest: " + h);

        boolean i = test.containsTest();
        System.out.println("9. containsTest: " + i);

        boolean j = test.startsWithTest();
        System.out.println("10. startsWithTest: " + j);

        String k = test.trimTest();
        System.out.println("11. trimTest: " + "to jest tekst pierwszy, " + k);

        char[] l = test.toCharArrayTest();
        System.out.println("12. toCharArrayTest: " + l[5]);

        String m = test.substringTest();
        System.out.println("13. substringTest: " + m);

        CharSequence n = test.subSequenceTest();
        System.out.println("14. subSequence: " + n);

        boolean o = test.matchesTest();
        System.out.println("15. matchesTest: " + o);

        int p = test.indexOfTest();
        System.out.println("16. indexOfTest: " + p);

        String r = test.concatTest();
        System.out.println("17. concatTest: " + r);

        boolean s = test.endsWithTest();
        System.out.println("18. endsWithTest: " + s);

        int t = test.compareToTest();
        System.out.println("19. compareToTest: " + t);

        byte[] w = test.getBytesTest();
        System.out.println("20. getBytesTest: " + w + '\n');
    }
}