package Generics.UC4;

    public class MaximumNum <T>{
        public static <T extends  Comparable <T>>  T maximumValue( T val1 , T val2, T val3 ,T val4,T val5) {
            T max = val1;
            if (val2.compareTo(max) > 0 ) {
                max = val2;
            } if (val3.compareTo(max) > 0){
                max = val3;
            }if (val4.compareTo(max) > 0 ){
                max = val4;
            }if (val5.compareTo(max) > 0){
                max = val5;
            }
            return max;
        }
        public static void main(String[] args) {

            System.out.println( "The maximum value is="+maximumValue(5,7,8,11,3));
        }
}
