public class Main {
    public static void main(String[] args) {

        Url name = new Url();

        // // link
        // String url = "https://www.google.pl/?client=safari";

        // String wynik1 = name.link(url);

        // System.out.println(wynik1);

        // ip

        String ipk = "192.168.0.1";

        String wynik2 = name.ip(ipk);

        System.out.println(wynik2);

    }

}