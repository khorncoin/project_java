import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(computeHMS(0 ));
    }

    public static String computeHMS(int seconds) {

        int[] arrayHMS = new  int[3];
        int h = 0;
        int m = 0;
        int s = 0;
        int numberM =0;
        int numberSeconds = 0;

        for (int i=1;i<=seconds;i++){

            if(seconds - i * 3600 >0){

                h = i;

                numberM = seconds - i * 3600;
            }
            if(numberM != 0){
                if (numberM - i *60 >0) {
                    m = i;
                    numberSeconds = numberM - i* 60;

                }

            }
            else {
                if (seconds - i *60 >0) {
                    m = i;
                    numberSeconds = seconds - i* 60;

                }
            }
            if(numberSeconds != 0){
                s = numberSeconds;
            }
            else if(numberM != 0) {
                s = numberM;
            }
            else {
                s = seconds;
            }


        }
        System.out.println(h);
        System.out.println(m);
        System.out.println(s);

        arrayHMS = new int[]{h,m,s};

        return Arrays.toString(arrayHMS);
    }


}