package NamesV2;

public class NamesV2 {
    String id;

    public NamesV2(String dupa) {
        this.id = dupa;
    }

    public NamesV2() {
    }

    public int shortnames(String[] names, int name_size) {
        int suma = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() <= name_size) {
                System.out.println("This name lenght is good: " + names[i]);
                suma++;
            } else {
                System.out.println("This name lenght is bad: " + names[i]);
            }
        }
        return suma;
    }
}