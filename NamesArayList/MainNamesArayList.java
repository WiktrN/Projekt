package NamesArayList;

import java.util.*;

public class MainNamesArayList {
    public static void main(String args[]) {

        int name_size = 5;

        NamesArayList im = new NamesArayList();

        ArrayList<String> names = new ArrayList<String>();

        names.add("Mateusz");
        names.add("Hubert");
        names.add("Kris");
        names.add("Iwo");
        names.add("Adam");

        ArrayList<String> imiona_ = im.imiona(names, name_size);

        for (String imionaa : imiona_) {
            System.out.println(imionaa);
        }
    }
}