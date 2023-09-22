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

    // public String ip(String ipk) {

    //     String re = "(\\d{1,3})([.]\\d{1,3})([.]\\d{1,3})([.]\\d{1,3})";

    //     Pattern pt = Pattern.compile(re);
    //     Matcher mt = pt.matcher(ipk);

    //     boolean result = mt.matches();
    //     System.out.println(result);

    //     return ipk;
    // }

    public String ip2(String ipk) {

        String re = "(\\d{1,3})[.](\\d{1,3})[.](\\d{1,3})[.](\\d{1,3})";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(ipk);

        boolean result = mt.matches();
        System.out.println(result);

        System.out.println(mt.group(0));
        System.out.println(mt.group(1));
        System.out.println(mt.group(2));
        System.out.println(mt.group(3));
        System.out.println(mt.group(4));
        
        return ipk;
    }

}