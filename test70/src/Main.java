
public class Main {
    public static void main(String[] args) {
        System.out.println(isTwinPrime(9));

    }


    public static int isTwinPrime (int n){


        if(isPrime(n)){


            if(isPrime(n-2)||isPrime(n+2)) return 1;


        }


        return 0;
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