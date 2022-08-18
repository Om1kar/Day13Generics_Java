package Generics;


    public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Maximum Number is- ");
        Integer a = 10, b = 20, c = 30;
        testMaximum(a,b,c);
    }

        private static void testMaximum(Integer a, Integer b, Integer c) {
            Integer max = a;

            if (b.compareTo(a) > 0) {
                max = b;
            }
            if (c.compareTo(max) > 0) {
                max = c;
            }

            System.out.println("Maximum num is:" + max);
        }
    }

