package Generics.Refactor2;

    public class MaximumNum <T extends Comparable>{
        T var1, var2, var3;
        public MaximumNum(T var1, T var2, T var3) {
            this.var1 = var1;
            this.var2 = var2;
            this.var3 = var3;
        }
        public static void main(String[] args) {
            System.out.println("Maximum is");
            Integer a = 10, b = 20, c = 30;
            Float x = 10.5f, y = 15.7f, z = 5.3f;
            String j = "Apple", k = "peach" , l = "Banana";

            new MaximumNum<>(a, b, c).max();
            new MaximumNum<>(x, y, z).max();
            new MaximumNum<>(j, k, l).max();
        }

        private void max() {
            // TODO Auto-generated method stub
            MaximumNum.getMaximum(var1, var2, var3);
        }
        private static <T extends Comparable> void getMaximum(T a, T b, T c) {
            T max = a;
            if (b.compareTo(a) > 0) {
                max = b;
            }
            if (c.compareTo(a) > 0) {
                max = c;
            }
            System.out.println("Maximum="+ max);
        }
    }
