
public class Main {
    public static void main(String[] args) {

        System.out.println(primeCount(-10,6));
    }

    public static int primeCount(int start, int end){

        int primeCount = 0;
        for(int i = start; i <=end;i++){
            if(isPrime(i)) primeCount++;
        }
        return primeCount;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}