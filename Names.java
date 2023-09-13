public class Names {
    public String[] shortnames(String[] names) {
        String[] short_names = new String[5];
        int j = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() < 5) {
                System.out.println("This name lenght is good: " + names[i]);
                short_names[j] = names[i];
                j++;
            } else {
                System.out.println("This name is to long: " + names[i]);
            }
        }
        return short_names;
    }
}
