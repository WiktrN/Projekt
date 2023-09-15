package NamesArayList;

import java.util.*;

public class MainArayList {
    public static void main(String args[]) {

        int name_size = 5;

        NamesArayList im = new NamesArayList();

        ArrayList<String> names = new ArrayList<String>();

        names.add("Mateusz");
        names.add("Hubert");
        names.add("Kris");
        names.add("Iwo");
        names.add("Adam");

        int liczbaImion = im.imiona(names, name_size);
        System.out.println(liczbaImion);
        
        // for (String imionaa : imionax) {
        //     System.out.println(imionaa);
        // }ś
    }
}