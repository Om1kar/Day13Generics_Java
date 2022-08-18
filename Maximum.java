package Generics.UC3;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Maximum String is- ");
        String j = "Apple", k = "Peach" , l = "Banana";
        testMaximum(j, k, l); 	}
    private static void testMaximum(String j,String k,String l) {
        String max = j;
        if (k.compareTo(j) > 0) {
            max = k;
        }
        if (l.compareTo(j) > 0) {
            max = l;
        }
        System.out.println(max);
    }
}

