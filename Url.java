import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Url {
    // public String link(String url) {

    //     String re = "(https)://([^/?]+)([^?]*)(\\?.*)";

    //     Pattern pt = Pattern.compile(re);
    //     Matcher mt = pt.matcher(url);

    //     boolean result1 = mt.matches();
    //     System.out.println(result1);

    //     return url;

    // }

    public String ip(String ipk) {

        String re = "(\\d{1,3})([.]\\d{1,3})([.]\\d{1,3})([.]\\d{1,3})";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(ipk);

        boolean result2 = mt.matches();
        System.out.println(result2);

        return ipk;
    }

}