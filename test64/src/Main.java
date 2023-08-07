public class Main {
    public static void main(String[] args) {
        System.out.println(eval(2.0,new int[]{4, 0, 9}));

    }

    public static double eval(double x, int [] a ) {

        int len = a.length;
        double evalTotal = 0.0 ;

        for(int i=len-1;i>=0;i--){

            evalTotal += a[i]*(Math.pow(x,i));

        }

        return evalTotal;
    }
}