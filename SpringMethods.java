public class SpringMethods {

    String tekst = "to jest przykładowy test ";
    String tekst2 = "to jest drugi przykładowy test ";

    public String toUpperCaseTest() {
        String test = tekst.toUpperCase();
        return test;
    }

    public String toLowerCaseTest() {
        String test = tekst.toLowerCase();
        return test;
    }

    public boolean isEmptyTest() {
        boolean test = tekst.isEmpty();
        return test;
    }

    public int lengthTest() {
        int test3 = tekst.length();
        return test3;
    }

    public char charAtTest() {
        char test = tekst.charAt(3);
        return test;
    }

    public String[] splitTest() {
        String[] test = tekst.split(" ");
        return test;
    }

    public String replaceTest() {
        String test = tekst.replace("jest", "dupa");
        return test;
    }

    public boolean equalsTest() {
        boolean test = tekst.equals(tekst2);
        return test;
    }

    public boolean containsTest() {
        boolean test = tekst2.contains("drugi");
        return test;
    }

    public boolean startsWithTest() {
        String slowo = "to jest";
        boolean test = tekst.startsWith(slowo, 0);
        return test;
    }

    public String trimTest() {
        String tekst1 = "           to jest tekst drugi         ";
        String test = tekst1.trim();
        return test;
    }

    public char[] toCharArrayTest() {
        char[] test = tekst.toCharArray();
        return test;
    }

    public String substringTest() {
        String test = tekst.substring(2, 7);
        return test;
    }

    public CharSequence subSequenceTest() {
        CharSequence test = tekst.subSequence(7, 19);
        return test;
    }

    public boolean matchesTest() {
        boolean test = tekst.matches(tekst2);
        return test;
    }

    public int indexOfTest() {
        int test = tekst.indexOf("jest");
        return test;
    }

    public String concatTest() {
        String test = tekst.concat(tekst2);
        return test;
    }

    public boolean endsWithTest() {
        boolean test = tekst.endsWith("test ");
        return test;
    }

    public int compareToTest() {
        int test = tekst.compareTo(tekst2);
        return test;
    }

    public byte[] getBytesTest() {
        byte[] test = tekst.getBytes();
        return test;
    }
}