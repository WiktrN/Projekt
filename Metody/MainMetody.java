package Metody;
public class MainMetody {

    public static void main(String args[]) {

        // stringName
        String a = "Name ";

        // stringLength
        String b = "Something";

        // stringInt
        String c = "RandomText ";
        int d = 3;

        // stringTrueFalse
        String e = "Example";
        int f = 8;

        // stringTable
        String[] g = { "Name1127512","", "Name234", "Name33444781872578879", "buifbhidfiubfabiufbiuiuafuibuifbuiasbiufsaubi" };

        // intTable
        int[] numbers = { 2555, 2445, 2555, 2445 };

        // stringIntTable
        String[] j = { "Czerwony", "Zolty", "Bialy", "Czarny", "Niebieski" };
        int stringLength = 5;

        // intStringTable
        int[] k = { 23, 12, 48, 19, 3, 2, 86, 18, 21 };

        Metody metodyOutput = new Metody();

        System.out.println("1. " + metodyOutput.stringName(a));
        System.out.println("2. " + metodyOutput.stringLength(b));
        System.out.println("3. " + metodyOutput.stringInt(c, d));
        System.out.println("4. " + metodyOutput.stringTrueFalse(e, f));

        int[] Table = metodyOutput.stringTable(g);

        for (int dlugoscTable : Table) {
            System.out.println(dlugoscTable);
        }

        System.out.println("6. " + metodyOutput.intTable(numbers));

        String[] strTablee = metodyOutput.stringIntTable(j, stringLength);

        for (String strInt : strTablee) {
            System.out.println("7. " + strInt);
        }

        System.out.println("8. " + metodyOutput.intStringTable(k));
    }
}