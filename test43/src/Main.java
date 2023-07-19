public class Main {
    public static void main(String[] args) {

        System.out.println(isHodder(31));

    }

    static int isHodder(int n) {
        if (isPrime(n)) {
            double pow = 0;
            int j = 1;
            while (pow < n) {
                pow = Math.pow(2, j) - 1;
                if (pow == n) {
                    return j;
                }
                j++;
            }
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