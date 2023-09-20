public class TereFere {
    public static void main(String[] args) {

        int inDigit = 20;

        if ((inDigit % 3 == 0) && (inDigit % 5 == 0)) {
            System.out.println("TereFere");
        }
        else if (inDigit % 5 == 0) {
            System.out.println("Fere");
        }
        else if (inDigit % 3 == 0) {
            System.out.println("Tere");
        } else {
            System.out.println("Can't make it");
        }

    }

}