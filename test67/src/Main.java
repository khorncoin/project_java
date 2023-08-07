import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(updateMileageCounter(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9} ,13));
    }

    public static String updateMileageCounter(int [] a, int miles) {

        int len = a.length;
        int[] arrayMileageCounter = new int[len];
        int sum = miles;
        int n = 0;
        for(int i =0;i<len;i++){

            n = (a[i]+sum) /10;
            if(n>0){
                arrayMileageCounter[i]=(a[i]+sum)-(n*10);
                sum =n;
            }
            else {
                arrayMileageCounter[i]=a[i]+sum;
                sum =0;
            }

        }

        return Arrays.toString(arrayMileageCounter);

    }

}