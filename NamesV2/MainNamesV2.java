package NamesV2;
public class MainNamesV2 {

    public static void main(String[] args) {
        String[] names = { "Adam", "Szymon", "Ivo", "Kacper" };
        NamesV2 name = new NamesV2();

        int name_size = 4;

        int wynik = name.shortnames(names, name_size);

        System.out.println(wynik);
    }
}