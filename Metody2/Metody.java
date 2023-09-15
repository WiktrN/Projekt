package Metody2;
class Metody {
    public String stringName(String a) {
        return "Siemano " + a;
    }

    public String stringLength(String b) {
        return (b + ": " + b.length());
    }

    public String stringInt(String c, int d) {
        return c.repeat(d);
    }

    public boolean stringTrueFalse(String e, int f) {
        return (e.length() == f);
    }

    public int stringTable(String[] g, int i) {
        return g[i].length();
    }

    public int intTable(int[] h) {
        return h[0] + h[1];
    }

    public String[] stringIntTable(String[] j, int stringLength) {
        String[] strTable = j;

        for (int z = 0; z < strTable.length; z++) {
            if (strTable[z].length() <= stringLength) {
                strTable[z] = strTable[z];
            } else {
                strTable[z] = strTable[z].substring(0, stringLength);
            }
        }
        return strTable;
    }

    public String intStringTable(int[] k) {
        int parzyste = 0;
        int nieparzyste = 0;

        for (int num : k)
            if (num % 2 == 0) {
                parzyste++;
            } else {
                nieparzyste++;
            }
        return "Parzystych licz jest " + parzyste + " a nieparzystych jest " + nieparzyste;
    }
}