package Names;

public class Names {

    public String[] shortnames(String[] names, int name_size) {

        String[] short_names = new String[names.length];
        int j = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() <= name_size) {
                System.out.println("This name lenght is good: " + names[i]);
                short_names[j] = names[i];
                j++;
            } else {
                System.out.println("This name lenght is bad: " + names[i]);
            }
        }
        return short_names;
    }
}