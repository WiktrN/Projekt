package Url;

public class UrlMain {
    public static void main(String[] args) {

        Url name = new Url();

        // link
        String url = "https://www.google.pl/?client=safari";

        String wynik1 = name.link(url);

        System.out.println(wynik1);

        // ip

        String ipk = "192.168.0.1";

        String wynik2 = name.ip(ipk);

        System.out.println(wynik2);

        // ip2

        String wynik3 = name.ip2(ipk);

        System.out.println(wynik3);

    }

}