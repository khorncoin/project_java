public class Main {
    public static void main(String[] args) {
        System.out.println(isFactorialPrime(127));
    }
    public static int isFactorialPrime(int n){
        int isFactorialPrime = 0;
        int number = 1;

        if(n<1) return 0;
        if(n==1) return 1;
        if (isPrime(n)){
            for(int i=1;i<n;i++){
                number *=i;
                if(number+1==n){
                    return  1;
                }
            }
        }
        return isFactorialPrime;
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