package Generics.UC2;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("maximum Number is- ");
        Float x = 10.5f, y = 15.7f, z = 5.3f;

        testMaximum(x, y, z);
    }

    private static void testMaximum(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(x) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println(max);
    }
}
