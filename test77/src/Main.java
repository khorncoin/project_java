
public class Main {
    public static void main(String[] args) {
        System.out.println(isPorcupine(139));
    }
    public static boolean isPrime(int n) {
        boolean isPrimeFromA = true;
        for (int i = 0; i < n/2; i++) {
            if (n % i == 0) {
                isPrimeFromA = false;
            }
        }
        return isPrimeFromA;
    }
    public static int isPorcupine(int a) {
        int max = Integer.MAX_VALUE;
        int number = 0;
        a++;
        while (isPrime(a) && a %10 ==9) {
            for (int i = a; i < max; i++) {
                if (isPrime(i) && i %10 != 9) { // next prime number
                    //    isPorcupine = false;
                    System.out.println(i);
                    number = i;
                    break;
                }
                // isPorcupine = true;
                break;
            }
            a++;
        }
        return number;
    }
}