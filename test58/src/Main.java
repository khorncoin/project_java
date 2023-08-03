public class Main {
    public static void main(String[] args) {
        System.out.println(isSquare(-4));
    }

    public static int isSquare(int n){
        if(n<=0) return 0;

        double pow =0;

        for(int i=1;i<n;i++){
           pow = Math.pow(i,2);
           if(pow==n) return 1;
        }


        return 0;
    }
}