import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(pairwiseSum(new int[]{2, 1, 18, -5, -5, -15, 0, 0, 1, -1}));

    }

   public static String pairwiseSum(int[] a){
        int len = a.length;
       if(len%2 !=0 || len ==0) return "null";
       int[] arrayString = new int[len/2];
       int m=0;
       int n =1;
       for(int i=0;i<len;i++){

           if(n<len){
               arrayString[i] = a[m]+a[n];
           }

           m+=2;
           n+=2;
       }

        return Arrays.toString(arrayString);
   }

}