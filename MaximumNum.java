package Generics.Refactor1;

public class MaximumNum {
    public static void main(String[] args) {
        System.out.println("Maximum is ");
        Integer a = 10, b = 20, c =30;
        Float x = 10.5f, y = 15.7f, z = 5.3f;
        String j = "Apple", k = "peach" , l = "Banana";

        MaximumNum.getMaximum(a, b, c);
        MaximumNum.getMaximum(x, y, z);
        MaximumNum.getMaximum(j, k, l);
    }

    private static <T extends Comparable> void getMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(a) > 0) {
            max = c;
        }
        System.out.println("Maximum="+max);
    }
}

