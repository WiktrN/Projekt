class Metody {
    public String stringName() {
        String a = "Name";
        return "Siemano " + a;
    }

    public String stringLength() {
        String b = "Something";
        return (b + ": " + b.length());
    }

    public String stringInt() {
        String c = "RandomText ";
        int d = 3;
        return c.repeat(d);
    }

    public boolean stringTrueFalse() {
        String e = "Example";
        int f = 7;
        return (e.length() == f);
    }
}
