public class MainNames {
    public static void main(String[] args) {
        String[] names = { "Adam", "Szymon", "Ivo", "Kacper" };
        Names name = new Names();

        String[] short_names = name.shortnames(names);
        for (String namee : short_names) {
            System.out.println(namee);
        }
    }
}