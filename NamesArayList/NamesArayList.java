package NamesArayList;

import java.util.*;

public class NamesArayList {

    public ArrayList<String> imiona(ArrayList<String> names, int name_size) {

        ArrayList<String> imiona_ = new ArrayList<>();

        for (String name : names) {
            if (name.length() <= name_size) {
                System.out.println("Name " + name + " is good length");
            } else {
                System.out.println("Name " + name + " is bad length");
            }
        }
        return imiona_;
    }
}