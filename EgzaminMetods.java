public class EgzaminMetods {

    public boolean xyz(String xyzThere) {

        String a = "xyz";

        String a1 = ".xyz";

        for (int i = 0; i < xyzThere.length(); i++) {

            if (xyzThere.contains(a1)) {
                return false;
            } else if (xyzThere.contains(a)) {
                return true;
            }

        }
        return false;

    }

    public String chocolate(String repeatFront, int num) {

        String nowy = "";

        for (int i = num; i > 0; i--) {
            nowy += repeatFront.substring(0, i);
        }
        return nowy;
    }

    public String zipAndZap(String zipZap) {
        return zipZap.replace("zip", "zp").replace("zap", "zp");
    }

    public boolean evenlySpaced(int a1, int b1, int c1) {

        int wartosc1;
        int wartosc2;

        wartosc1 = a1 - b1;
        wartosc2 = b1 - c1;

        if (wartosc1 == wartosc2) {
            return true;
        } else {
            return false;
        }

    }

    public int makeChocolate(int a2, int b2, int c2) {

        int small = 1;
        int big = 5;

        int suma1 = a2 + b2 + c2;

        int reszta = 0;

        int smallBars = 0;

        for (int i = 0; i < suma1;) {
            if (suma1 % big > reszta) {
                reszta = suma1 % big;
                for (int j = 0; j < reszta; j++) {
                    if (reszta % small == 0) {
                        smallBars++;
                    }
                }
                return smallBars;

            } else {
                return -1;
            }

        }
        return 000;
    }

    public int luckySum(int a3, int b3, int c3) {

        int wynikSum = 0;

        if (a3 == 13) {
            wynikSum = 0;
        } else if (b3 == 13) {
            wynikSum = a3;
        } else if (c3 == 13) {
            wynikSum = a3 + b3;
        } else {
            wynikSum = a3 + b3 + c3;
        }
        return wynikSum;

    }

    public String mirrorEnds(String text) {

        StringBuilder mirror = new StringBuilder();

        int left = 0;

        int right = text.length() - 1;

        while (left < text.length() && right >= 0) {
            if (text.charAt(left) == text.charAt(right)) {
                mirror.append(text.charAt(left));
                left++;
                right--;
            } else {
                break;
            }

        }
        return mirror.toString();
    }

    public int[] fix34(int[] nums) {

        int i = 0;
        int j;

        while (i < nums.length && nums[i] != 3) {
            i++;
        }

        j = i + 1;

        while (i < nums.length) {
            if (nums[i] == 3) {
                while (nums[j] != 4) {
                    j++;
                }
                int temp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = temp;
            }
            i++;
        }
        return nums;
    }

    public int countClumps(int[] clump) {

        int clumps = 0;

        for (int i = 0; i < clump.length - 1; i++) {

            if (clump[i] == clump[i + 1]) {

                while (clump[i] == clump[i + 1] && i < clump.length - 2) {
                    i++;
                }

                clumps++;
            }

        }
        return clumps;
    }

}