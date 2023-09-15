public class Main {

    public static void main(String[] args) {

        // stringName
        String a = "Name ";

        // stringLength
        String b = "Something";

        // stringInt
        String c = "RandomText ";
        int d = 3;

        // stringTrueFalse
        String e = "Example";
        int f = 7;

        Metody metodyOutput = new Metody();

        System.out.println(metodyOutput.stringName(a));
        System.out.println(metodyOutput.stringLength(b));
        System.out.println(metodyOutput.stringInt(c, d));
        System.out.println(metodyOutput.stringTrueFalse(e, f));
    }
}
