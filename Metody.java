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
}
