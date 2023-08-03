public class Main {
    public static void main(String[] args) {
        System.out.println(isNPrimeable(new int[]{},2));
    }
    public static int isNPrimeable(int [] a, int n){
        int len = a.length;

        if(len == 0) return 1;

        for(int i=0;i<len;i++){
            if(!isPrime(a[i]+n)){
                return 0;
            }
        }

        return 1;
    }
    public static boolean isPrime(int n) {
        if (n<= 1) {
            return false;
        }
        for (int i = 2; i< n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}