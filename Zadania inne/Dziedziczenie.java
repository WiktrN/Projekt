

public class Dziedziczenie {
    public static void main(String[] args) {

        Samochod cze = new Czerwony();

        Samochod zie = new Zielony();

        cze.klakson();

        zie.klakson();

    }

}

class Czerwony extends Samochod {
    public Czerwony() {

        kolor = "czerwony";

        drzwi = 5;

        szyberDach = true;

        klakson = "dźwięk klaksonu czerwonego samochodu";

    }

    public void klakson() {
        System.out.println("dźwięk klaksonu czerwonego samochodu");
    }

}

class Zielony extends Samochod {
    public Zielony() {

        kolor = "zielony";

        drzwi = 3;

        szyberDach = false;

        klakson = "dźwięk klaksonu zielonego samochodu";

    }

    public void klakson() {
        System.out.println("dźwięk klaksonu zielonego samochodu");
    }

}

class Samochod {

    String kolor;

    String klakson;

    int drzwi;

    boolean szyberDach;

    public void klakson() {
        System.out.println("dźwięk klaksonu " + " samochodu");
    }

}