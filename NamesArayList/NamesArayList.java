package NamesArayList;

import java.util.*;

public class NamesArayList {

    public int imiona(ArrayList<String> names, int name_size) {

        ArrayList<String> imie = new ArrayList<>();

        for (String name : names) {
            if (name.length() <= name_size) {
                imie.add(name);
            }
        }
        return imie.size();
    }
}