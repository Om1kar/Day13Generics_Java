package Generics.UC5;

    public class MaximumNum<T extends Comparable<T>> {
        T val1, val2, val3, val4, val5;

        public MaximumNum(T val1, T val2, T val3, T val4, T val5) {
            this.val1 = val1;
            this.val2 = val2;
            this.val3 = val3;
            this.val4 = val4;
            this.val5 = val5;
        }

        public T maximumValue() {
            return maximumValue(val1, val2, val3, val4, val5); // return value

        }

        public static <T extends Comparable<T>> T maximumValue(T val1, T val2,
                                                               T val3, T val4, T val5) {

            T max = val1;
            if (val2.compareTo(max) > 0) {
                max = val2;
            }
            if (val3.compareTo(max) > 0) {
                max = val3;
            }
            if (val4.compareTo(max) > 0) {
                max = val4;
            }
            if (val5.compareTo(max) > 0) {
                max = val5;
            }
            MaximumNum.printMax(val1, val2, val3, val4, val5, max);
            return max;
        }

        private static <T> void printMax(T val1, T val2, T val3, T val4, T val5, T max) {
            System.out.println("The maximum of " + val1 + "," + val2 + "," + val3 + "," + val4 + "," + val5
                    + "=" + max);
        }

        public static void main(String[] args) {

            maximumValue(5, 7, 8, 11, 3);
            maximumValue(5.5f, 2.2f, 1.7f, 9.9f, 4.7f);
            new MaximumNum<>(5, 7, 8, 11, 3).maximumValue();
        }
    }



