package Names;

public class MainNames {

    public static void main(String[] args) {
        String[] names = { "Adam", "Szymon", "Ivo", "Kacper" };

        Names name = new Names();

        int name_size = 3;

        String[] short_names = name.shortnames(names, name_size);

        for (String namee : short_names) {
            System.out.println(namee);
        }
    }
}